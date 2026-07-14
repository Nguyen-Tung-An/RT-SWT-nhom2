import pytest
from flask.json.provider import _default
from datetime import date
import decimal
import uuid
import dataclasses

@dataclasses.dataclass
class SampleDataClass:
    name: str
    value: int

def test_default_with_date():
    assert _default(date(2023, 10, 1)) == "Sun, 01 Oct 2023 00:00:00 GMT"

def test_default_with_decimal():
    assert _default(decimal.Decimal('10.5')) == '10.5'

def test_default_with_uuid():
    test_uuid = uuid.uuid4()
    assert _default(test_uuid) == str(test_uuid)

def test_default_with_dataclass():
    sample = SampleDataClass(name="test", value=42)
    assert _default(sample) == {'name': 'test', 'value': 42}

def test_default_with_html_able_object():
    class HtmlAble:
        def __html__(self):
            return "<p>HTML content</p>"
    
    html_obj = HtmlAble()
    assert _default(html_obj) == "<p>HTML content</p>"

def test_default_with_non_serializable_object():
    with pytest.raises(TypeError, match="Object of type NonSerializable is not JSON serializable"):
        class NonSerializable:
            pass
        
        non_serializable_obj = NonSerializable()
        _default(non_serializable_obj)