  public double nextDouble() throws IOException {
    JsonToken token = peek();
    if (token != JsonToken.NUMBER && token != JsonToken.STRING) {
      throw new IllegalStateException(
          "Expected " + JsonToken.NUMBER + " but was " + token + locationString());
    }
    double result = ((JsonPrimitive) peekStack()).getAsDouble();
    if (!isLenient() && (Double.isNaN(result) || Double.isInfinite(result))) {
      throw new MalformedJsonException("JSON forbids NaN and infinities: " + result);
    }
    popStack();
    if (stackSize > 0) {
      pathIndices[stackSize - 1]++;
    }
    return result;
  }
