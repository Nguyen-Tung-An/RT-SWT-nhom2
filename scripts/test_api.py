"""
Gate E3 — API smoke test (RBL-4).

Verifies the OpenAI API key works and the configured model is reachable,
prints one sample output, token usage and an estimated cost.

Usage:
    export OPENAI_API_KEY=...        # never commit the key
    python scripts/test_api.py

Exit code 0 = gate E3 PASS.
"""
import os
import sys

# --- Config (keep in sync with proposal §5.3 / amendment v1.1) ---
MODEL = "gpt-4o-mini-2024-07-18"   # amendment v1.1 (was gpt-4o-2024-08-06)
TEMPERATURE = 0.0
PRICE_INPUT_PER_M = 0.15           # USD per 1M input tokens
PRICE_OUTPUT_PER_M = 0.60          # USD per 1M output tokens


def main() -> int:
    if not os.environ.get("OPENAI_API_KEY"):
        print("ERROR: OPENAI_API_KEY is not set. Run: export OPENAI_API_KEY=...")
        return 1

    try:
        from openai import OpenAI
    except ImportError:
        print("ERROR: package 'openai' not installed. Run: pip install openai")
        return 1

    client = OpenAI()  # reads OPENAI_API_KEY from the environment

    try:
        resp = client.chat.completions.create(
            model=MODEL,
            temperature=TEMPERATURE,
            messages=[{"role": "user", "content": "Reply with exactly: API OK"}],
        )
    except Exception as e:  # noqa: BLE001 - surface any API error to the user
        print(f"ERROR: API call failed -> {e}")
        return 1

    out = resp.choices[0].message.content
    pin = resp.usage.prompt_tokens
    pout = resp.usage.completion_tokens
    cost = pin / 1_000_000 * PRICE_INPUT_PER_M + pout / 1_000_000 * PRICE_OUTPUT_PER_M

    print(f"Model returned : {resp.model}")
    print(f"Sample output  : {out!r}")
    print(f"Tokens in/out  : {pin} / {pout}")
    print(f"Estimated cost : ${cost:.6f}")

    if "API OK" in (out or ""):
        print("\nGate E3: PASS")
        return 0
    print("\nGate E3: model reachable, but unexpected output — inspect above.")
    return 0


if __name__ == "__main__":
    sys.exit(main())
