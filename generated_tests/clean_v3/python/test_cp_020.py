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

class TestHasLevelHandler:

    def test_has_handler_with_equal_level(self):
        handler = logging.StreamHandler()
        handler.setLevel(logging.INFO)
        logger = create_logger_with_handlers(logging.INFO, [handler])
        assert has_level_handler(logger) is True

    def test_has_handler_with_lower_level(self):
        handler = logging.StreamHandler()
        handler.setLevel(logging.DEBUG)
        logger = create_logger_with_handlers(logging.INFO, [handler])
        assert has_level_handler(logger) is True

    def test_no_handler_with_higher_level(self):
        handler = logging.StreamHandler()
        handler.setLevel(logging.ERROR)
        logger = create_logger_with_handlers(logging.INFO, [handler])
        assert has_level_handler(logger) is False

    def test_no_handler_with_propagation(self):
        handler = logging.StreamHandler()
        handler.setLevel(logging.ERROR)
        logger = create_logger_with_parent(logging.INFO, logging.DEBUG, [handler])
        assert has_level_handler(logger) is True

    def test_no_handler_with_no_propagation(self):
        handler = logging.StreamHandler()
        handler.setLevel(logging.ERROR)
        logger = create_logger_with_handlers(logging.INFO, [handler])
        logger.propagate = False
        assert has_level_handler(logger) is False

    def test_has_handler_in_parent(self):
        parent_handler = logging.StreamHandler()
        parent_handler.setLevel(logging.DEBUG)
        child_handler = logging.StreamHandler()
        child_handler.setLevel(logging.ERROR)
        logger = create_logger_with_parent(logging.INFO, logging.DEBUG, [child_handler])
        logger.parent.addHandler(parent_handler)
        assert has_level_handler(logger) is True

    def test_no_handler_in_parent_with_no_propagation(self):
        parent_handler = logging.StreamHandler()
        parent_handler.setLevel(logging.ERROR)
        child_handler = logging.StreamHandler()
        child_handler.setLevel(logging.ERROR)
        logger = create_logger_with_parent(logging.INFO, logging.DEBUG, [child_handler])
        logger.parent.addHandler(parent_handler)
        logger.propagate = False
        assert has_level_handler(logger) is False