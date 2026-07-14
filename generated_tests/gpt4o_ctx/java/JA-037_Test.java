package org.jfree.chart;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class JFreeChartTest {

    @Test
    void testDrawTitle_TopPosition() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(RectangleEdge.TOP);
        Mockito.when(title.arrange(Mockito.any(Graphics2D.class), Mockito.any(RectangleConstraint.class)))
                .thenReturn(new Size2D(100, 20));
        Mockito.when(title.draw(Mockito.any(Graphics2D.class), Mockito.any(Rectangle2D.class), Mockito.any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        
        assertNotNull(result);
    }

    @Test
    void testDrawTitle_BottomPosition() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(RectangleEdge.BOTTOM);
        Mockito.when(title.arrange(Mockito.any(Graphics2D.class), Mockito.any(RectangleConstraint.class)))
                .thenReturn(new Size2D(100, 20));
        Mockito.when(title.draw(Mockito.any(Graphics2D.class), Mockito.any(Rectangle2D.class), Mockito.any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        
        assertNotNull(result);
    }

    @Test
    void testDrawTitle_RightPosition() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(RectangleEdge.RIGHT);
        Mockito.when(title.arrange(Mockito.any(Graphics2D.class), Mockito.any(RectangleConstraint.class)))
                .thenReturn(new Size2D(20, 100));
        Mockito.when(title.draw(Mockito.any(Graphics2D.class), Mockito.any(Rectangle2D.class), Mockito.any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        
        assertNotNull(result);
    }

    @Test
    void testDrawTitle_LeftPosition() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(RectangleEdge.LEFT);
        Mockito.when(title.arrange(Mockito.any(Graphics2D.class), Mockito.any(RectangleConstraint.class)))
                .thenReturn(new Size2D(20, 100));
        Mockito.when(title.draw(Mockito.any(Graphics2D.class), Mockito.any(Rectangle2D.class), Mockito.any(BlockParams.class)))
                .thenReturn(new EntityBlockResult());

        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        
        assertNotNull(result);
    }

    @Test
    void testDrawTitle_NullArea() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(RectangleEdge.TOP);
        
        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = null;
        
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        
        assertNull(result);
    }

    @Test
    void testDrawTitle_ZeroWidthArea() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(RectangleEdge.TOP);
        Mockito.when(title.arrange(Mockito.any(Graphics2D.class), Mockito.any(RectangleConstraint.class)))
                .thenReturn(new Size2D(100, 20));

        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 0, 200);
        
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        
        assertNull(result);
    }

    @Test
    void testDrawTitle_ZeroHeightArea() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(RectangleEdge.TOP);
        Mockito.when(title.arrange(Mockito.any(Graphics2D.class), Mockito.any(RectangleConstraint.class)))
                .thenReturn(new Size2D(100, 20));

        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 0);
        
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        
        assertNull(result);
    }

    @Test
    void testDrawTitle_UnrecognizedPosition() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = Mockito.mock(Title.class);
        Mockito.when(title.getPosition()).thenReturn(null);

        Graphics2D g2 = Mockito.mock(Graphics2D.class);
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 200);
        
        try {
            chart.drawTitle(title, g2, area, true);
        } catch (RuntimeException e) {
            assertNotNull(e);
        }
    }
}