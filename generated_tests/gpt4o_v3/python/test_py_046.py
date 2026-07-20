import pytest
import warnings
from flask import Flask

class TestFlaskInitSubclass:
    
    def test_init_subclass_with_overridden_method_missing_ctx(self):
        class SubFlask(Flask):
            def handle_http_exception(self, e):
                return str(e)

        with pytest.warns(DeprecationWarning, match="The 'handle_http_exception' method now takes 'ctx: AppContext'"):
            SubFlask.__init_subclass__()

        assert hasattr(SubFlask, 'handle_http_exception')

    def test_init_subclass_with_overridden_method_with_ctx(self):
        class SubFlask(Flask):
            def handle_http_exception(self, e, ctx):
                return str(e)

        SubFlask.__init_subclass__()
        assert hasattr(SubFlask, 'handle_http_exception')

    def test_init_subclass_with_multiple_overridden_methods(self):
        class SubFlask(Flask):
            def handle_user_exception(self, e):
                return str(e)

            def handle_exception(self, e, ctx):
                return str(e)

        with pytest.warns(DeprecationWarning, match="The 'handle_user_exception' method now takes 'ctx: AppContext'"):
            SubFlask.__init_subclass__()

        assert hasattr(SubFlask, 'handle_user_exception')
        assert hasattr(SubFlask, 'handle_exception')

    def test_init_subclass_with_no_overridden_methods(self):
        class SubFlask(Flask):
            pass

        SubFlask.__init_subclass__()
        assert not hasattr(SubFlask, 'handle_http_exception')

    def test_init_subclass_with_invalid_method_signature(self):
        class SubFlask(Flask):
            def log_exception(self, e):
                return str(e)

        with pytest.warns(DeprecationWarning, match="The 'log_exception' method now takes 'ctx: AppContext'"):
            SubFlask.__init_subclass__()

        assert hasattr(SubFlask, 'log_exception')