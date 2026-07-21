package org.apache.commons.math4.legacy.ml.clustering;

import org.apache.commons.math4.exception.NumberIsTooSmallException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MiniBatchKMeansClustererTest {

    @Test
    void testConstructor_ValidParameters() {
        MiniBatchKMeansClusterer clusterer = new MiniBatchKMeansClusterer(3, 100, 10, 5, 5, 3, null, null, null);
        assertNotNull(clusterer);
    }

    @Test
    void testConstructor_BatchSizeTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 0, 5, 5, 3, null, null, null);
        });
        assertEquals("0 < 1", exception.getMessage());
    }

    @Test
    void testConstructor_InitIterationsTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 10, 0, 5, 3, null, null, null);
        });
        assertEquals("0 < 1", exception.getMessage());
    }

    @Test
    void testConstructor_InitBatchSizeTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 10, 5, 0, 3, null, null, null);
        });
        assertEquals("0 < 1", exception.getMessage());
    }

    @Test
    void testConstructor_MaxNoImprovementTimesTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 10, 5, 5, 0, null, null, null);
        });
        assertEquals("0 < 1", exception.getMessage());
    }
}