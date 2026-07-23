    public static <E> Collection<E> removeCount(final Collection<E> input, int startIndex, int count) {
        Objects.requireNonNull(input, "input");
        if (startIndex < 0) {
            throw new IndexOutOfBoundsException("The start index can't be less than 0.");
        }
        if (count < 0) {
            throw new IndexOutOfBoundsException("The count can't be less than 0.");
        }
        if (input.size() < startIndex + count) {
            throw new IndexOutOfBoundsException(
                    "The sum of start index and count can't be greater than the size of collection.");
        }

        final Collection<E> result = new ArrayList<>(count);
        final Iterator<E> iterator = input.iterator();
        while (count > 0) {
            if (startIndex > 0) {
                startIndex -= 1;
                iterator.next();
                continue;
            }
            count -= 1;
            result.add(iterator.next());
            iterator.remove();
        }
        return result;
    }
