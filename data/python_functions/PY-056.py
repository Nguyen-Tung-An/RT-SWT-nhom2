from __future__ import annotations
import sys

def handle_url_build_error(
    self, error: BuildError, endpoint: str, values: dict[str, t.Any]
) -> str:
    """Called by :meth:`.url_for` if a
    :exc:`~werkzeug.routing.BuildError` was raised. If this returns
    a value, it will be returned by ``url_for``, otherwise the error
    will be re-raised.

    Each function in :attr:`url_build_error_handlers` is called with
    ``error``, ``endpoint`` and ``values``. If a function returns
    ``None`` or raises a ``BuildError``, it is skipped. Otherwise,
    its return value is returned by ``url_for``.

    :param error: The active ``BuildError`` being handled.
    :param endpoint: The endpoint being built.
    :param values: The keyword arguments passed to ``url_for``.
    """
    for handler in self.url_build_error_handlers:
        try:
            rv = handler(error, endpoint, values)
        except BuildError as e:
            # make error available outside except block
            error = e
        else:
            if rv is not None:
                return rv

    # Re-raise if called with an active exception, otherwise raise
    # the passed in exception.
    if error is sys.exc_info()[1]:
        raise

    raise error
