    def full_dispatch_request(self, ctx: AppContext) -> Response:
        """Dispatches the request and on top of that performs request
        pre and postprocessing as well as HTTP exception catching and
        error handling.

        .. versionadded:: 0.7
        """
        if not self._got_first_request and self.should_ignore_error is not None:
            import warnings

            warnings.warn(
                "The 'should_ignore_error' method is deprecated and will"
                " be removed in Flask 3.3. Handle errors as needed in"
                " teardown handlers instead.",
                DeprecationWarning,
                stacklevel=1,
            )

        self._got_first_request = True

        try:
            request_started.send(self, _async_wrapper=self.ensure_sync)
            rv = self.preprocess_request(ctx)
            if rv is None:
                rv = self.dispatch_request(ctx)
        except Exception as e:
            rv = self.handle_user_exception(ctx, e)
        return self.finalize_request(ctx, rv)
