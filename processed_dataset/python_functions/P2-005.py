from __future__ import annotations

def run_command(
    info: ScriptInfo,
    host: str,
    port: int,
    reload: bool,
    debugger: bool,
    with_threads: bool,
    cert: ssl.SSLContext | tuple[str, str | None] | t.Literal["adhoc"] | None,
    extra_files: list[str] | None,
    exclude_patterns: list[str] | None,
) -> None:
    """Run a local development server.

    This server is for development purposes only. It does not provide
    the stability, security, or performance of production WSGI servers.

    The reloader and debugger are enabled by default with the '--debug'
    option.
    """
    try:
        app: WSGIApplication = info.load_app()  # pyright: ignore
    except Exception as e:
        if is_running_from_reloader():
            # When reloading, print out the error immediately, but raise
            # it later so the debugger or server can handle it.
            traceback.print_exc()
            err = e

            def app(
                environ: WSGIEnvironment, start_response: StartResponse
            ) -> cabc.Iterable[bytes]:
                raise err from None

        else:
            # When not reloading, raise the error immediately so the
            # command fails.
            raise e from None

    debug = get_debug_flag()

    if reload is None:
        reload = debug

    if debugger is None:
        debugger = debug

    show_server_banner(debug, info.app_import_path)

    run_simple(
        host,
        port,
        app,
        use_reloader=reload,
        use_debugger=debugger,
        threaded=with_threads,
        ssl_context=cert,
        extra_files=extra_files,
        exclude_patterns=exclude_patterns,
    )
