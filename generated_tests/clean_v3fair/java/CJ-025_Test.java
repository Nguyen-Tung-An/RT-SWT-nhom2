package org.jfree.data.statistics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeanAndStandardDeviationTest {

    @Test
    void testEquals_SameInstance() {
        MeanAndStandardDeviation msd = new MeanAndStandardDeviation();
        assertTrue(msd.equals(msd));
    }

    @Test
    void testEquals_DifferentClass() {
        MeanAndStandardDeviation msd = new MeanAndStandardDeviation();
        assertFalse(msd.equals("Not a MeanAndStandardDeviation"));
    }

    @Test
    void testEquals_NullObject() {
        MeanAndStandardDeviation msd = new MeanAndStandardDeviation();
        assertFalse(msd.equals(null));
    }

    @Test
    void testEquals_DifferentMean() {
        MeanAndStandardDeviation msd1 = new MeanAndStandardDeviation();
        msd1.setMean(5.0);
        MeanAndStandardDeviation msd2 = new MeanAndStandardDeviation();
        msd2.setMean(10.0);
        assertFalse(msd1.equals(msd2));
    }

    @Test
    void testEquals_DifferentStandardDeviation() {
        MeanAndStandardDeviation msd1 = new MeanAndStandardDeviation();
        msd1.setStandardDeviation(2.0);
        MeanAndStandardDeviation msd2 = new MeanAndStandardDeviation();
        msd2.setStandardDeviation(3.0);
        assertFalse(msd1.equals(msd2));
    }

    @Test
    void testEquals_SameMeanAndStandardDeviation() {
        MeanAndStandardDeviation msd1 = new MeanAndStandardDeviation();
        msd1.setMean(5.0);
        msd1.setStandardDeviation(2.0);
        MeanAndStandardDeviation msd2 = new MeanAndStandardDeviation();
        msd2.setMean(5.0);
        msd2.setStandardDeviation(2.0);
        assertTrue(msd1.equals(msd2));
    }
}