import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.renderer.xy.XYItemRendererState;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.geom.Rectangle2D;

import static org.junit.jupiter.api.Assertions.*;

class XYLineAndShapeRendererTest {

    @Test
    void testDrawPrimaryLineAsPath_ValidData() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYItemRendererState state = new XYItemRendererState(null);
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        XYPlot plot = new XYPlot();
        XYDataset dataset = createDataset();
        ValueAxis domainAxis = new NumberAxis("X");
        ValueAxis rangeAxis = new NumberAxis("Y");
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        assertTrue(state.isLastPointGood());
    }

    @Test
    void testDrawPrimaryLineAsPath_NaNValues() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYItemRendererState state = new XYItemRendererState(null);
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        XYPlot plot = new XYPlot();
        XYDataset dataset = createDatasetWithNaN();
        ValueAxis domainAxis = new NumberAxis("X");
        ValueAxis rangeAxis = new NumberAxis("Y");
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);

        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        assertFalse(state.isLastPointGood());
    }

    @Test
    void testDrawPrimaryLineAsPath_LastItem() {
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        XYItemRendererState state = new XYItemRendererState(null);
        Graphics2D g2 = (Graphics2D) new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB).getGraphics();
        XYPlot plot = new XYPlot();
        XYDataset dataset = createDataset();
        ValueAxis domainAxis = new NumberAxis("X");
        ValueAxis rangeAxis = new NumberAxis("Y");
        Rectangle2D dataArea = new Rectangle2D.Double(0, 0, 100, 100);
        state.setLastItemIndex(0);

        renderer.drawPrimaryLineAsPath(state, g2, plot, dataset, 0, 0, 0, domainAxis, rangeAxis, dataArea);

        assertTrue(state.isLastPointGood());
    }

    private XYDataset createDataset() {
        DefaultXYDataset dataset = new DefaultXYDataset();
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        dataset.addSeries("Series1", data);
        return dataset;
    }

    private XYDataset createDatasetWithNaN() {
        DefaultXYDataset dataset = new DefaultXYDataset();
        double[][] data = {{Double.NaN, 2.0}, {3.0, 4.0}};
        dataset.addSeries("Series1", data);
        return dataset;
    }
}