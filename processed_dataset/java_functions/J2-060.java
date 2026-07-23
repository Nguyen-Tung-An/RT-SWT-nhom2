    public static void solveUpperTriangularSystem(RealMatrix rm, RealVector b)
        throws DimensionMismatchException, MathArithmeticException,
        NonSquareMatrixException {
        if (rm == null || b == null || rm.getRowDimension() != b.getDimension()) {
            throw new DimensionMismatchException(
                    (rm == null) ? 0 : rm.getRowDimension(),
                    (b == null) ? 0 : b.getDimension());
        }
        if( rm.getColumnDimension() != rm.getRowDimension() ){
            throw new NonSquareMatrixException(rm.getRowDimension(),
                                               rm.getColumnDimension());
        }
        int rows = rm.getRowDimension();
        for( int i = rows-1 ; i >-1 ; i-- ){
            double diag = rm.getEntry(i, i);
            if( JdkMath.abs(diag) < Precision.SAFE_MIN ){
                throw new MathArithmeticException(LocalizedFormats.ZERO_DENOMINATOR);
            }
            double bi = b.getEntry(i)/diag;
            b.setEntry(i,  bi );
            for( int j = i-1; j>-1; j-- ){
                b.setEntry(j, b.getEntry(j)-bi*rm.getEntry(j,i)  );
            }
        }
    }
