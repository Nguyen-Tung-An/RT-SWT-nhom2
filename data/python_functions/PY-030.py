from __future__ import annotations
import re
from typing import cast

def handle_401(self, r: Response, **kwargs: Any) -> Response:
    """
    Takes the given response and tries digest-auth, if needed.

    :rtype: requests.Response
    """

    # If response is not 4xx, do not auth
    # See https://github.com/psf/requests/issues/3772
    if not 400 <= r.status_code < 500:
        self._thread_local.num_401_calls = 1
        return r

    if self._thread_local.pos is not None:
        # Rewind the file position indicator of the body to where
        # it was to resend the request.
        if (seek := getattr(r.request.body, "seek", None)) is not None:
            seek(self._thread_local.pos)
    s_auth = r.headers.get("www-authenticate", "")

    if "digest" in s_auth.lower() and self._thread_local.num_401_calls < 2:
        self._thread_local.num_401_calls += 1
        pat = re.compile(r"digest ", flags=re.IGNORECASE)
        self._thread_local.chal = parse_dict_header(pat.sub("", s_auth, count=1))

        # Consume content and release the original connection
        # to allow our new request to reuse the same one.
        r.content
        r.close()
        prep = r.request.copy()
        cookie_jar = cast("CookieJar", prep._cookies)
        extract_cookies_to_jar(cookie_jar, r.request, r.raw)
        prep.prepare_cookies(cookie_jar)

        _digest_auth = self.build_digest_header(
            cast(str, prep.method), cast(str, prep.url)
        )
        if _digest_auth:
            prep.headers["Authorization"] = _digest_auth
        _r = r.connection.send(prep, **kwargs)
        _r.history.append(r)
        _r.request = prep

        return _r

    self._thread_local.num_401_calls = 1
    return r
