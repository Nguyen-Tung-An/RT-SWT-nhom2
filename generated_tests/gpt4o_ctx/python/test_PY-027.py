import pytest
from flask.testing import FlaskClient
from werkzeug.test import EnvironBuilder

@pytest.fixture
def client():
    app = Flask(__name__)
    return app.test_client()

def test_open_with_environ_builder(client):
    builder = EnvironBuilder(path='/', method='GET')
    response = client.open(builder)
    assert response.status_code == 200

def test_open_with_dict(client):
    response = client.open({'PATH_INFO': '/'})
    assert response.status_code == 200

def test_open_with_base_request(client):
    request = client._get_current_object()
    response = client.open(request)
    assert response.status_code == 200

def test_open_with_no_args(client):
    response = client.open()
    assert response.status_code == 200

def test_open_with_buffered(client):
    response = client.open(buffered=True)
    assert response.status_code == 200

def test_open_with_follow_redirects(client):
    response = client.open(follow_redirects=True)
    assert response.status_code == 200