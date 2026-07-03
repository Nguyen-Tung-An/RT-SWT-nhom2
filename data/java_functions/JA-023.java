    public static <O> List<O> collate(final Iterable<? extends O> iterableA, final Iterable<? extends O> iterableB,
                                      final Comparator<? super O> comparator, final boolean includeDuplicates) {
        Objects.requireNonNull(iterableA, "iterableA");
        Objects.requireNonNull(iterableB, "iterableB");
        Objects.requireNonNull(comparator, "comparator");
        // if both Iterables are a Collection, we can estimate the size
        final int totalSize = iterableA instanceof Collection<?> && iterableB instanceof Collection<?> ?
                Math.max(1, ((Collection<?>) iterableA).size() + ((Collection<?>) iterableB).size()) : 10;

        final Iterator<O> iterator = new CollatingIterator<>(comparator, iterableA.iterator(), iterableB.iterator());
        if (includeDuplicates) {
            return IteratorUtils.toList(iterator, totalSize);
        }
        final ArrayList<O> mergedList = new ArrayList<>(totalSize);
        O lastItem = null;
        while (iterator.hasNext()) {
            final O item = iterator.next();
            if (lastItem == null || !lastItem.equals(item)) {
                mergedList.add(item);
            }
            lastItem = item;
        }
        mergedList.trimToSize();
        return mergedList;
    }
