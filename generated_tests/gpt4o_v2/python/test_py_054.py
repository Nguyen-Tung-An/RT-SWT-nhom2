import logging
import pytest
from flask.logging import has_level_handler

class TestHasLevelHandler:
    def test_handler_with_matching_level(self):
        logger = logging.getLogger("test_logger")
        handler = logging.StreamHandler()
        handler.setLevel(logging.INFO)
        logger.addHandler(handler)
        logger.setLevel(logging.DEBUG)

        assert has_level_handler(logger) is True

    def test_handler_with_higher_level(self):
        logger = logging.getLogger("test_logger")
        handler = logging.StreamHandler()
        handler.setLevel(logging.ERROR)
        logger.addHandler(handler)
        logger.setLevel(logging.DEBUG)

        assert has_level_handler(logger) is False

    def test_no_handlers(self):
        logger = logging.getLogger("test_logger")
        logger.setLevel(logging.DEBUG)

        assert has_level_handler(logger) is False

    def test_propagation_to_parent_with_matching_level(self):
        parent_logger = logging.getLogger("parent_logger")
        child_logger = logging.getLogger("child_logger")
        child_logger.setLevel(logging.DEBUG)
        parent_logger.setLevel(logging.INFO)

        handler = logging.StreamHandler()
        handler.setLevel(logging.INFO)
        parent_logger.addHandler(handler)

        assert has_level_handler(child_logger) is True

    def test_propagation_to_parent_without_matching_level(self):
        parent_logger = logging.getLogger("parent_logger")
        child_logger = logging.getLogger("child_logger")
        child_logger.setLevel(logging.DEBUG)
        parent_logger.setLevel(logging.ERROR)

        handler = logging.StreamHandler()
        handler.setLevel(logging.WARNING)
        parent_logger.addHandler(handler)

        assert has_level_handler(child_logger) is False

    def test_no_propagation(self):
        logger = logging.getLogger("test_logger")
        logger.setLevel(logging.DEBUG)
        logger.propagate = False

        handler = logging.StreamHandler()
        handler.setLevel(logging.INFO)
        logger.addHandler(handler)

        assert has_level_handler(logger) is True