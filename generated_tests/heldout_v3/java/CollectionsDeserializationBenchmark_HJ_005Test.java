import com.google.gson.metrics.CollectionsDeserializationBenchmark;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionsDeserializationBenchmarkTest {

    @Test
    public void testTimeCollectionsStreamingWithZero() {
        CollectionsDeserializationBenchmark instance = new CollectionsDeserializationBenchmark();
        long result = instance.timeCollectionsStreaming(0);
        assertTrue(result >= 0, "Result should be non-negative for input 0");
    }

    @Test
    public void testTimeCollectionsStreamingWithPositiveValue() {
        CollectionsDeserializationBenchmark instance = new CollectionsDeserializationBenchmark();
        long result = instance.timeCollectionsStreaming(10);
        assertTrue(result >= 0, "Result should be non-negative for positive input");
    }

    @Test
    public void testTimeCollectionsStreamingWithNegativeValue() {
        CollectionsDeserializationBenchmark instance = new CollectionsDeserializationBenchmark();
        long result = instance.timeCollectionsStreaming(-5);
        assertTrue(result >= 0, "Result should be non-negative for negative input");
    }

    @Test
    public void testTimeCollectionsStreamingWithLargeValue() {
        CollectionsDeserializationBenchmark instance = new CollectionsDeserializationBenchmark();
        long result = instance.timeCollectionsStreaming(Integer.MAX_VALUE);
        assertTrue(result >= 0, "Result should be non-negative for large input");
    }
}