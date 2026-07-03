from __future__ import annotations

def __init__(
    self,
    add_default_commands: bool = True,
    create_app: t.Callable[..., Flask] | None = None,
    add_version_option: bool = True,
    load_dotenv: bool = True,
    set_debug_flag: bool = True,
    **extra: t.Any,
) -> None:
    params: list[click.Parameter] = list(extra.pop("params", None) or ())
    # Processing is done with option callbacks instead of a group
    # callback. This allows users to make a custom group callback
    # without losing the behavior. --env-file must come first so
    # that it is eagerly evaluated before --app.
    params.extend((_env_file_option, _app_option, _debug_option))

    if add_version_option:
        params.append(version_option)

    if "context_settings" not in extra:
        extra["context_settings"] = {}

    extra["context_settings"].setdefault("auto_envvar_prefix", "FLASK")

    super().__init__(params=params, **extra)

    self.create_app = create_app
    self.load_dotenv = load_dotenv
    self.set_debug_flag = set_debug_flag

    if add_default_commands:
        self.add_command(run_command)
        self.add_command(shell_command)
        self.add_command(routes_command)

    self._loaded_plugin_commands = False
