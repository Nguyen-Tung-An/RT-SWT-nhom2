import flask
from flask.testing import FlaskClient

def test_open_with_environ_builder():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        client = FlaskClient(app)
        builder = flask.wrappers.Request.environ
        response = client.open(builder)
        assert response is not None

def test_open_with_dict():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        client = FlaskClient(app)
        response = client.open({'PATH_INFO': '/'})
        assert response is not None

def test_open_with_base_request():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        client = FlaskClient(app)
        request = flask.Request(flask.wrappers.Request.environ)
        response = client.open(request)
        assert response is not None

def test_open_with_no_args():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        client = FlaskClient(app)
        response = client.open()
        assert response is not None

def test_open_with_buffered():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        client = FlaskClient(app)
        response = client.open(buffered=True)
        assert response is not None

def test_open_with_follow_redirects():
    app = flask.Flask('test_app')
    with app.test_request_context('/'):
        client = FlaskClient(app)
        response = client.open(follow_redirects=True)
        assert response is not None