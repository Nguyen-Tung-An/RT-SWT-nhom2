        public boolean removeIf(final Predicate<? super E> filter) {
            if (parent.isEmpty() || Objects.isNull(filter)) {
                return false;
            }
            boolean modified = false;
            final Iterator<?> it = iterator();
            while (it.hasNext()) {
                @SuppressWarnings("unchecked")
                final E e = (E) it.next();
                if (filter.test(e)) {
                    it.remove();
                    modified = true;
                }
            }
            return modified;
        }
