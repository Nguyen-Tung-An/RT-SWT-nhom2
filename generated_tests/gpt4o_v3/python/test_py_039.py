import os
import tempfile
import zipfile
import pytest
from requests.utils import extract_zipped_paths

@pytest.fixture
def create_zip_with_member():
    def _create_zip_with_member(member_name, content):
        zip_path = tempfile.mktemp(suffix='.zip')
        with zipfile.ZipFile(zip_path, 'w') as zip_file:
            zip_file.writestr(member_name, content)
        return zip_path
    return _create_zip_with_member

def test_existing_path():
    temp_file = tempfile.mktemp()
    with open(temp_file, 'w') as f:
        f.write("test")
    assert extract_zipped_paths(temp_file) == temp_file
    os.remove(temp_file)

def test_nonexistent_path_not_zip():
    assert extract_zipped_paths("nonexistent/path/to/file.txt") == "nonexistent/path/to/file.txt"

def test_nonexistent_path_zip_member(create_zip_with_member):
    zip_path = create_zip_with_member("member.txt", b"content")
    assert extract_zipped_paths(f"{zip_path}/member.txt") == extract_zipped_paths(zip_path)

def test_nonexistent_path_zip_member_not_found(create_zip_with_member):
    zip_path = create_zip_with_member("member.txt", b"content")
    assert extract_zipped_paths(f"{zip_path}/nonexistent_member.txt") == f"{zip_path}/nonexistent_member.txt"

def test_nonexistent_path_zip_not_zip(create_zip_with_member):
    zip_path = create_zip_with_member("member.txt", b"content")
    os.remove(zip_path)
    assert extract_zipped_paths(f"{zip_path}/member.txt") == f"{zip_path}/member.txt"

def test_empty_zip(create_zip_with_member):
    zip_path = tempfile.mktemp(suffix='.zip')
    with zipfile.ZipFile(zip_path, 'w') as zip_file:
        pass  # Create an empty zip file
    assert extract_zipped_paths(f"{zip_path}/member.txt") == f"{zip_path}/member.txt"