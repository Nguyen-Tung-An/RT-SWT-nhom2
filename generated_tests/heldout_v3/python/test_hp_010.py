import pytest
from requests.sessions import merge_hooks

def test_merge_hooks_empty():
    result = merge_hooks([], [], dict)
    assert result == {}

def test_merge_hooks_no_hooks():
    result = merge_hooks([], [], dict)
    assert result == {}

def test_merge_hooks_only_request_hooks():
    request_hooks = [("hook1", lambda r, *args, **kwargs: r)]
    result = merge_hooks(request_hooks, [], dict)
    assert len(result) == 1
    assert "hook1" in result
    assert result["hook1"] is request_hooks[0][1]

def test_merge_hooks_only_session_hooks():
    session_hooks = [("hook2", lambda r, *args, **kwargs: r)]
    result = merge_hooks([], session_hooks, dict)
    assert len(result) == 1
    assert "hook2" in result
    assert result["hook2"] is session_hooks[0][1]

def test_merge_hooks_request_and_session_hooks():
    request_hooks = [("hook1", lambda r, *args, **kwargs: r)]
    session_hooks = [("hook2", lambda r, *args, **kwargs: r)]
    result = merge_hooks(request_hooks, session_hooks, dict)
    assert len(result) == 2
    assert "hook1" in result
    assert "hook2" in result
    assert result["hook1"] is request_hooks[0][1]
    assert result["hook2"] is session_hooks[0][1]

def test_merge_hooks_overwrite_hooks():
    request_hooks = [("hook1", lambda r, *args, **kwargs: r)]
    session_hooks = [("hook1", lambda r, *args, **kwargs: r)]
    result = merge_hooks(request_hooks, session_hooks, dict)
    assert len(result) == 1
    assert "hook1" in result
    assert result["hook1"] is session_hooks[0][1]

def test_merge_hooks_dict_class():
    request_hooks = [("hook1", lambda r, *args, **kwargs: r)]
    session_hooks = [("hook2", lambda r, *args, **kwargs: r)]
    result = merge_hooks(request_hooks, session_hooks, dict)
    assert isinstance(result, dict)

def test_merge_hooks_invalid_hooks():
    with pytest.raises(TypeError):
        merge_hooks("invalid", [], dict)

    with pytest.raises(TypeError):
        merge_hooks([], "invalid", dict)