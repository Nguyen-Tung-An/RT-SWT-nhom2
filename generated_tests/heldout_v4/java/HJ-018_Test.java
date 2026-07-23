import org.apache.commons.math4.legacy.ml.clustering.MiniBatchKMeansClusterer;
import org.apache.commons.math4.exception.NumberIsTooSmallException;
import org.apache.commons.math4.ml.distance.DistanceMeasure;
import org.apache.commons.math4.random.UniformRandomProvider;
import org.apache.commons.math4.legacy.ml.clustering.EmptyClusterStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiniBatchKMeansClustererTest {

    private final DistanceMeasure measure = new DistanceMeasure() {
        @Override
        public double compute(double[] a, double[] b) {
            return 0; // Dummy implementation for testing
        }
    };
    
    private final UniformRandomProvider random = new UniformRandomProvider() {
        @Override
        public double nextDouble() {
            return 0; // Dummy implementation for testing
        }
    };

    private final EmptyClusterStrategy emptyStrategy = new EmptyClusterStrategy() {
        @Override
        public void apply() {
            // Dummy implementation for testing
        }
    };

    @Test
    void testValidParameters() {
        MiniBatchKMeansClusterer clusterer = new MiniBatchKMeansClusterer(3, 100, 10, 5, 5, 5, measure, random, emptyStrategy);
        assertNotNull(clusterer);
    }

    @Test
    void testBatchSizeTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 0, 5, 5, 5, measure, random, emptyStrategy);
        });
        assertEquals("The value 0 is too small. The minimum is 1.", exception.getMessage());
    }

    @Test
    void testInitIterationsTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 10, 0, 5, 5, measure, random, emptyStrategy);
        });
        assertEquals("The value 0 is too small. The minimum is 1.", exception.getMessage());
    }

    @Test
    void testInitBatchSizeTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 10, 5, 0, 5, measure, random, emptyStrategy);
        });
        assertEquals("The value 0 is too small. The minimum is 1.", exception.getMessage());
    }

    @Test
    void testMaxNoImprovementTimesTooSmall() {
        Exception exception = assertThrows(NumberIsTooSmallException.class, () -> {
            new MiniBatchKMeansClusterer(3, 100, 10, 5, 5, 0, measure, random, emptyStrategy);
        });
        assertEquals("The value 0 is too small. The minimum is 1.", exception.getMessage());
    }
}