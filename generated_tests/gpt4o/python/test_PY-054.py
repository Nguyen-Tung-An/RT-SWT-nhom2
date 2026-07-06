import logging
import pytest
from flask.logging import has_level_handler

def test_has_level_handler_with_handler():
    logger = logging.getLogger("test_logger")
    handler = logging.StreamHandler()
    handler.setLevel(logging.INFO)
    logger.addHandler(handler)
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is True

def test_has_level_handler_without_handler():
    logger = logging.getLogger("test_logger_no_handler")
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is False

def test_has_level_handler_with_propagation():
    parent_logger = logging.getLogger("parent_logger")
    child_logger = logging.getLogger("parent_logger.child")
    
    parent_handler = logging.StreamHandler()
    parent_handler.setLevel(logging.WARNING)
    parent_logger.addHandler(parent_handler)
    parent_logger.setLevel(logging.DEBUG)
    
    child_logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(child_logger) is True

def test_has_level_handler_with_no_propagation():
    logger = logging.getLogger("no_propagation_logger")
    logger.setLevel(logging.DEBUG)
    logger.propagate = False
    
    assert has_level_handler(logger) is False

def test_has_level_handler_with_multiple_handlers():
    logger = logging.getLogger("multi_handler_logger")
    handler1 = logging.StreamHandler()
    handler1.setLevel(logging.ERROR)
    handler2 = logging.StreamHandler()
    handler2.setLevel(logging.INFO)
    logger.addHandler(handler1)
    logger.addHandler(handler2)
    logger.setLevel(logging.DEBUG)
    
    assert has_level_handler(logger) is True