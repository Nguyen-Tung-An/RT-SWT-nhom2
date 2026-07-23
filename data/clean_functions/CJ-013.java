    public void remove() throws IllegalStateException {
        if (iterator instanceof ListIterator) {
            iterator.remove();
            return;
        }
        int removeIndex = currentIndex;
        if (currentIndex == wrappedIteratorIndex) {
            --removeIndex;
        }
        if (!removeState || wrappedIteratorIndex - currentIndex > 1) {
            throw new IllegalStateException(MessageFormat.format(CANNOT_REMOVE_MESSAGE, Integer.valueOf(removeIndex)));
        }
        iterator.remove();
        list.remove(removeIndex);
        currentIndex = removeIndex;
        wrappedIteratorIndex--;
        removeState = false;
    }
