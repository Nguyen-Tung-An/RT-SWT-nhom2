    public RealMatrix getB() {

        if (cachedB == null) {

            final int m = householderVectors.length;
            final int n = householderVectors[0].length;
            double[][] ba = new double[m][n];
            for (int i = 0; i < main.length; ++i) {
                ba[i][i] = main[i];
                if (m < n) {
                    if (i > 0) {
                        ba[i][i-1] = secondary[i - 1];
                    }
                } else {
                    if (i < main.length - 1) {
                        ba[i][i+1] = secondary[i];
                    }
                }
            }
            cachedB = MatrixUtils.createRealMatrix(ba);
        }

        // return the cached matrix
        return cachedB;
    }
