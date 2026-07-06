import pytest
from flask.json.provider import _default
from datetime import date
import decimal
import uuid
import dataclasses

@dataclasses.dataclass
class TestDataClass:
    name: str
    value: int

def test_default_date():
    assert _default(date(2023, 10, 1)) == "Sun, 01 Oct 2023 00:00:00 GMT"

def test_default_decimal():
    assert _default(decimal.Decimal('10.5')) == '10.5'

def test_default_uuid():
    test_uuid = uuid.uuid4()
    assert _default(test_uuid) == str(test_uuid)

def test_default_dataclass():
    test_instance = TestDataClass(name="Test", value=42)
    assert _default(test_instance) == {'name': 'Test', 'value': 42}

def test_default_html_compatible():
    class HtmlCompatible:
        def __html__(self):
            return "<div>HTML Content</div>"
    
    html_instance = HtmlCompatible()
    assert _default(html_instance) == "<div>HTML Content</div>"

def test_default_type_error():
    with pytest.raises(TypeError, match="Object of type"):
        _default(object())