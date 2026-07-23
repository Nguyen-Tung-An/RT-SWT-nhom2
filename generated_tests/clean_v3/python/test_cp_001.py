import pytest
from requests.sessions import merge_hooks

def test_merge_hooks_both_none():
    result = merge_hooks(None, None)
    assert result is None

def test_merge_hooks_request_none():
    session_hooks = {'response': [lambda r, *args, **kwargs: r]}
    result = merge_hooks(None, session_hooks)
    assert result == session_hooks

def test_merge_hooks_session_none():
    request_hooks = {'response': [lambda r, *args, **kwargs: r]}
    result = merge_hooks(request_hooks, None)
    assert result == request_hooks

def test_merge_hooks_both_empty_response():
    request_hooks = {'response': []}
    session_hooks = {'response': []}
    result = merge_hooks(request_hooks, session_hooks)
    assert result == request_hooks

def test_merge_hooks_request_empty_response():
    session_hooks = {'response': [lambda r, *args, **kwargs: r]}
    request_hooks = {'response': []}
    result = merge_hooks(request_hooks, session_hooks)
    assert result == session_hooks

def test_merge_hooks_session_empty_response():
    request_hooks = {'response': [lambda r, *args, **kwargs: r]}
    session_hooks = {'response': []}
    result = merge_hooks(request_hooks, session_hooks)
    assert result == request_hooks

def test_merge_hooks_valid_hooks():
    request_hooks = {'response': [lambda r, *args, **kwargs: r]}
    session_hooks = {'response': [lambda r, *args, **kwargs: r]}
    result = merge_hooks(request_hooks, session_hooks)
    assert result['response'] == request_hooks['response'] + session_hooks['response']

def test_merge_hooks_custom_dict_class():
    request_hooks = {'response': [lambda r, *args, **kwargs: r]}
    session_hooks = {'response': [lambda r, *args, **kwargs: r]}
    result = merge_hooks(request_hooks, session_hooks, dict_class=dict)
    assert isinstance(result, dict)
    assert result['response'] == request_hooks['response'] + session_hooks['response']