import pytest
from flask.app import wsgi_app

def test_wsgi_app_successful_response(mocker):
    environ = {'REQUEST_METHOD': 'GET'}
    start_response = mocker.Mock()
    app = mocker.Mock()
    app.request_context.return_value.push = mocker.Mock()
    app.full_dispatch_request.return_value = lambda environ, start_response: start_response('200 OK', [])
    
    response = app.wsgi_app(environ, start_response)
    
    assert response == '200 OK'
    start_response.assert_called_once_with('200 OK', [])

def test_wsgi_app_exception_handling(mocker):
    environ = {'REQUEST_METHOD': 'GET'}
    start_response = mocker.Mock()
    app = mocker.Mock()
    app.request_context.return_value.push = mocker.Mock()
    app.full_dispatch_request.side_effect = Exception("Test Exception")
    app.handle_exception.return_value = lambda environ, start_response: start_response('500 Internal Server Error', [])
    
    response = app.wsgi_app(environ, start_response)
    
    assert response == '500 Internal Server Error'
    start_response.assert_called_once_with('500 Internal Server Error', [])

def test_wsgi_app_unhandled_exception(mocker):
    environ = {'REQUEST_METHOD': 'GET'}
    start_response = mocker.Mock()
    app = mocker.Mock()
    app.request_context.return_value.push = mocker.Mock()
    app.full_dispatch_request.side_effect = ValueError("Unhandled Exception")
    
    with pytest.raises(ValueError):
        app.wsgi_app(environ, start_response)

def test_wsgi_app_preserve_context(mocker):
    environ = {
        'REQUEST_METHOD': 'GET',
        'werkzeug.debug.preserve_context': mocker.Mock()
    }
    start_response = mocker.Mock()
    app = mocker.Mock()
    app.request_context.return_value.push = mocker.Mock()
    app.full_dispatch_request.return_value = lambda environ, start_response: start_response('200 OK', [])
    
    response = app.wsgi_app(environ, start_response)
    
    assert response == '200 OK'
    environ['werkzeug.debug.preserve_context'].assert_called_once()