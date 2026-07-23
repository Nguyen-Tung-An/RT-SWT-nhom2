package com.google.gson.metrics;

import com.google.gson.stream.JsonReader;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class BagOfPrimitivesDeserializationBenchmarkTest {

    private final String json = "{\"longField\": 123456789, \"intField\": 42, \"booleanField\": true, \"stringField\": \"test\"}";

    @Test
    void testTimeBagOfPrimitivesReflectionStreaming_ValidInput() throws Exception {
        BagOfPrimitivesDeserializationBenchmark benchmark = new BagOfPrimitivesDeserializationBenchmark();
        benchmark.timeBagOfPrimitivesReflectionStreaming(1);
        // Add assertions to verify the state of BagOfPrimitives if needed
    }

    @Test
    void testTimeBagOfPrimitivesReflectionStreaming_ZeroReps() throws Exception {
        BagOfPrimitivesDeserializationBenchmark benchmark = new BagOfPrimitivesDeserializationBenchmark();
        benchmark.timeBagOfPrimitivesReflectionStreaming(0);
        // No assertions needed, just ensuring it runs without exception
    }

    @Test
    void testTimeBagOfPrimitivesReflectionStreaming_InvalidField() {
        String invalidJson = "{\"invalidField\": 123}";
        BagOfPrimitivesDeserializationBenchmark benchmark = new BagOfPrimitivesDeserializationBenchmark() {
            @Override
            protected String getJson() {
                return invalidJson;
            }
        };
        Exception exception = assertThrows(RuntimeException.class, () -> {
            benchmark.timeBagOfPrimitivesReflectionStreaming(1);
        });
        assertTrue(exception.getMessage().contains("Unexpected: type:"));
    }
}