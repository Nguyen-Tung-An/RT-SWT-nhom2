    public static Simplex alongAxes(double[] steps) {
        if (steps.length == 0) {
            throw new ZeroException();
        }
        final int dim = steps.length;
        final int len = dim + 1;

        // Only the relative position of the n final vertices with respect
        // to the first one are stored.
        final double[][] simplex = new double[len][dim];
        for (int i = 1; i < len; i++) { // First point is the origin (zero).
            final double[] vertexI = simplex[i];
            for (int j = 0; j < i; j++) {
                if (steps[j] == 0) {
                    throw new ZeroException();
                }
                System.arraycopy(steps, 0, vertexI, 0, j + 1);
            }
        }

        return new Simplex(simplex);
    }
