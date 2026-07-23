package org.apache.commons.math4.legacy.random;

import org.apache.commons.math4.exception.OutOfRangeException;
import org.apache.commons.math4.exception.MathInternalError;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SobolSequenceGeneratorTest {

    @Test
    void testSobolSequenceGenerator_ValidDimension() {
        int dimension = 1;
        SobolSequenceGenerator generator = new SobolSequenceGenerator(dimension);
        assertNotNull(generator);
    }

    @Test
    void testSobolSequenceGenerator_MinBoundary() {
        int dimension = 1;
        SobolSequenceGenerator generator = new SobolSequenceGenerator(dimension);
        assertNotNull(generator);
    }

    @Test
    void testSobolSequenceGenerator_MaxBoundary() {
        int dimension = SobolSequenceGenerator.MAX_DIMENSION;
        SobolSequenceGenerator generator = new SobolSequenceGenerator(dimension);
        assertNotNull(generator);
    }

    @Test
    void testSobolSequenceGenerator_BelowMinBoundary() {
        int dimension = 0;
        Exception exception = assertThrows(OutOfRangeException.class, () -> {
            new SobolSequenceGenerator(dimension);
        });
        assertEquals("Dimension must be in the range [1, " + SobolSequenceGenerator.MAX_DIMENSION + "] but got: 0", exception.getMessage());
    }

    @Test
    void testSobolSequenceGenerator_AboveMaxBoundary() {
        int dimension = SobolSequenceGenerator.MAX_DIMENSION + 1;
        Exception exception = assertThrows(OutOfRangeException.class, () -> {
            new SobolSequenceGenerator(dimension);
        });
        assertEquals("Dimension must be in the range [1, " + SobolSequenceGenerator.MAX_DIMENSION + "] but got: " + dimension, exception.getMessage());
    }

    @Test
    void testSobolSequenceGenerator_NullResourceStream() {
        // Assuming the resource is not available, we can simulate this by creating a subclass
        SobolSequenceGenerator generator = new SobolSequenceGenerator(1) {
            @Override
            protected InputStream getResourceAsStream(String resourceName) {
                return null; // Simulate missing resource
            }
        };
        Exception exception = assertThrows(MathInternalError.class, () -> {
            generator.initFromStream(null);
        });
        assertEquals("Internal error occurred", exception.getMessage());
    }
}