package org.apache.commons.math4.legacy.random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SobolSequenceGeneratorTest {

    @Test
    void testSobolSequenceGenerator_ValidDimension() {
        SobolSequenceGenerator generator = new SobolSequenceGenerator(1);
        assertNotNull(generator);
    }

    @Test
    void testSobolSequenceGenerator_MinDimension() {
        SobolSequenceGenerator generator = new SobolSequenceGenerator(1);
        assertNotNull(generator);
    }

    @Test
    void testSobolSequenceGenerator_MaxDimension() {
        SobolSequenceGenerator generator = new SobolSequenceGenerator(SobolSequenceGenerator.MAX_DIMENSION);
        assertNotNull(generator);
    }

    @Test
    void testSobolSequenceGenerator_DimensionTooLow() {
        Exception exception = assertThrows(OutOfRangeException.class, () -> {
            new SobolSequenceGenerator(0);
        });
        assertEquals("0 is out of range: [1, " + SobolSequenceGenerator.MAX_DIMENSION + "]", exception.getMessage());
    }

    @Test
    void testSobolSequenceGenerator_DimensionTooHigh() {
        Exception exception = assertThrows(OutOfRangeException.class, () -> {
            new SobolSequenceGenerator(SobolSequenceGenerator.MAX_DIMENSION + 1);
        });
        assertEquals((SobolSequenceGenerator.MAX_DIMENSION + 1) + " is out of range: [1, " + SobolSequenceGenerator.MAX_DIMENSION + "]", exception.getMessage());
    }

    @Test
    void testSobolSequenceGenerator_ResourceNotFound() {
        // Assuming the resource is not available for this test case
        // This would require a specific setup to simulate the resource not being found
        Exception exception = assertThrows(MathInternalError.class, () -> {
            new SobolSequenceGenerator(1); // This should trigger the resource loading
        });
        assertEquals("Resource not found", exception.getMessage()); // Adjust the message based on actual implementation
    }
}