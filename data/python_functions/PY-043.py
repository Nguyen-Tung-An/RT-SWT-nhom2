from __future__ import annotations
ITER_CHUNK_SIZE = 512  # requests.models default
from typing import cast

def iter_lines(
    self,
    chunk_size: int = ITER_CHUNK_SIZE,
    decode_unicode: bool = False,
    delimiter: str | bytes | None = None,
) -> Iterator[str | bytes]:
    """Iterates over the response data, one line at a time.  When
    stream=True is set on the request, this avoids reading the
    content at once into memory for large responses.

    The decode_unicode param works the same as in `iter_content`, with the
    same caveats.

    .. note:: This method is not reentrant safe.
    """

    pending: str | bytes | None = None

    for chunk in self.iter_content(
        chunk_size=chunk_size, decode_unicode=decode_unicode
    ):
        if pending is not None:
            # TODO: remove cast after iter_lines rewrite
            chunk = cast("str | bytes", pending + chunk)

        if delimiter:
            lines = chunk.split(delimiter)  # type: ignore[arg-type]
        else:
            lines = chunk.splitlines()

        if lines and lines[-1] and chunk and lines[-1][-1] == chunk[-1]:
            pending = lines.pop()
        else:
            pending = None

        yield from lines

    if pending is not None:
        yield pending
