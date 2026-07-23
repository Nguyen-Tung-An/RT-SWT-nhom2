package org.jfree.chart.plot.compass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MeterNeedleTest {

    @Test
    void testEquals_SameInstance() {
        MeterNeedle needle = new MeterNeedle();
        assertTrue(needle.equals(needle));
    }

    @Test
    void testEquals_NullObject() {
        MeterNeedle needle = new MeterNeedle();
        assertFalse(needle.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        MeterNeedle needle = new MeterNeedle();
        assertFalse(needle.equals("Not a MeterNeedle"));
    }

    @Test
    void testEquals_DifferentOutlinePaint() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setOutlinePaint(Color.RED);
        needle2.setOutlinePaint(Color.BLUE);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentOutlineStroke() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setOutlineStroke(new BasicStroke(1.0f));
        needle2.setOutlineStroke(new BasicStroke(2.0f));
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentFillPaint() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setFillPaint(Color.GREEN);
        needle2.setFillPaint(Color.YELLOW);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentHighlightPaint() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setHighlightPaint(Color.BLACK);
        needle2.setHighlightPaint(Color.WHITE);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentSize() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setSize(10);
        needle2.setSize(20);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentRotateX() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setRotateX(5);
        needle2.setRotateX(10);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentRotateY() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setRotateY(5);
        needle2.setRotateY(10);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_SameProperties() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setOutlinePaint(Color.RED);
        needle1.setOutlineStroke(new BasicStroke(1.0f));
        needle1.setFillPaint(Color.GREEN);
        needle1.setHighlightPaint(Color.BLACK);
        needle1.setSize(10);
        needle1.setRotateX(5);
        needle1.setRotateY(5);

        needle2.setOutlinePaint(Color.RED);
        needle2.setOutlineStroke(new BasicStroke(1.0f));
        needle2.setFillPaint(Color.GREEN);
        needle2.setHighlightPaint(Color.BLACK);
        needle2.setSize(10);
        needle2.setRotateX(5);
        needle2.setRotateY(5);

        assertTrue(needle1.equals(needle2));
    }
}