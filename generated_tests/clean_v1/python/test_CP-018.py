import pytest
from flask import Flask, request
from werkzeug.exceptions import BadRequestKeyError, HTTPException
from flask.app import AppContext, handle_user_exception

app = Flask(__name__)

@app.errorhandler(HTTPException)
def handle_http_exception(e):
    return f"HTTP Exception: {e}", e.code

def test_handle_user_exception_bad_request_key_error():
    ctx = AppContext(app)
    ctx.push()
    e = BadRequestKeyError('bad_key')
    app.debug = True
    app.config["TRAP_BAD_REQUEST_ERRORS"] = True
    response = handle_user_exception(ctx, e)
    assert response is None
    ctx.pop()

def test_handle_user_exception_http_exception():
    ctx = AppContext(app)
    ctx.push()
    e = HTTPException('HTTP Error', response='Error Response', code=400)
    app.trap_http_exception = lambda e: False
    response = handle_user_exception(ctx, e)
    assert response == ("HTTP Exception: HTTP Error", 400)
    ctx.pop()

def test_handle_user_exception_no_handler():
    ctx = AppContext(app)
    ctx.push()
    e = Exception('Generic Exception')
    with pytest.raises(Exception):
        handle_user_exception(ctx, e)
    ctx.pop()

def test_handle_user_exception_with_handler():
    ctx = AppContext(app)
    ctx.push()
    
    def custom_error_handler(e):
        return f"Handled: {str(e)}", 500

    app.register_error_handler(Exception, custom_error_handler)
    e = Exception('Handled Exception')
    response = handle_user_exception(ctx, e)
    assert response == ("Handled: Handled Exception", 500)
    
    ctx.pop()