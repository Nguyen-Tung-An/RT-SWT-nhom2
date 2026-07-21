import pytest
from requests.sessions import merge_hooks

def test_merge_hooks_both_none():
    assert merge_hooks(None, None) is None

def test_merge_hooks_request_hooks_none():
    session_hooks = {'response': [lambda r, *args, **kwargs: r]}
    assert merge_hooks(None, session_hooks) == session_hooks

def test_merge_hooks_session_hooks_none():
    request_hooks = {'response': [lambda r, *args, **kwargs: r]}
    assert merge_hooks(request_hooks, None) == request_hooks

def test_merge_hooks_both_empty_response():
    request_hooks = {'response': []}
    session_hooks = {'response': []}
    assert merge_hooks(request_hooks, session_hooks) == request_hooks

def test_merge_hooks_request_hooks_empty_response():
    request_hooks = {'response': []}
    session_hooks = {'response': [lambda r, *args, **kwargs: r]}
    assert merge_hooks(request_hooks, session_hooks) == session_hooks

def test_merge_hooks_session_hooks_empty_response():
    request_hooks = {'response': [lambda r, *args, **kwargs: r]}
    session_hooks = {'response': []}
    assert merge_hooks(request_hooks, session_hooks) == request_hooks

def test_merge_hooks_both_non_empty():
    request_hooks = {'response': [lambda r, *args, **kwargs: r]}
    session_hooks = {'response': [lambda r, *args, **kwargs: r]}
    result = merge_hooks(request_hooks, session_hooks)
    assert result['response'] == request_hooks['response'] + session_hooks['response']