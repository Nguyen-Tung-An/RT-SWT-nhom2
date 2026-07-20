import pytest
from flask import Flask
from flask.views import MethodView

class TestMethodViewInitSubclass:

    def test_no_methods_in_class(self):
        class TestView(MethodView):
            pass

        app = Flask('test_app')
        with app.test_request_context('/'):
            TestView.__init_subclass__()
            assert not hasattr(TestView, 'methods')

    def test_inherits_methods_from_base(self):
        class BaseView(MethodView):
            methods = {'GET'}

        class TestView(BaseView):
            pass

        app = Flask('test_app')
        with app.test_request_context('/'):
            TestView.__init_subclass__()
            assert TestView.methods == {'GET'}

    def test_adds_methods_from_http_methods(self):
        class TestView(MethodView):
            def get(self):
                pass

            def post(self):
                pass

        app = Flask('test_app')
        with app.test_request_context('/'):
            TestView.__init_subclass__()
            assert TestView.methods == {'GET', 'POST'}

    def test_combines_methods_from_base_and_http_methods(self):
        class BaseView(MethodView):
            methods = {'DELETE'}

        class TestView(BaseView):
            def get(self):
                pass

        app = Flask('test_app')
        with app.test_request_context('/'):
            TestView.__init_subclass__()
            assert TestView.methods == {'DELETE', 'GET'}

    def test_no_methods_if_no_http_methods_defined(self):
        class TestView(MethodView):
            pass

        app = Flask('test_app')
        with app.test_request_context('/'):
            TestView.__init_subclass__()
            assert not hasattr(TestView, 'methods')