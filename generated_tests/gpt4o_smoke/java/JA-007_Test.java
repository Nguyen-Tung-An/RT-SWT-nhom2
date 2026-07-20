import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.TextAnchor;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.labels.StandardCategoryURLGenerator;
import org.jfree.data.category.CategoryDataset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChartFactoryTest {

    @Test
    public void testCreateBarChartWithHorizontalOrientationAndTooltipsAndUrls() {
        CategoryDataset dataset = createSampleDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.HORIZONTAL, true, true, true);
        assertNotNull(chart);
        assertEquals("Title", chart.getTitle().getText());
        assertEquals(PlotOrientation.HORIZONTAL, ((CategoryPlot) chart.getPlot()).getOrientation());
    }

    @Test
    public void testCreateBarChartWithVerticalOrientationAndNoTooltipsAndUrls() {
        CategoryDataset dataset = createSampleDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.VERTICAL, false, false, false);
        assertNotNull(chart);
        assertEquals("Title", chart.getTitle().getText());
        assertEquals(PlotOrientation.VERTICAL, ((CategoryPlot) chart.getPlot()).getOrientation());
    }

    @Test
    public void testCreateBarChartWithNullOrientation() {
        CategoryDataset dataset = createSampleDataset();
        Exception exception = null;
        try {
            ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, null, true, true, true);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);
    }

    private CategoryDataset createSampleDataset() {
        // Implement a method to create a sample dataset for testing
        return null; // Replace with actual dataset creation logic
    }
}