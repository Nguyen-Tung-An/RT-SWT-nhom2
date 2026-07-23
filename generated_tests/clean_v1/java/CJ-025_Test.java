package org.jfree.data.statistics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeanAndStandardDeviationTest {

    @Test
    void testEquals_SameInstance() {
        MeanAndStandardDeviation instance = new MeanAndStandardDeviation();
        assertTrue(instance.equals(instance));
    }

    @Test
    void testEquals_DifferentClass() {
        MeanAndStandardDeviation instance = new MeanAndStandardDeviation();
        String differentClassObject = "Not a MeanAndStandardDeviation";
        assertFalse(instance.equals(differentClassObject));
    }

    @Test
    void testEquals_NullObject() {
        MeanAndStandardDeviation instance = new MeanAndStandardDeviation();
        assertFalse(instance.equals(null));
    }

    @Test
    void testEquals_DifferentMean() {
        MeanAndStandardDeviation instance1 = new MeanAndStandardDeviation();
        instance1.mean = 5.0;
        MeanAndStandardDeviation instance2 = new MeanAndStandardDeviation();
        instance2.mean = 10.0;
        assertFalse(instance1.equals(instance2));
    }

    @Test
    void testEquals_DifferentStandardDeviation() {
        MeanAndStandardDeviation instance1 = new MeanAndStandardDeviation();
        instance1.standardDeviation = 2.0;
        MeanAndStandardDeviation instance2 = new MeanAndStandardDeviation();
        instance2.standardDeviation = 3.0;
        assertFalse(instance1.equals(instance2));
    }

    @Test
    void testEquals_SameMeanAndStandardDeviation() {
        MeanAndStandardDeviation instance1 = new MeanAndStandardDeviation();
        instance1.mean = 5.0;
        instance1.standardDeviation = 2.0;
        MeanAndStandardDeviation instance2 = new MeanAndStandardDeviation();
        instance2.mean = 5.0;
        instance2.standardDeviation = 2.0;
        assertTrue(instance1.equals(instance2));
    }
}