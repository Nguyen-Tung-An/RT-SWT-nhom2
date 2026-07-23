import pytest
from flask import Flask, current_app
from flask.cli import shell_command
import os
import sys

@pytest.fixture
def app():
    app = Flask(__name__)
    app.config['TESTING'] = True
    with app.app_context():
        yield app

def test_shell_command_no_startup(app, monkeypatch):
    monkeypatch.setattr('os.environ', {'PYTHONSTARTUP': ''})
    with pytest.raises(SystemExit):
        shell_command()

def test_shell_command_with_startup(app, monkeypatch):
    startup_script = 'test_startup.py'
    with open(startup_script, 'w') as f:
        f.write('print("Startup script executed")')
    
    monkeypatch.setattr('os.environ', {'PYTHONSTARTUP': startup_script})
    monkeypatch.setattr('os.path.isfile', lambda x: True)
    
    with app.app_context():
        shell_command()
    
    os.remove(startup_script)

def test_shell_command_with_interactive_hook(app, monkeypatch):
    monkeypatch.setattr('os.environ', {'PYTHONSTARTUP': ''})
    monkeypatch.setattr(sys, '__interactivehook__', lambda: None)
    
    with app.app_context():
        shell_command()