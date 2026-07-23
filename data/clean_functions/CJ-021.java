    public boolean processBitMaps(final LongPredicate consumer) {
        Objects.requireNonNull(consumer, "consumer");
        final int blocksm1 = BitMaps.numberOfBitMaps(cells.length) - 1;
        int i = 0;
        long value;
        // must break final block separate as the number of bits may not fall on the long boundary
        for (int j = 0; j < blocksm1; j++) {
            value = 0;
            for (int k = 0; k < Long.SIZE; k++) {
                if (cells[i++] != 0) {
                    value |= BitMaps.getLongBit(k);
                }
            }
            if (!consumer.test(value)) {
                return false;
            }
        }
        // Final block
        value = 0;
        for (int k = 0; i < cells.length; k++) {
            if (cells[i++] != 0) {
                value |= BitMaps.getLongBit(k);
            }
        }
        return consumer.test(value);
    }
