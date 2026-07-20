package org.jfree.chart;

import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.EntityBlockResult;
import org.jfree.chart.title.Title;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.RectangleEdge;
import org.jfree.chart.util.RectangleConstraint;
import org.jfree.chart.util.Size2D;
import org.jfree.chart.util.BlockParams;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.VerticalAlignment;
import org.jfree.data.Range;

import java.awt.*;
import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JFreeChartTest {

    private class TestTitle extends Title {
        private RectangleEdge position;

        public TestTitle(RectangleEdge position) {
            this.position = position;
        }

        @Override
        public RectangleEdge getPosition() {
            return position;
        }

        @Override
        public Size2D arrange(Graphics2D g2, RectangleConstraint constraint) {
            return new Size2D(100, 20);
        }

        @Override
        public Object draw(Graphics2D g2, Rectangle2D area, BlockParams params) {
            return new EntityBlockResult(new EntityCollection());
        }
    }

    @Test
    void testDrawTitleTop() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = new TestTitle(RectangleEdge.TOP);
        Graphics2D g2 = (Graphics2D) new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 100);
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleBottom() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = new TestTitle(RectangleEdge.BOTTOM);
        Graphics2D g2 = (Graphics2D) new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 100);
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleRight() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = new TestTitle(RectangleEdge.RIGHT);
        Graphics2D g2 = (Graphics2D) new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 100);
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleLeft() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = new TestTitle(RectangleEdge.LEFT);
        Graphics2D g2 = (Graphics2D) new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 100);
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleNullTitle() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Graphics2D g2 = (Graphics2D) new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 100);
        assertThrows(NullPointerException.class, () -> {
            chart.drawTitle(null, g2, area, true);
        });
    }

    @Test
    void testDrawTitleZeroWidth() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = new TestTitle(RectangleEdge.TOP);
        Graphics2D g2 = (Graphics2D) new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 0, 100);
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        assertNull(result);
    }

    @Test
    void testDrawTitleZeroHeight() {
        JFreeChart chart = new JFreeChart(new Plot() {});
        Title title = new TestTitle(RectangleEdge.TOP);
        Graphics2D g2 = (Graphics2D) new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 200, 0);
        EntityCollection result = chart.drawTitle(title, g2, area, true);
        assertNull(result);
    }
}