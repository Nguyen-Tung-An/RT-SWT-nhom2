    public BlockRealMatrix transpose() {
        final int nRows = getRowDimension();
        final int nCols = getColumnDimension();
        final BlockRealMatrix out = new BlockRealMatrix(nCols, nRows);

        // perform transpose block-wise, to ensure good cache behavior
        int blockIndex = 0;
        for (int iBlock = 0; iBlock < blockColumns; ++iBlock) {
            for (int jBlock = 0; jBlock < blockRows; ++jBlock) {
                // transpose current block
                final double[] outBlock = out.blocks[blockIndex];
                final double[] tBlock = blocks[jBlock * blockColumns + iBlock];
                final int pStart = iBlock * BLOCK_SIZE;
                final int pEnd = JdkMath.min(pStart + BLOCK_SIZE, columns);
                final int qStart = jBlock * BLOCK_SIZE;
                final int qEnd = JdkMath.min(qStart + BLOCK_SIZE, rows);
                int k = 0;
                for (int p = pStart; p < pEnd; ++p) {
                    final int lInc = pEnd - pStart;
                    int l = p - pStart;
                    for (int q = qStart; q < qEnd; ++q) {
                        outBlock[k] = tBlock[l];
                        ++k;
                        l+= lInc;
                    }
                }
                // go to next block
                ++blockIndex;
            }
        }

        return out;
    }
