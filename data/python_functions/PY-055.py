from __future__ import annotations
import typing as t
from itertools import chain

def inject_url_defaults(self, endpoint: str, values: dict[str, t.Any]) -> None:
    """Injects the URL defaults for the given endpoint directly into
    the values dictionary passed.  This is used internally and
    automatically called on URL building.

    .. versionadded:: 0.7
    """
    names: t.Iterable[str | None] = (None,)

    # url_for may be called outside a request context, parse the
    # passed endpoint instead of using request.blueprints.
    if "." in endpoint:
        names = chain(
            names, reversed(_split_blueprint_path(endpoint.rpartition(".")[0]))
        )

    for name in names:
        if name in self.url_default_functions:
            for func in self.url_default_functions[name]:
                func(endpoint, values)
