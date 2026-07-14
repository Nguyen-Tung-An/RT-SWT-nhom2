package org.jfree.chart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.geom.Rectangle2D;

public class JFreeChartTest {

    private JFreeChart createChart() {
        return new JFreeChart("Test Chart", new Plot() {});
    }

    @Test
    void testCreateAlignedRectangle2D_LeftAlignment() {
        Size2D dimensions = new Size2D(100, 50);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D result = createChart().createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.LEFT, VerticalAlignment.TOP);
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(100, result.getWidth());
        assertEquals(50, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_CenterAlignment() {
        Size2D dimensions = new Size2D(100, 50);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D result = createChart().createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.CENTER, VerticalAlignment.CENTER);
        assertEquals(50, result.getX());
        assertEquals(75, result.getY());
        assertEquals(100, result.getWidth());
        assertEquals(50, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_RightAlignment() {
        Size2D dimensions = new Size2D(100, 50);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D result = createChart().createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.RIGHT, VerticalAlignment.BOTTOM);
        assertEquals(100, result.getX());
        assertEquals(150, result.getY());
        assertEquals(100, result.getWidth());
        assertEquals(50, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_TopAlignment() {
        Size2D dimensions = new Size2D(100, 50);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D result = createChart().createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.CENTER, VerticalAlignment.TOP);
        assertEquals(50, result.getX());
        assertEquals(0, result.getY());
        assertEquals(100, result.getWidth());
        assertEquals(50, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_BottomAlignment() {
        Size2D dimensions = new Size2D(100, 50);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 200, 200);
        Rectangle2D result = createChart().createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.CENTER, VerticalAlignment.BOTTOM);
        assertEquals(50, result.getX());
        assertEquals(150, result.getY());
        assertEquals(100, result.getWidth());
        assertEquals(50, result.getHeight());
    }

    @Test
    void testCreateAlignedRectangle2D_IllegalStateException_HorizontalAlignment() {
        Size2D dimensions = new Size2D(100, 50);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 200, 200);
        assertThrows(IllegalStateException.class, () -> {
            createChart().createAlignedRectangle2D(dimensions, frame, null, VerticalAlignment.TOP);
        });
    }

    @Test
    void testCreateAlignedRectangle2D_IllegalStateException_VerticalAlignment() {
        Size2D dimensions = new Size2D(100, 50);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 200, 200);
        assertThrows(IllegalStateException.class, () -> {
            createChart().createAlignedRectangle2D(dimensions, frame, HorizontalAlignment.LEFT, null);
        });
    }
}