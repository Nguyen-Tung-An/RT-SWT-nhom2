  public <T> TypeAdapter<T> getAdapter(TypeToken<T> type) {
    Objects.requireNonNull(type, "type must not be null");
    TypeAdapter<?> cached = typeTokenCache.get(type);
    if (cached != null) {
      @SuppressWarnings("unchecked")
      TypeAdapter<T> adapter = (TypeAdapter<T>) cached;
      return adapter;
    }

    Map<TypeToken<?>, TypeAdapter<?>> threadCalls = threadLocalAdapterResults.get();
    boolean isInitialAdapterRequest = false;
    if (threadCalls == null) {
      threadCalls = new HashMap<>();
      threadLocalAdapterResults.set(threadCalls);
      isInitialAdapterRequest = true;
    } else {
      // the key and value type parameters always agree
      @SuppressWarnings("unchecked")
      TypeAdapter<T> ongoingCall = (TypeAdapter<T>) threadCalls.get(type);
      if (ongoingCall != null) {
        return ongoingCall;
      }
    }

    TypeAdapter<T> candidate = null;
    try {
      FutureTypeAdapter<T> call = new FutureTypeAdapter<>();
      threadCalls.put(type, call);

      for (TypeAdapterFactory factory : factories) {
        candidate = factory.create(this, type);
        if (candidate != null) {
          call.setDelegate(candidate);
          // Replace future adapter with actual adapter
          threadCalls.put(type, candidate);
          break;
        }
      }
    } finally {
      if (isInitialAdapterRequest) {
        threadLocalAdapterResults.remove();
      }
    }

    if (candidate == null) {
      throw new IllegalArgumentException(
          "GSON (" + GsonBuildConfig.VERSION + ") cannot handle " + type);
    }

    if (isInitialAdapterRequest) {
      /*
       * Publish resolved adapters to all threads
       * Can only do this for the initial request because cyclic dependency TypeA -> TypeB -> TypeA
       * would otherwise publish adapter for TypeB which uses not yet resolved adapter for TypeA
       * See https://github.com/google/gson/issues/625
       */
      typeTokenCache.putAll(threadCalls);
    }
    return candidate;
  }
