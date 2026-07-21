    def __init__(
        self,
        method: str | None = None,
        url: _t.UriType | None = None,
        headers: _t.HeadersType = None,
        files: _t.FilesType = None,
        data: _t.DataType = None,
        params: _t.ParamsType = None,
        auth: _t.AuthType = None,
        cookies: RequestsCookieJar | CookieJar | dict[str, str] | None = None,
        hooks: _t.HooksInputType | None = None,
        json: _t.JsonType = None,
    ) -> None:
        # Default empty dicts for dict params.
        data = [] if data is None else data
        files = [] if files is None else files
        headers = {} if headers is None else headers
        params = {} if params is None else params
        hooks = {} if hooks is None else hooks

        self.hooks = default_hooks()
        for k, v in list(hooks.items()):
            self.register_hook(event=k, hook=v)

        self.method = method
        self.url = url
        self.headers = headers
        self.files = files
        self.data = data
        self.json = json
        self.params = params
        self.auth = auth
        self.cookies = cookies
