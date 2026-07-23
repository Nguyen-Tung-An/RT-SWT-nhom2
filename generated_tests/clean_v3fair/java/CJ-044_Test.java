package com.google.gson.metrics;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class BagOfPrimitivesDeserializationBenchmarkTest {

    @Test
    void testTimeBagOfPrimitivesReflectionStreaming_ZeroReps() throws Exception {
        BagOfPrimitivesDeserializationBenchmark benchmark = new BagOfPrimitivesDeserializationBenchmark();
        benchmark.timeBagOfPrimitivesReflectionStreaming(0); // Test with zero repetitions
    }

    @Test
    void testTimeBagOfPrimitivesReflectionStreaming_OneRep() throws Exception {
        BagOfPrimitivesDeserializationBenchmark benchmark = new BagOfPrimitivesDeserializationBenchmark();
        benchmark.timeBagOfPrimitivesReflectionStreaming(1); // Test with one repetition
    }

    @Test
    void testTimeBagOfPrimitivesReflectionStreaming_MultipleReps() throws Exception {
        BagOfPrimitivesDeserializationBenchmark benchmark = new BagOfPrimitivesDeserializationBenchmark();
        benchmark.timeBagOfPrimitivesReflectionStreaming(10); // Test with multiple repetitions
    }

    @Test
    void testTimeBagOfPrimitivesReflectionStreaming_InvalidFieldType() {
        BagOfPrimitivesDeserializationBenchmark benchmark = new BagOfPrimitivesDeserializationBenchmark();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            benchmark.timeBagOfPrimitivesReflectionStreaming(1); // Assuming the JSON input leads to an unexpected field type
        });
        assertTrue(exception.getMessage().contains("Unexpected: type:"));
    }
}