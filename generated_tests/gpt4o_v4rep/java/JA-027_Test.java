import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.Size2D;
import org.jfree.chart.util.VerticalAlignment;
import org.junit.jupiter.api.Test;

import java.awt.geom.Rectangle2D;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JFreeChartTest {

    @Test
    public void testCreateAlignedRectangle2D_LeftAlignment() throws Exception {
        JFreeChart chart = new JFreeChart((Plot) null);
        Field frameField = JFreeChart.class.getDeclaredField("frame");
        frameField.setAccessible(true);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        frameField.set(chart, frame);

        Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
        method.setAccessible(true);

        Size2D dimensions = new Size2D(20, 20);
        Rectangle2D result = (Rectangle2D) method.invoke(chart, dimensions, frame, HorizontalAlignment.LEFT, VerticalAlignment.TOP);

        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(20, result.getWidth());
        assertEquals(20, result.getHeight());
    }

    @Test
    public void testCreateAlignedRectangle2D_CenterAlignment() throws Exception {
        JFreeChart chart = new JFreeChart((Plot) null);
        Field frameField = JFreeChart.class.getDeclaredField("frame");
        frameField.setAccessible(true);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        frameField.set(chart, frame);

        Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
        method.setAccessible(true);

        Size2D dimensions = new Size2D(20, 20);
        Rectangle2D result = (Rectangle2D) method.invoke(chart, dimensions, frame, HorizontalAlignment.CENTER, VerticalAlignment.CENTER);

        assertEquals(40, result.getX());
        assertEquals(40, result.getY());
        assertEquals(20, result.getWidth());
        assertEquals(20, result.getHeight());
    }

    @Test
    public void testCreateAlignedRectangle2D_RightAlignment() throws Exception {
        JFreeChart chart = new JFreeChart((Plot) null);
        Field frameField = JFreeChart.class.getDeclaredField("frame");
        frameField.setAccessible(true);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        frameField.set(chart, frame);

        Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
        method.setAccessible(true);

        Size2D dimensions = new Size2D(20, 20);
        Rectangle2D result = (Rectangle2D) method.invoke(chart, dimensions, frame, HorizontalAlignment.RIGHT, VerticalAlignment.BOTTOM);

        assertEquals(80, result.getX());
        assertEquals(80, result.getY());
        assertEquals(20, result.getWidth());
        assertEquals(20, result.getHeight());
    }

    @Test
    public void testCreateAlignedRectangle2D_NullHorizontalAlignment() throws Exception {
        JFreeChart chart = new JFreeChart((Plot) null);
        Field frameField = JFreeChart.class.getDeclaredField("frame");
        frameField.setAccessible(true);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        frameField.set(chart, frame);

        Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
        method.setAccessible(true);

        Size2D dimensions = new Size2D(20, 20);
        assertThrows(NullPointerException.class, () -> {
            method.invoke(chart, dimensions, frame, null, VerticalAlignment.TOP);
        });
    }

    @Test
    public void testCreateAlignedRectangle2D_NullVerticalAlignment() throws Exception {
        JFreeChart chart = new JFreeChart((Plot) null);
        Field frameField = JFreeChart.class.getDeclaredField("frame");
        frameField.setAccessible(true);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        frameField.set(chart, frame);

        Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
        method.setAccessible(true);

        Size2D dimensions = new Size2D(20, 20);
        assertThrows(NullPointerException.class, () -> {
            method.invoke(chart, dimensions, frame, HorizontalAlignment.LEFT, null);
        });
    }

    @Test
    public void testCreateAlignedRectangle2D_UnexpectedHorizontalAlignment() throws Exception {
        JFreeChart chart = new JFreeChart((Plot) null);
        Field frameField = JFreeChart.class.getDeclaredField("frame");
        frameField.setAccessible(true);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        frameField.set(chart, frame);

        Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
        method.setAccessible(true);

        Size2D dimensions = new Size2D(20, 20);
        assertThrows(IllegalStateException.class, () -> {
            method.invoke(chart, dimensions, frame, null, VerticalAlignment.TOP);
        });
    }

    @Test
    public void testCreateAlignedRectangle2D_UnexpectedVerticalAlignment() throws Exception {
        JFreeChart chart = new JFreeChart((Plot) null);
        Field frameField = JFreeChart.class.getDeclaredField("frame");
        frameField.setAccessible(true);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        frameField.set(chart, frame);

        Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
        method.setAccessible(true);

        Size2D dimensions = new Size2D(20, 20);
        assertThrows(IllegalStateException.class, () -> {
            method.invoke(chart, dimensions, frame, HorizontalAlignment.LEFT, null);
        });
    }
}