from __future__ import annotations

def pop(self, exc: BaseException | None = None) -> None:
    """Pop this context so that it is no longer the active context. Then
    call teardown functions and signals.

    Typically, this is not used directly. Instead, use a ``with`` block
    to manage the context.

    This context must currently be the active context, otherwise a
    :exc:`RuntimeError` is raised. In some situations, such as streaming or
    testing, the context may have been pushed multiple times. It will only
    trigger cleanup once it has been popped as many times as it was pushed.
    Until then, it will remain the active context.

    :param exc: An unhandled exception that was raised while the context was
        active. Passed to teardown functions.

    .. versionchanged:: 0.9
        Added the ``exc`` argument.
    """
    if self._cv_token is None:
        raise RuntimeError(f"Cannot pop this context ({self!r}), it is not pushed.")

    ctx = _cv_app.get(None)

    if ctx is None or self._cv_token is None:
        raise RuntimeError(
            f"Cannot pop this context ({self!r}), there is no active context."
        )

    if ctx is not self:
        raise RuntimeError(
            f"Cannot pop this context ({self!r}), it is not the active"
            f" context ({ctx!r})."
        )

    self._push_count -= 1

    if self._push_count > 0:
        return

    collect_errors = _CollectErrors()

    if self._request is not None:
        with collect_errors:
            self.app.do_teardown_request(self, exc)

        with collect_errors:
            self._request.close()

    with collect_errors:
        self.app.do_teardown_appcontext(self, exc)

    _cv_app.reset(self._cv_token)
    self._cv_token = None

    with collect_errors:
        appcontext_popped.send(self.app, _async_wrapper=self.app.ensure_sync)

    collect_errors.raise_any("Errors during context teardown")
