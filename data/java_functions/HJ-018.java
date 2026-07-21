    public MiniBatchKMeansClusterer(final int k,
                                    final int maxIterations,
                                    final int batchSize,
                                    final int initIterations,
                                    final int initBatchSize,
                                    final int maxNoImprovementTimes,
                                    final DistanceMeasure measure,
                                    final UniformRandomProvider random,
                                    final EmptyClusterStrategy emptyStrategy) {
        super(k, maxIterations, measure, random, emptyStrategy);

        if (batchSize < 1) {
            throw new NumberIsTooSmallException(batchSize, 1, true);
        }
        if (initIterations < 1) {
            throw new NumberIsTooSmallException(initIterations, 1, true);
        }
        if (initBatchSize < 1) {
            throw new NumberIsTooSmallException(initBatchSize, 1, true);
        }
        if (maxNoImprovementTimes < 1) {
            throw new NumberIsTooSmallException(maxNoImprovementTimes, 1, true);
        }

        this.batchSize = batchSize;
        this.initIterations = initIterations;
        this.initBatchSize = initBatchSize;
        this.maxNoImprovementTimes = maxNoImprovementTimes;
    }
