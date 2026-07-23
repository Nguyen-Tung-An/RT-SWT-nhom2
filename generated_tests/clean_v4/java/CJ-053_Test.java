package org.jfree.chart.plot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.jfree.chart.util.PaintUtils;

import java.awt.Paint;
import java.awt.Stroke;

class MeterIntervalTest {

    @Test
    void testEquals_SameObject() {
        MeterInterval interval = new MeterInterval("Label", new Range(0, 1));
        Assertions.assertTrue(interval.equals(interval));
    }

    @Test
    void testEquals_NullObject() {
        MeterInterval interval = new MeterInterval("Label", new Range(0, 1));
        Assertions.assertFalse(interval.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        MeterInterval interval = new MeterInterval("Label", new Range(0, 1));
        Assertions.assertFalse(interval.equals("Not a MeterInterval"));
    }

    @Test
    void testEquals_DifferentLabel() {
        MeterInterval interval1 = new MeterInterval("Label1", new Range(0, 1));
        MeterInterval interval2 = new MeterInterval("Label2", new Range(0, 1));
        Assertions.assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentRange() {
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 1));
        MeterInterval interval2 = new MeterInterval("Label", new Range(1, 2));
        Assertions.assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentOutlinePaint() {
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 1), PaintUtils.createColor(255, 0, 0), null, null);
        MeterInterval interval2 = new MeterInterval("Label", new Range(0, 1), PaintUtils.createColor(0, 255, 0), null, null);
        Assertions.assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentOutlineStroke() {
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 1), null, new BasicStroke(1.0f), null);
        MeterInterval interval2 = new MeterInterval("Label", new Range(0, 1), null, new BasicStroke(2.0f), null);
        Assertions.assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_DifferentBackgroundPaint() {
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 1), null, null, PaintUtils.createColor(255, 255, 255));
        MeterInterval interval2 = new MeterInterval("Label", new Range(0, 1), null, null, PaintUtils.createColor(0, 0, 0));
        Assertions.assertFalse(interval1.equals(interval2));
    }

    @Test
    void testEquals_EqualIntervals() {
        MeterInterval interval1 = new MeterInterval("Label", new Range(0, 1), PaintUtils.createColor(255, 0, 0), new BasicStroke(1.0f), PaintUtils.createColor(255, 255, 255));
        MeterInterval interval2 = new MeterInterval("Label", new Range(0, 1), PaintUtils.createColor(255, 0, 0), new BasicStroke(1.0f), PaintUtils.createColor(255, 255, 255));
        Assertions.assertTrue(interval1.equals(interval2));
    }
}