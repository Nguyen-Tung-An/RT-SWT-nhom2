import pytest
from flask.cli import __init__

def test_init_with_default_commands():
    instance = __init__(add_default_commands=True)
    assert instance.add_command.call_count == 3  # Assuming 3 commands are added

def test_init_without_default_commands():
    instance = __init__(add_default_commands=False)
    assert instance.add_command.call_count == 0

def test_init_with_custom_context_settings():
    instance = __init__(context_settings={'key': 'value'})
    assert instance.context_settings['key'] == 'value'

def test_init_with_auto_envvar_prefix():
    instance = __init__()
    assert instance.context_settings['auto_envvar_prefix'] == 'FLASK'

def test_init_with_version_option():
    instance = __init__(add_version_option=True)
    assert version_option in instance.params

def test_init_without_version_option():
    instance = __init__(add_version_option=False)
    assert version_option not in instance.params

def test_init_with_env_file_option():
    instance = __init__(params=[_env_file_option])
    assert _env_file_option in instance.params

def test_init_with_app_option():
    instance = __init__(params=[_app_option])
    assert _app_option in instance.params

def test_init_with_debug_option():
    instance = __init__(params=[_debug_option])
    assert _debug_option in instance.params