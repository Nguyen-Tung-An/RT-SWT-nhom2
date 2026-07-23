import logging
import pytest
from flask.logging import has_level_handler

def test_has_level_handler_with_handler_at_logger_level():
    logger = logging.getLogger("test_logger")
    handler = logging.StreamHandler()
    handler.setLevel(logging.INFO)
    logger.addHandler(handler)
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is True

def test_has_level_handler_with_handler_at_parent_level():
    parent_logger = logging.getLogger("parent_logger")
    handler = logging.StreamHandler()
    handler.setLevel(logging.WARNING)
    parent_logger.addHandler(handler)
    parent_logger.setLevel(logging.DEBUG)

    child_logger = logging.getLogger("parent_logger.child_logger")
    child_logger.setLevel(logging.DEBUG)

    assert has_level_handler(child_logger) is True

def test_has_level_handler_with_no_handler():
    logger = logging.getLogger("no_handler_logger")
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is False

def test_has_level_handler_with_propagation_disabled():
    logger = logging.getLogger("disabled_propagation_logger")
    logger.setLevel(logging.DEBUG)
    logger.propagate = False
    
    assert has_level_handler(logger) is False

def test_has_level_handler_with_multiple_levels():
    logger = logging.getLogger("multi_level_logger")
    handler1 = logging.StreamHandler()
    handler1.setLevel(logging.ERROR)
    logger.addHandler(handler1)
    
    handler2 = logging.StreamHandler()
    handler2.setLevel(logging.INFO)
    logger.addHandler(handler2)
    
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is True