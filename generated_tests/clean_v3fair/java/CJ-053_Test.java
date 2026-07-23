package org.jfree.chart.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeterIntervalTest {

    @Test
    void testEquals_SameInstance() {
        MeterInterval interval = new MeterInterval("Label", null, null, null, null);
        assertTrue(interval.equals(interval));
    }

    @Test
    void testEquals_DifferentClass() {
        MeterInterval interval = new MeterInterval("Label", null, null, null, null);
        assertFalse(interval.equals("Not a MeterInterval"));
    }

    @Test
    void testEquals_DifferentLabel() {
        MeterInterval interval1 = new MeterInterval("Label1", null, null, null, null);
        MeterInterval interval2 = new MeterInterval("Label2", null, null, null, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentRange() {
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 10), null, null, null);
        MeterInterval interval2 = new MeterInterval("Label", new Range(10, 20), null, null, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentOutlinePaint() {
        MeterInterval interval1 = new MeterInterval("Label", null, Color.RED, null, null);
        MeterInterval interval2 = new MeterInterval("Label", null, Color.BLUE, null, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentOutlineStroke() {
        MeterInterval interval1 = new MeterInterval("Label", null, null, new BasicStroke(1.0f), null);
        MeterInterval interval2 = new MeterInterval("Label", null, null, new BasicStroke(2.0f), null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentBackgroundPaint() {
        MeterInterval interval1 = new MeterInterval("Label", null, null, null, Color.GREEN);
        MeterInterval interval2 = new MeterInterval("Label", null, null, null, Color.YELLOW);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_SameProperties() {
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 10), Color.RED, new BasicStroke(1.0f), Color.GREEN);
        MeterInterval interval2 = new MeterInterval("Label", new Range(0, 10), Color.RED, new BasicStroke(1.0f), Color.GREEN);
        assertTrue(interval1.equals(interval2));
    }
}