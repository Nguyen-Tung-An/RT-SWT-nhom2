import logging
import pytest
from flask.logging import has_level_handler

def create_logger_with_handlers(level, handlers):
    logger = logging.getLogger("test_logger")
    logger.setLevel(level)
    for handler in handlers:
        logger.addHandler(handler)
    return logger

def create_logger_with_parent(level, parent_level, handlers):
    parent_logger = logging.getLogger("parent_logger")
    parent_logger.setLevel(parent_level)
    for handler in handlers:
        parent_logger.addHandler(handler)
    logger = logging.getLogger("test_logger")
    logger.setLevel(level)
    logger.parent = parent_logger
    return logger

def test_has_level_handler_with_no_handlers():
    logger = create_logger_with_handlers(logging.DEBUG, [])
    assert not has_level_handler(logger)

def test_has_level_handler_with_handler_at_same_level():
    handler = logging.StreamHandler()
    handler.setLevel(logging.DEBUG)
    logger = create_logger_with_handlers(logging.DEBUG, [handler])
    assert has_level_handler(logger)

def test_has_level_handler_with_handler_at_lower_level():
    handler = logging.StreamHandler()
    handler.setLevel(logging.INFO)
    logger = create_logger_with_handlers(logging.DEBUG, [handler])
    assert has_level_handler(logger)

def test_has_level_handler_with_handler_at_higher_level():
    handler = logging.StreamHandler()
    handler.setLevel(logging.ERROR)
    logger = create_logger_with_handlers(logging.DEBUG, [handler])
    assert has_level_handler(logger)

def test_has_level_handler_with_no_propagation():
    handler = logging.StreamHandler()
    handler.setLevel(logging.DEBUG)
    logger = create_logger_with_handlers(logging.DEBUG, [handler])
    logger.propagate = False
    assert has_level_handler(logger)

def test_has_level_handler_with_parent_logger():
    parent_handler = logging.StreamHandler()
    parent_handler.setLevel(logging.WARNING)
    parent_logger = create_logger_with_parent(logging.DEBUG, logging.INFO, [parent_handler])
    assert has_level_handler(parent_logger)

def test_has_level_handler_with_parent_logger_no_propagation():
    parent_handler = logging.StreamHandler()
    parent_handler.setLevel(logging.WARNING)
    parent_logger = create_logger_with_parent(logging.DEBUG, logging.INFO, [parent_handler])
    parent_logger.propagate = False
    assert not has_level_handler(parent_logger)

def test_has_level_handler_with_multiple_levels():
    handler1 = logging.StreamHandler()
    handler1.setLevel(logging.INFO)
    handler2 = logging.StreamHandler()
    handler2.setLevel(logging.ERROR)
    logger = create_logger_with_handlers(logging.DEBUG, [handler1, handler2])
    assert has_level_handler(logger)