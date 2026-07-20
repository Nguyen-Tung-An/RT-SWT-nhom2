import pytest
from datetime import date
import decimal
import uuid
from flask.json.provider import _default

class TestDefaultFunction:
    def test_date_instance(self):
        d = date(2023, 10, 1)
        assert _default(d) == "Sun, 01 Oct 2023 00:00:00 GMT"

    def test_decimal_instance(self):
        d = decimal.Decimal('10.5')
        assert _default(d) == '10.5'

    def test_uuid_instance(self):
        u = uuid.uuid4()
        assert _default(u) == str(u)

    def test_dataclass_instance(self):
        from dataclasses import dataclass
        
        @dataclass
        class SampleDataClass:
            name: str
            value: int
        
        obj = SampleDataClass(name="test", value=42)
        assert _default(obj) == {'name': 'test', 'value': 42}

    def test_html_able_instance(self):
        class HtmlAble:
            def __html__(self):
                return "<p>HTML content</p>"
        
        obj = HtmlAble()
        assert _default(obj) == "<p>HTML content</p>"

    def test_non_serializable_type(self):
        with pytest.raises(TypeError, match="Object of type"):
            _default(object())