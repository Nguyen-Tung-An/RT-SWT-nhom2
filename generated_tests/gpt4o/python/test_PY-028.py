import pytest
from flask.views import MethodView

class TestInitSubclass(MethodView):
    pass

def test_init_subclass_no_methods():
    class SubClassWithoutMethods(TestInitSubclass):
        pass

    assert not hasattr(SubClassWithoutMethods, 'methods')

def test_init_subclass_with_methods():
    class BaseClassWithMethods(MethodView):
        methods = {'GET'}

    class SubClassWithMethods(BaseClassWithMethods):
        pass

    assert SubClassWithMethods.methods == {'GET'}

def test_init_subclass_inherits_methods():
    class BaseClassWithMethods(MethodView):
        methods = {'POST'}

    class SubClassInheritsMethods(BaseClassWithMethods):
        pass

    assert SubClassInheritsMethods.methods == {'POST'}

def test_init_subclass_adds_http_method():
    class SubClassWithHttpMethod(MethodView):
        GET = True

    class SubClassWithMethods(SubClassWithHttpMethod):
        pass

    assert SubClassWithMethods.methods == {'GET'}

def test_init_subclass_combines_methods():
    class BaseClassWithMethods(MethodView):
        methods = {'PUT'}

    class SubClassWithHttpMethod(MethodView):
        POST = True

    class CombinedSubClass(BaseClassWithMethods, SubClassWithHttpMethod):
        pass

    assert CombinedSubClass.methods == {'PUT', 'POST'}