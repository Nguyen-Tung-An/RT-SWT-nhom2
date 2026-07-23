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

def test_has_level_handler_with_handler_at_lower_level():
    logger = logging.getLogger("test_logger")
    handler = logging.StreamHandler()
    handler.setLevel(logging.WARNING)
    logger.addHandler(handler)
    logger.setLevel(logging.INFO)
    
    assert has_level_handler(logger) is True

def test_has_level_handler_with_no_handler():
    logger = logging.getLogger("test_logger")
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is False

def test_has_level_handler_with_propagation():
    parent_logger = logging.getLogger("parent_logger")
    child_logger = logging.getLogger("parent_logger.child")
    
    parent_handler = logging.StreamHandler()
    parent_handler.setLevel(logging.INFO)
    parent_logger.addHandler(parent_handler)
    
    child_logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(child_logger) is True

def test_has_level_handler_with_no_propagation():
    logger = logging.getLogger("test_logger")
    logger.propagate = False
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is False