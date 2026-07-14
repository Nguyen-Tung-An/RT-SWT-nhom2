import pytest
import logging
from flask.logging import has_level_handler

def test_has_level_handler_with_handler():
    logger = logging.getLogger("test_logger")
    handler = logging.StreamHandler()
    handler.setLevel(logging.WARNING)
    logger.addHandler(handler)
    logger.setLevel(logging.INFO)
    
    assert has_level_handler(logger) is True

def test_has_level_handler_without_handler():
    logger = logging.getLogger("test_logger_no_handler")
    logger.setLevel(logging.INFO)
    
    assert has_level_handler(logger) is False

def test_has_level_handler_with_propagation():
    parent_logger = logging.getLogger("parent_logger")
    child_logger = logging.getLogger("parent_logger.child")
    
    handler = logging.StreamHandler()
    handler.setLevel(logging.ERROR)
    parent_logger.addHandler(handler)
    child_logger.setLevel(logging.INFO)
    
    assert has_level_handler(child_logger) is True

def test_has_level_handler_no_propagation():
    logger = logging.getLogger("no_propagation_logger")
    logger.propagate = False
    logger.setLevel(logging.INFO)
    
    assert has_level_handler(logger) is False

def test_has_level_handler_with_handler_at_different_level():
    logger = logging.getLogger("test_logger_different_level")
    handler = logging.StreamHandler()
    handler.setLevel(logging.DEBUG)
    logger.addHandler(handler)
    logger.setLevel(logging.INFO)
    
    assert has_level_handler(logger) is True