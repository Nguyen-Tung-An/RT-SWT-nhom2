import os
import tempfile
import zipfile
import pytest
from requests.utils import extract_zipped_paths

def create_zip_with_member(zip_name, member_name, content):
    with zipfile.ZipFile(zip_name, 'w') as zipf:
        zipf.writestr(member_name, content)

def test_extract_zipped_paths_valid_path():
    valid_path = "/valid/path/to/file.txt"
    os.makedirs(os.path.dirname(valid_path), exist_ok=True)
    with open(valid_path, 'w') as f:
        f.write("This is a test file.")
    
    assert extract_zipped_paths(valid_path) == valid_path
    os.remove(valid_path)

def test_extract_zipped_paths_nonexistent_zip():
    nonexistent_zip_path = "/nonexistent/path/to/archive.zip"
    member_name = "file.txt"
    assert extract_zipped_paths(f"{nonexistent_zip_path}/{member_name}") == f"{nonexistent_zip_path}/{member_name}"

def test_extract_zipped_paths_zip_without_member():
    zip_name = tempfile.mktemp(suffix=".zip")
    create_zip_with_member(zip_name, "another_file.txt", "This is another file.")
    
    assert extract_zipped_paths(f"{zip_name}/file.txt") == f"{zip_name}/file.txt"
    os.remove(zip_name)

def test_extract_zipped_paths_valid_zip_with_member():
    zip_name = tempfile.mktemp(suffix=".zip")
    member_name = "file.txt"
    create_zip_with_member(zip_name, member_name, "This is a test file.")
    
    extracted_path = extract_zipped_paths(f"{zip_name}/{member_name}")
    assert os.path.exists(extracted_path)
    os.remove(zip_name)
    os.remove(extracted_path)

def test_extract_zipped_paths_nested_zip():
    zip_name = tempfile.mktemp(suffix=".zip")
    member_name = "nested/file.txt"
    create_zip_with_member(zip_name, member_name, "This is a nested file.")
    
    extracted_path = extract_zipped_paths(f"{zip_name}/{member_name}")
    assert os.path.exists(extracted_path)
    os.remove(zip_name)
    os.remove(extracted_path)

def test_extract_zipped_paths_empty_zip():
    zip_name = tempfile.mktemp(suffix=".zip")
    with zipfile.ZipFile(zip_name, 'w') as zipf:
        pass  # Create an empty zip file
    
    assert extract_zipped_paths(f"{zip_name}/file.txt") == f"{zip_name}/file.txt"
    os.remove(zip_name)