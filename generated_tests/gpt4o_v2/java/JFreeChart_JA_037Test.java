import org.jfree.chart.JFreeChart;
import org.jfree.chart.title.Title;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.EntityBlockResult;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Rectangle2D;
import org.jfree.chart.util.Size2D;
import org.jfree.chart.util.BlockParams;
import org.jfree.chart.util.RectangleConstraint;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.VerticalAlignment;
import org.junit.jupiter.api.Test;

import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class JFreeChartTest {

    private JFreeChart createChart() {
        // Create a JFreeChart instance (mocked or real)
        return new JFreeChart("Test Chart", new Font("Serif", Font.PLAIN, 12), new TextTitle("Title"), true);
    }

    @Test
    void testDrawTitleTop() {
        JFreeChart chart = createChart();
        Title title = new TextTitle("Top Title");
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        boolean entities = true;

        EntityCollection result = chart.drawTitle(title, g2, area, entities);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleBottom() {
        JFreeChart chart = createChart();
        Title title = new TextTitle("Bottom Title");
        title.setPosition(RectangleEdge.BOTTOM);
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        boolean entities = true;

        EntityCollection result = chart.drawTitle(title, g2, area, entities);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleLeft() {
        JFreeChart chart = createChart();
        Title title = new TextTitle("Left Title");
        title.setPosition(RectangleEdge.LEFT);
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        boolean entities = true;

        EntityCollection result = chart.drawTitle(title, g2, area, entities);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleRight() {
        JFreeChart chart = createChart();
        Title title = new TextTitle("Right Title");
        title.setPosition(RectangleEdge.RIGHT);
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        boolean entities = true;

        EntityCollection result = chart.drawTitle(title, g2, area, entities);
        assertNotNull(result);
    }

    @Test
    void testDrawTitleWithZeroWidth() {
        JFreeChart chart = createChart();
        Title title = new TextTitle("Zero Width Title");
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 0, 100);
        boolean entities = true;

        EntityCollection result = chart.drawTitle(title, g2, area, entities);
        assertNull(result);
    }

    @Test
    void testDrawTitleWithZeroHeight() {
        JFreeChart chart = createChart();
        Title title = new TextTitle("Zero Height Title");
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 0);
        boolean entities = true;

        EntityCollection result = chart.drawTitle(title, g2, area, entities);
        assertNull(result);
    }

    @Test
    void testDrawTitleWithNullTitle() {
        JFreeChart chart = createChart();
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        Rectangle2D area = new Rectangle2D.Double(0, 0, 100, 100);
        boolean entities = true;

        assertThrows(NullPointerException.class, () -> {
            chart.drawTitle(null, g2, area, entities);
        });
    }

    @Test
    void testDrawTitleWithNullArea() {
        JFreeChart chart = createChart();
        Title title = new TextTitle("Null Area Title");
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        boolean entities = true;

        assertThrows(NullPointerException.class, () -> {
            chart.drawTitle(title, g2, null, entities);
        });
    }
}