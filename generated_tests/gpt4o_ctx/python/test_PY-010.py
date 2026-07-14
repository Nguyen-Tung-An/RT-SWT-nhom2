import pytest
from flask.cli import shell_command

def test_shell_command(monkeypatch):
    # Test without PYTHONSTARTUP
    monkeypatch.delenv("PYTHONSTARTUP", raising=False)
    shell_command()  # This should run without errors

def test_shell_command_with_startup(monkeypatch, tmp_path):
    # Create a temporary startup file
    startup_file = tmp_path / "startup.py"
    startup_file.write_text("print('Startup script executed')")

    # Set the environment variable
    monkeypatch.setenv("PYTHONSTARTUP", str(startup_file))
    
    # Test shell_command with PYTHONSTARTUP
    shell_command()  # This should run without errors and execute the startup script