import com.google.gson.metrics.BagOfPrimitivesDeserializationBenchmark;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BagOfPrimitivesDeserializationBenchmarkTest {

    private final BagOfPrimitivesDeserializationBenchmark instance = new BagOfPrimitivesDeserializationBenchmark();
    private final String json = "{\"longField\": 123456789, \"intField\": 42, \"booleanField\": true, \"stringField\": \"test\"}";

    @Test
    public void testTimeBagOfPrimitivesReflectionStreaming_ValidInput() throws Exception {
        instance.timeBagOfPrimitivesReflectionStreaming(1);
        // Assert on the state of the BagOfPrimitives object after deserialization
        BagOfPrimitives bag = getBagOfPrimitives();
        assertEquals(123456789, bag.getLongField());
        assertEquals(42, bag.getIntField());
        assertEquals(true, bag.isBooleanField());
        assertEquals("test", bag.getStringField());
    }

    @Test
    public void testTimeBagOfPrimitivesReflectionStreaming_ZeroReps() throws Exception {
        instance.timeBagOfPrimitivesReflectionStreaming(0);
        // No assertion needed, just ensure it runs without exception
    }

    @Test
    public void testTimeBagOfPrimitivesReflectionStreaming_NegativeReps() {
        assertThrows(IllegalArgumentException.class, () -> {
            instance.timeBagOfPrimitivesReflectionStreaming(-1);
        });
    }

    @Test
    public void testTimeBagOfPrimitivesReflectionStreaming_UnexpectedFieldType() {
        String invalidJson = "{\"unexpectedField\": 123}";
        instance.setJson(invalidJson);
        assertThrows(RuntimeException.class, () -> {
            instance.timeBagOfPrimitivesReflectionStreaming(1);
        });
    }

    private BagOfPrimitives getBagOfPrimitives() throws Exception {
        Field field = BagOfPrimitivesDeserializationBenchmark.class.getDeclaredField("bag");
        field.setAccessible(true);
        return (BagOfPrimitives) field.get(instance);
    }
}