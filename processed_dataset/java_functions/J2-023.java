    public static <T extends FieldElement<T>> T[][] toBlocksLayout(final T[][] rawData)
        throws DimensionMismatchException {

        final int rows         = rawData.length;
        final int columns      = rawData[0].length;
        final int blockRows    = (rows    + BLOCK_SIZE - 1) / BLOCK_SIZE;
        final int blockColumns = (columns + BLOCK_SIZE - 1) / BLOCK_SIZE;

        // safety checks
        for (int i = 0; i < rawData.length; ++i) {
            final int length = rawData[i].length;
            if (length != columns) {
                throw new DimensionMismatchException(columns, length);
            }
        }

        // convert array
        final Field<T> field = extractField(rawData);
        final T[][] blocks = MathArrays.buildArray(field, blockRows * blockColumns, -1);
        int blockIndex = 0;
        for (int iBlock = 0; iBlock < blockRows; ++iBlock) {
            final int pStart  = iBlock * BLOCK_SIZE;
            final int pEnd    = JdkMath.min(pStart + BLOCK_SIZE, rows);
            final int iHeight = pEnd - pStart;
            for (int jBlock = 0; jBlock < blockColumns; ++jBlock) {
                final int qStart = jBlock * BLOCK_SIZE;
                final int qEnd   = JdkMath.min(qStart + BLOCK_SIZE, columns);
                final int jWidth = qEnd - qStart;

                // allocate new block
                final T[] block = MathArrays.buildArray(field, iHeight * jWidth);
                blocks[blockIndex] = block;

                // copy data
                int index = 0;
                for (int p = pStart; p < pEnd; ++p) {
                    System.arraycopy(rawData[p], qStart, block, index, jWidth);
                    index += jWidth;
                }

                ++blockIndex;
            }
        }

        return blocks;
    }
