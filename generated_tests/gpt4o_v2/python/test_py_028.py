import pytest
from flask.views import MethodView

class TestMethodViewSubclass(MethodView):
    def get(self):
        return "GET method"

    def post(self):
        return "POST method"

class TestInitSubclass:
    def test_init_subclass_no_methods(self):
        class SubClassWithoutMethods(MethodView):
            pass

        SubClassWithoutMethods.__init_subclass__()
        assert not hasattr(SubClassWithoutMethods, 'methods')

    def test_init_subclass_with_methods(self):
        class SubClassWithMethods(MethodView):
            def get(self):
                return "GET method"

        SubClassWithMethods.__init_subclass__()
        assert hasattr(SubClassWithMethods, 'methods')
        assert SubClassWithMethods.methods == {'GET'}

    def test_init_subclass_inherits_methods(self):
        class BaseClass(MethodView):
            def get(self):
                return "GET method"

        class SubClass(BaseClass):
            def post(self):
                return "POST method"

        SubClass.__init_subclass__()
        assert hasattr(SubClass, 'methods')
        assert SubClass.methods == {'GET', 'POST'}

    def test_init_subclass_with_multiple_bases(self):
        class BaseClass1(MethodView):
            def get(self):
                return "GET method"

        class BaseClass2(MethodView):
            def post(self):
                return "POST method"

        class SubClass(BaseClass1, BaseClass2):
            pass

        SubClass.__init_subclass__()
        assert hasattr(SubClass, 'methods')
        assert SubClass.methods == {'GET', 'POST'}

    def test_init_subclass_with_existing_methods(self):
        class SubClassWithExistingMethods(MethodView):
            methods = {'PUT'}

            def put(self):
                return "PUT method"

        SubClassWithExistingMethods.__init_subclass__()
        assert hasattr(SubClassWithExistingMethods, 'methods')
        assert SubClassWithExistingMethods.methods == {'PUT'}