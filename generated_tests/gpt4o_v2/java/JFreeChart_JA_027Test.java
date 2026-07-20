import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.HorizontalAlignment;
import org.jfree.chart.axis.VerticalAlignment;
import org.jfree.chart.util.Size2D;
import org.junit.jupiter.api.Test;

import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JFreeChartTest {

    private final JFreeChart chart = new JFreeChart(null);

    @Test
    void testCreateAlignedRectangle2D_LeftAlignment_TopAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D result = invokeCreateAlignedRectangle2D(dimensions, frame, HorizontalAlignment.LEFT, VerticalAlignment.TOP);
        assertEquals(new Rectangle2D.Double(0, 0, 10, 10), result);
    }

    @Test
    void testCreateAlignedRectangle2D_CenterAlignment_CenterAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D result = invokeCreateAlignedRectangle2D(dimensions, frame, HorizontalAlignment.CENTER, VerticalAlignment.CENTER);
        assertEquals(new Rectangle2D.Double(45, 45, 10, 10), result);
    }

    @Test
    void testCreateAlignedRectangle2D_RightAlignment_BottomAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        Rectangle2D result = invokeCreateAlignedRectangle2D(dimensions, frame, HorizontalAlignment.RIGHT, VerticalAlignment.BOTTOM);
        assertEquals(new Rectangle2D.Double(90, 90, 10, 10), result);
    }

    @Test
    void testCreateAlignedRectangle2D_NullHorizontalAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        assertThrows(NullPointerException.class, () -> invokeCreateAlignedRectangle2D(dimensions, frame, null, VerticalAlignment.TOP));
    }

    @Test
    void testCreateAlignedRectangle2D_NullVerticalAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        assertThrows(NullPointerException.class, () -> invokeCreateAlignedRectangle2D(dimensions, frame, HorizontalAlignment.LEFT, null));
    }

    @Test
    void testCreateAlignedRectangle2D_UnexpectedHorizontalAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        assertThrows(IllegalStateException.class, () -> invokeCreateAlignedRectangle2D(dimensions, frame, null, VerticalAlignment.TOP));
    }

    @Test
    void testCreateAlignedRectangle2D_UnexpectedVerticalAlignment() {
        Size2D dimensions = new Size2D(10, 10);
        Rectangle2D frame = new Rectangle2D.Double(0, 0, 100, 100);
        assertThrows(IllegalStateException.class, () -> invokeCreateAlignedRectangle2D(dimensions, frame, HorizontalAlignment.LEFT, null));
    }

    private Rectangle2D invokeCreateAlignedRectangle2D(Size2D dimensions, Rectangle2D frame, HorizontalAlignment hAlign, VerticalAlignment vAlign) {
        try {
            java.lang.reflect.Method method = JFreeChart.class.getDeclaredMethod("createAlignedRectangle2D", Size2D.class, Rectangle2D.class, HorizontalAlignment.class, VerticalAlignment.class);
            method.setAccessible(true);
            return (Rectangle2D) method.invoke(chart, dimensions, frame, hAlign, vAlign);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}