import pytest
import decimal
import uuid
from datetime import date
from flask.json.provider import _default

class TestDefaultFunction:
    
    def test_date_serialization(self):
        d = date(2023, 10, 1)
        result = _default(d)
        assert result == "Sun, 01 Oct 2023 00:00:00 GMT"

    def test_decimal_serialization(self):
        d = decimal.Decimal('10.5')
        result = _default(d)
        assert result == '10.5'

    def test_uuid_serialization(self):
        u = uuid.uuid4()
        result = _default(u)
        assert result == str(u)

    def test_dataclass_serialization(self):
        from dataclasses import dataclass
        
        @dataclass
        class SampleDataClass:
            name: str
            value: int
        
        obj = SampleDataClass(name="test", value=42)
        result = _default(obj)
        assert result == {'name': 'test', 'value': 42}

    def test_html_serialization(self):
        class HtmlObject:
            def __html__(self):
                return "<div>HTML Content</div>"
        
        obj = HtmlObject()
        result = _default(obj)
        assert result == "<div>HTML Content</div>"

    def test_type_error_on_unsupported_type(self):
        with pytest.raises(TypeError, match="Object of type"):
            _default(object())