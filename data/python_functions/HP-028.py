    def prepare_auth(
        self,
        auth: _t.AuthType,
        url: _t.UriType = "",
    ) -> None:
        """Prepares the given HTTP auth data."""

        # If no Auth is explicitly provided, extract it from the URL first.
        if auth is None:
            url_auth = get_auth_from_url(cast(str, self.url))
            auth = url_auth if any(url_auth) else None

        if auth:
            if isinstance(auth, tuple) and len(auth) == 2:  # type: ignore[arg-type]  # pyright widens tuple from Callable in AuthType
                # special-case basic HTTP auth
                auth_handler = HTTPBasicAuth(*auth)  # type: ignore[arg-type]  # pyright widens tuple from Callable in AuthType
            else:
                # TODO: can be fixed by flipping the conditionals
                auth_handler = cast("Callable[..., PreparedRequest]", auth)

            # Allow auth to make its changes.
            r = auth_handler(self)

            # Update self to reflect the auth changes.
            self.__dict__.update(r.__dict__)

            # Recompute Content-Length
            self.prepare_content_length(self.body)
