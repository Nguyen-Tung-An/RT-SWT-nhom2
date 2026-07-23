    public static MixtureMultivariateNormalDistribution estimate(final double[][] data,
                                                                 final int numComponents)
        throws NotStrictlyPositiveException,
               DimensionMismatchException {
        if (data.length < 2) {
            throw new NotStrictlyPositiveException(data.length);
        }
        if (numComponents < 1) {
            throw new NumberIsTooSmallException(numComponents, 1, true);
        }
        if (numComponents > data.length) {
            throw new NumberIsTooLargeException(numComponents, data.length, true);
        }

        final int numRows = data.length;
        final int numCols = data[0].length;

        // sort the data
        final DataRow[] sortedData = new DataRow[numRows];
        for (int i = 0; i < numRows; i++) {
            sortedData[i] = new DataRow(data[i]);
        }
        Arrays.sort(sortedData);

        // uniform weight for each bin
        final double weight = 1d / numComponents;

        // components of mixture model to be created
        final List<Pair<Double, MultivariateNormalDistribution>> components =
                new ArrayList<>(numComponents);

        // create a component based on data in each bin
        for (int binIndex = 0; binIndex < numComponents; binIndex++) {
            // minimum index (inclusive) from sorted data for this bin
            final int minIndex = (binIndex * numRows) / numComponents;

            // maximum index (exclusive) from sorted data for this bin
            final int maxIndex = ((binIndex + 1) * numRows) / numComponents;

            // number of data records that will be in this bin
            final int numBinRows = maxIndex - minIndex;

            // data for this bin
            final double[][] binData = new double[numBinRows][numCols];

            // mean of each column for the data in the this bin
            final double[] columnMeans = new double[numCols];

            // populate bin and create component
            for (int i = minIndex, iBin = 0; i < maxIndex; i++, iBin++) {
                for (int j = 0; j < numCols; j++) {
                    final double val = sortedData[i].getRow()[j];
                    columnMeans[j] += val;
                    binData[iBin][j] = val;
                }
            }

            MathArrays.scaleInPlace(1d / numBinRows, columnMeans);

            // covariance matrix for this bin
            final double[][] covMat
                = new Covariance(binData).getCovarianceMatrix().getData();
            final MultivariateNormalDistribution mvn
                = new MultivariateNormalDistribution(columnMeans, covMat);

            components.add(new Pair<>(weight, mvn));
        }

        return new MixtureMultivariateNormalDistribution(components);
    }
