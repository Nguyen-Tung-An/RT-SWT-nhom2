import pytest
from flask.cli import FlaskGroup

def test_init_with_default_params():
    group = FlaskGroup(add_default_commands=True, create_app=None, add_version_option=True, load_dotenv=True, set_debug_flag=True)
    assert group.add_default_commands is True
    assert group.create_app is None
    assert group.add_version_option is True
    assert group.load_dotenv is True
    assert group.set_debug_flag is True

def test_init_with_custom_params():
    def dummy_app():
        pass

    group = FlaskGroup(add_default_commands=False, create_app=dummy_app, add_version_option=False, load_dotenv=False, set_debug_flag=False)
    assert group.add_default_commands is False
    assert group.create_app == dummy_app
    assert group.add_version_option is False
    assert group.load_dotenv is False
    assert group.set_debug_flag is False

def test_init_with_extra_params():
    group = FlaskGroup(add_default_commands=True, create_app=None, add_version_option=True, load_dotenv=True, set_debug_flag=True, param1='value1', param2='value2')
    assert 'param1' in group.extra
    assert group.extra['param1'] == 'value1'
    assert 'param2' in group.extra
    assert group.extra['param2'] == 'value2'
    assert 'context_settings' in group.extra
    assert group.extra['context_settings']['auto_envvar_prefix'] == 'FLASK'