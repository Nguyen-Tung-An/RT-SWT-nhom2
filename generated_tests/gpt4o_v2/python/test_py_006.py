import pytest
from flask.cli import FlaskGroup
from flask import Flask

class TestFlaskGroupInit:
    def test_init_with_default_parameters(self):
        group = FlaskGroup()
        assert group.create_app is None
        assert group.load_dotenv is True
        assert group.set_debug_flag is True

    def test_init_with_custom_create_app(self):
        def custom_app():
            return Flask(__name__)

        group = FlaskGroup(create_app=custom_app)
        assert group.create_app == custom_app

    def test_init_with_add_default_commands_false(self):
        group = FlaskGroup(add_default_commands=False)
        assert not group._loaded_plugin_commands

    def test_init_with_add_version_option(self):
        group = FlaskGroup(add_version_option=True)
        assert len(group.params) > 0  # Check that version_option is added

    def test_init_with_load_dotenv_false(self):
        group = FlaskGroup(load_dotenv=False)
        assert group.load_dotenv is False

    def test_init_with_set_debug_flag_false(self):
        group = FlaskGroup(set_debug_flag=False)
        assert group.set_debug_flag is False

    def test_init_with_extra_context_settings(self):
        extra_context = {"context_settings": {"key": "value"}}
        group = FlaskGroup(**extra_context)
        assert group.context_settings["key"] == "value"

    def test_init_with_params(self):
        group = FlaskGroup(params=["--test"])
        assert "--test" in [param.name for param in group.params]

    def test_init_with_no_params(self):
        group = FlaskGroup(params=None)
        assert len(group.params) > 0  # Ensure default params are added