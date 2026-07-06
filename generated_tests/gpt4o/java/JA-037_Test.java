package org.jfree.chart;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class JFreeChartTest {

    @Test
    void testDrawTitle_NullTitle() {
        JFreeChart chart = new JFreeChart();
        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        assertNull(chart.drawTitle(null, g2, area, true));
    }

    @Test
    void testDrawTitle_NullArea() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        Graphics2D g2 = mock(Graphics2D.class);
        assertNull(chart.drawTitle(title, g2, null, true));
    }

    @Test
    void testDrawTitle_WidthZero() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 0, 100);
        assertNull(chart.drawTitle(title, g2, area, true));
    }

    @Test
    void testDrawTitle_HeightZero() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 0);
        assertNull(chart.drawTitle(title, g2, area, true));
    }

    @Test
    void testDrawTitle_TopPosition() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        when(title.getPosition()).thenReturn(RectangleEdge.TOP);
        when(title.arrange(any(Graphics2D.class), any(RectangleConstraint.class)))
                .thenReturn(new Size2D(100, 20));
        when(title.draw(any(Graphics2D.class), any(Rectangle2D.class), any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        assertNotNull(chart.drawTitle(title, g2, area, true));
    }

    @Test
    void testDrawTitle_BottomPosition() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        when(title.getPosition()).thenReturn(RectangleEdge.BOTTOM);
        when(title.arrange(any(Graphics2D.class), any(RectangleConstraint.class)))
                .thenReturn(new Size2D(100, 20));
        when(title.draw(any(Graphics2D.class), any(Rectangle2D.class), any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        assertNotNull(chart.drawTitle(title, g2, area, true));
    }

    @Test
    void testDrawTitle_RightPosition() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        when(title.getPosition()).thenReturn(RectangleEdge.RIGHT);
        when(title.arrange(any(Graphics2D.class), any(RectangleConstraint.class)))
                .thenReturn(new Size2D(20, 100));
        when(title.draw(any(Graphics2D.class), any(Rectangle2D.class), any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        assertNotNull(chart.drawTitle(title, g2, area, true));
    }

    @Test
    void testDrawTitle_LeftPosition() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        when(title.getPosition()).thenReturn(RectangleEdge.LEFT);
        when(title.arrange(any(Graphics2D.class), any(RectangleConstraint.class)))
                .thenReturn(new Size2D(20, 100));
        when(title.draw(any(Graphics2D.class), any(Rectangle2D.class), any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        assertNotNull(chart.drawTitle(title, g2, area, true));
    }

    @Test
    void testDrawTitle_UnrecognizedPosition() {
        JFreeChart chart = new JFreeChart();
        Title title = mock(Title.class);
        when(title.getPosition()).thenReturn(null); // Simulate unrecognized position
        Graphics2D g2 = mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        assertThrows(RuntimeException.class, () -> chart.drawTitle(title, g2, area, true));
    }
}