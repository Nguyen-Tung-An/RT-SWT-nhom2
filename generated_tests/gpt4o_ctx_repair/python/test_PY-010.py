import pytest
import click
from flask.cli import shell_command

@pytest.fixture
def cli_runner():
    from flask import Flask
    app = Flask(__name__)

    @app.cli.command("shell")
    def shell_command():
        click.echo("Shell command executed")

    return app.test_cli_runner()

def test_shell_command(cli_runner, monkeypatch):
    # Test without PYTHONSTARTUP
    monkeypatch.delenv("PYTHONSTARTUP", raising=False)
    result = cli_runner.invoke(shell_command)
    assert result.exit_code == 0
    assert "Shell command executed" in result.output

def test_shell_command_with_startup(cli_runner, monkeypatch, tmp_path):
    # Create a temporary startup file
    startup_file = tmp_path / "startup.py"
    startup_file.write_text("print('Startup script executed')")

    # Set the environment variable
    monkeypatch.setenv("PYTHONSTARTUP", str(startup_file))
    
    # Test shell_command with PYTHONSTARTUP
    result = cli_runner.invoke(shell_command)
    assert result.exit_code == 0
    assert "Shell command executed" in result.output