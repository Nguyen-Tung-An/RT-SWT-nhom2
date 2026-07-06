package org.jfree.chart;

import org.junit.jupiter.api.Test;

import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.*;

public class JFreeChartTest {

    @Test
    void testCreateAlignedRectangle2D_LeftAlignTopAlign() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D result = createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.LEFT, VerticalAlignment.TOP);
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(10, result.getWidth());
        assertEquals(10, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_CenterAlign_CenterAlign() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D result = createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.CENTER, VerticalAlignment.CENTER);
        assertEquals(45, result.getX());
        assertEquals(45, result.getY());
        assertEquals(10, result.getWidth());
        assertEquals(10, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_RightAlign_BottomAlign() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D result = createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.RIGHT, VerticalAlignment.BOTTOM);
        assertEquals(90, result.getX());
        assertEquals(90, result.getY());
        assertEquals(10, result.getWidth());
        assertEquals(10, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_UnexpectedHorizontalAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        assertThrows(IllegalStateException.class, () -> {
            createAlignedRectangle2D(dimensions, frame, null, VerticalAlignment.TOP);
        });
    }

    @Test
    void testCreateAlignedRectangle2D_UnexpectedVerticalAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        assertThrows(IllegalStateException.class, () -> {
            createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.LEFT, null);
        });
    }
}