import pytest
from flask.testing import open
from werkzeug.test import EnvironBuilder
from flask import Flask

app = Flask(__name__)

@pytest.fixture
def client():
    with app.test_client() as client:
        yield client

def test_open_with_environ_builder(client):
    builder = EnvironBuilder(method='GET', path='/')
    response = client.open(builder)
    assert response.status_code == 200

def test_open_with_dict(client):
    response = client.open({'PATH_INFO': '/'})
    assert response.status_code == 200

def test_open_with_base_request(client):
    builder = EnvironBuilder(method='GET', path='/')
    request = builder.get_request()
    response = client.open(request)
    assert response.status_code == 200

def test_open_with_buffered(client):
    response = client.open('/', buffered=True)
    assert response.status_code == 200

def test_open_with_follow_redirects(client):
    response = client.open('/', follow_redirects=True)
    assert response.status_code == 200