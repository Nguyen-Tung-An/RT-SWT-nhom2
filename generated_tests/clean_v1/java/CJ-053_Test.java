package org.jfree.chart.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Paint;

public class MeterIntervalTest {

    @Test
    void testEquals_SameInstance() {
        MeterInterval interval = new MeterInterval("Label", null, null, null, null);
        assertTrue(interval.equals(interval));
    }

    @Test
    void testEquals_DifferentType() {
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
        MeterInterval interval2 = new MeterInterval("Label", new Range(5, 15), null, null, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentOutlinePaint() {
        Paint paint1 = new Color(255, 0, 0);
        Paint paint2 = new Color(0, 255, 0);
        MeterInterval interval1 = new MeterInterval("Label", null, paint1, null, null);
        MeterInterval interval2 = new MeterInterval("Label", null, paint2, null, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentOutlineStroke() {
        Stroke stroke1 = new BasicStroke(1.0f);
        Stroke stroke2 = new BasicStroke(2.0f);
        MeterInterval interval1 = new MeterInterval("Label", null, null, stroke1, null);
        MeterInterval interval2 = new MeterInterval("Label", null, null, stroke2, null);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentBackgroundPaint() {
        Paint paint1 = new Color(255, 255, 0);
        Paint paint2 = new Color(0, 0, 255);
        MeterInterval interval1 = new MeterInterval("Label", null, null, null, paint1);
        MeterInterval interval2 = new MeterInterval("Label", null, null, null, paint2);
        assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_EqualIntervals() {
        Paint paint = new Color(255, 0, 0);
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 10), paint, null, paint);
        MeterInterval interval2 = new MeterInterval("Label", new Range(0, 10), paint, null, paint);
        assertTrue(interval1.equals(interval2));
    }
}