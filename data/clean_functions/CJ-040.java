    public SobolSequenceGenerator(final int dimension) {
        if (dimension < 1 || dimension > MAX_DIMENSION) {
            throw new OutOfRangeException(dimension, 1, MAX_DIMENSION);
        }

        // initialize the other dimensions with direction numbers from a resource
        final InputStream is = getClass().getResourceAsStream(RESOURCE_NAME);
        if (is == null) {
            throw new MathInternalError();
        }

        this.dimension = dimension;

        // init data structures
        direction = new long[dimension][BITS + 1];
        x = new long[dimension];

        try {
            initFromStream(is);
        } catch (IOException e) {
            // the internal resource file could not be read -> should not happen
            throw new MathInternalError();
        } catch (MathParseException e) {
            // the internal resource file could not be parsed -> should not happen
            throw new MathInternalError();
        } finally {
            try {
                is.close();
            } catch (IOException e) { // NOPMD
                // ignore
            }
        }
    }
