package org.jfree.chart.plot.compass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Paint;

public class MeterNeedleTest {

    @Test
    void testEquals_SameInstance() {
        MeterNeedle needle = new MeterNeedle();
        assertTrue(needle.equals(needle));
    }

    @Test
    void testEquals_DifferentClass() {
        MeterNeedle needle = new MeterNeedle();
        String notANeedle = "Not a MeterNeedle";
        assertFalse(needle.equals(notANeedle));
    }

    @Test
    void testEquals_Null() {
        MeterNeedle needle = new MeterNeedle();
        assertFalse(needle.equals(null));
    }

    @Test
    void testEquals_DifferentProperties() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setOutlinePaint(null);
        needle2.setOutlinePaint(new Paint() {});
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_SameProperties() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setOutlinePaint(new Paint() {});
        needle2.setOutlinePaint(new Paint() {});
        needle1.setOutlineStroke(new BasicStroke(1.0f));
        needle2.setOutlineStroke(new BasicStroke(1.0f));
        needle1.setFillPaint(new Paint() {});
        needle2.setFillPaint(new Paint() {});
        needle1.setHighlightPaint(new Paint() {});
        needle2.setHighlightPaint(new Paint() {});
        needle1.setSize(10);
        needle2.setSize(10);
        needle1.setRotateX(5);
        needle2.setRotateX(5);
        needle1.setRotateY(5);
        needle2.setRotateY(5);
        assertTrue(needle1.equals(needle2));
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
        needle1.setRotateX(10);
        needle2.setRotateX(20);
        assertFalse(needle1.equals(needle2));
    }

    @Test
    void testEquals_DifferentRotateY() {
        MeterNeedle needle1 = new MeterNeedle();
        MeterNeedle needle2 = new MeterNeedle();
        needle1.setRotateY(10);
        needle2.setRotateY(20);
        assertFalse(needle1.equals(needle2));
    }
}