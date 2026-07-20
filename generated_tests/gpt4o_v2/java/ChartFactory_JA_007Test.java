import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChartFactoryTest {

    @Test
    void testCreateBarChartWithHorizontalOrientation() {
        CategoryDataset dataset = createSampleDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.HORIZONTAL, true, true, true);
        
        assertNotNull(chart);
        assertEquals("Title", chart.getTitle().getText());
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        assertEquals(PlotOrientation.HORIZONTAL, plot.getOrientation());
        assertTrue(plot.getRenderer() instanceof BarRenderer);
    }

    @Test
    void testCreateBarChartWithVerticalOrientation() {
        CategoryDataset dataset = createSampleDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.VERTICAL, true, true, true);
        
        assertNotNull(chart);
        assertEquals("Title", chart.getTitle().getText());
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        assertEquals(PlotOrientation.VERTICAL, plot.getOrientation());
        assertTrue(plot.getRenderer() instanceof BarRenderer);
    }

    @Test
    void testCreateBarChartWithoutTooltipsAndUrls() {
        CategoryDataset dataset = createSampleDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.VERTICAL, true, false, false);
        
        assertNotNull(chart);
        assertEquals("Title", chart.getTitle().getText());
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        assertFalse(((BarRenderer) plot.getRenderer()).getDefaultToolTipGenerator() instanceof StandardCategoryToolTipGenerator);
        assertFalse(((BarRenderer) plot.getRenderer()).getDefaultItemURLGenerator() instanceof StandardCategoryURLGenerator);
    }

    @Test
    void testCreateBarChartWithLegendFalse() {
        CategoryDataset dataset = createSampleDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.VERTICAL, false, true, true);
        
        assertNotNull(chart);
        assertFalse(chart.isLegendVisible());
    }

    private CategoryDataset createSampleDataset() {
        // Implement a method to create a sample dataset for testing
        return null; // Replace with actual dataset creation logic
    }
}