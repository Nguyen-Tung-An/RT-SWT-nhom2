import pytest
from flask import Flask
from flask.cli import shell_command

@pytest.fixture
def app():
    app = Flask(__name__)
    app.config['TESTING'] = True
    return app

def test_shell_command_no_startup(app, monkeypatch):
    monkeypatch.setattr('flask.cli.current_app', app)
    monkeypatch.setattr('os.environ', {})
    shell_command()  # This should run without errors

def test_shell_command_with_startup(app, monkeypatch, tmpdir):
    startup_file = tmpdir.join("startup.py")
    startup_file.write("print('Startup script executed')")
    
    monkeypatch.setattr('flask.cli.current_app', app)
    monkeypatch.setattr('os.environ', {'PYTHONSTARTUP': str(startup_file)})
    shell_command()  # This should run without errors and execute the startup script

def test_shell_command_with_interactive_hook(app, monkeypatch):
    monkeypatch.setattr('flask.cli.current_app', app)
    monkeypatch.setattr('sys', type(sys)(__interactivehook__=lambda: None))
    shell_command()  # This should run without errors