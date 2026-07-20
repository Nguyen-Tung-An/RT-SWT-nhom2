import os
import tempfile
import zipfile
import pytest
from requests.utils import extract_zipped_paths

class TestExtractZippedPaths:
    @pytest.fixture
    def create_zip_with_member(self):
        def _create_zip_with_member(member_content):
            zip_path = tempfile.mktemp(suffix='.zip')
            with zipfile.ZipFile(zip_path, 'w') as zip_file:
                zip_file.writestr('member.txt', member_content)
            return zip_path
        return _create_zip_with_member

    def test_existing_path(self):
        temp_file = tempfile.mktemp()
        with open(temp_file, 'w'):
            pass
        assert extract_zipped_paths(temp_file) == temp_file
        os.remove(temp_file)

    def test_nonexistent_zip_path(self):
        assert extract_zipped_paths('nonexistent.zip/member.txt') == 'nonexistent.zip/member.txt'

    def test_nonexistent_member_in_zip(self, create_zip_with_member):
        zip_path = create_zip_with_member('content')
        assert extract_zipped_paths(f'{zip_path}/nonexistent_member.txt') == f'{zip_path}/nonexistent_member.txt'
        os.remove(zip_path)

    def test_valid_zip_with_member(self, create_zip_with_member):
        zip_path = create_zip_with_member('content')
        extracted_path = extract_zipped_paths(f'{zip_path}/member.txt')
        assert os.path.exists(extracted_path)
        with open(extracted_path, 'r') as f:
            assert f.read() == 'content'
        os.remove(zip_path)
        os.remove(extracted_path)

    def test_nested_zip_path(self, create_zip_with_member):
        zip_path = create_zip_with_member('content')
        nested_zip_path = f'nonexistent_dir/{zip_path}/member.txt'
        assert extract_zipped_paths(nested_zip_path) == nested_zip_path
        os.remove(zip_path)

    def test_empty_prefix_case(self):
        assert extract_zipped_paths('nonexistent_dir/nonexistent.zip/member.txt') == 'nonexistent_dir/nonexistent.zip/member.txt'