import pytest
import flask
from flask.cli import FlaskGroup

class TestFlaskGroupInit:
    def test_init_with_default_params(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            group = FlaskGroup()
            assert group.create_app is None
            assert group.load_dotenv is True
            assert group.set_debug_flag is True

    def test_init_with_custom_create_app(self):
        def custom_create_app():
            return flask.Flask('custom_app')
        
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            group = FlaskGroup(create_app=custom_create_app)
            assert group.create_app == custom_create_app

    def test_init_with_add_default_commands_false(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            group = FlaskGroup(add_default_commands=False)
            assert not group._loaded_plugin_commands

    def test_init_with_add_version_option_false(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            group = FlaskGroup(add_version_option=False)
            assert version_option not in group.params

    def test_init_with_extra_params(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            group = FlaskGroup(param1='value1', param2='value2')
            assert 'param1' in group.extra
            assert group.extra['param1'] == 'value1'
            assert 'param2' in group.extra
            assert group.extra['param2'] == 'value2'

    def test_init_with_context_settings(self):
        app = flask.Flask('test_app')
        with app.test_request_context('/'):
            group = FlaskGroup(context_settings={'help': True})
            assert group.extra['context_settings']['help'] is True
            assert group.extra['context_settings']['auto_envvar_prefix'] == 'FLASK'