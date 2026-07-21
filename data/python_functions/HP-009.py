def guess_filename(obj: Any) -> str | None:
    """Tries to guess the filename of the given object."""
    name = getattr(obj, "name", None)
    if name and isinstance(name, (str, bytes)) and name[0] != "<" and name[-1] != ">":
        return os.path.basename(name)  # type: ignore[return-value]  # urllib3 accepts bytes but types str only
