    public static <E> BoundedCollection<E> unmodifiableBoundedCollection(Collection<? extends E> collection) {
        Objects.requireNonNull(collection, "collection");

        // handle decorators
        for (int i = 0; i < 1000; i++) {  // counter to prevent infinite looping
            if (collection instanceof BoundedCollection) {
                break;  // normal loop exit
            }
            if (collection instanceof AbstractCollectionDecorator) {
                collection = ((AbstractCollectionDecorator<E>) collection).decorated();
            } else if (collection instanceof SynchronizedCollection) {
                collection = ((SynchronizedCollection<E>) collection).decorated();
            }
        }

        if (!(collection instanceof BoundedCollection)) {
            throw new IllegalArgumentException("Collection is not a bounded collection.");
        }
        return new UnmodifiableBoundedCollection<>((BoundedCollection<E>) collection);
    }
