import pytest
from flask.views import MethodView

class TestInitSubclass(MethodView):
    methods = ['GET', 'POST']

    def get(self):
        return "GET method"

    def post(self):
        return "POST method"

class TestInitSubclassNoMethods(MethodView):
    pass

def test_init_subclass_with_methods():
    assert hasattr(TestInitSubclass, 'methods')
    assert 'GET' in TestInitSubclass.methods
    assert 'POST' in TestInitSubclass.methods

def test_init_subclass_no_methods():
    assert not hasattr(TestInitSubclassNoMethods, 'methods')