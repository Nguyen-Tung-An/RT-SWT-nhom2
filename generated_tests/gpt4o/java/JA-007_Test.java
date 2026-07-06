package org.jfree.chart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.JFreeChart;

public class ChartFactoryTest {

    @Test
    void testCreateBarChart_HorizontalWithTooltipsAndUrls() {
        CategoryDataset dataset = createMockDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category", "Value", dataset, PlotOrientation.HORIZONTAL, true, true, true);
        assertNotNull(chart);
    }

    @Test
    void testCreateBarChart_HorizontalWithoutTooltipsAndUrls() {
        CategoryDataset dataset = createMockDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category", "Value", dataset, PlotOrientation.HORIZONTAL, false, false, false);
        assertNotNull(chart);
    }

    @Test
    void testCreateBarChart_VerticalWithTooltipsAndUrls() {
        CategoryDataset dataset = createMockDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category", "Value", dataset, PlotOrientation.VERTICAL, true, true, true);
        assertNotNull(chart);
    }

    @Test
    void testCreateBarChart_VerticalWithoutTooltipsAndUrls() {
        CategoryDataset dataset = createMockDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category", "Value", dataset, PlotOrientation.VERTICAL, false, false, false);
        assertNotNull(chart);
    }

    @Test
    void testCreateBarChart_NullOrientation() {
        CategoryDataset dataset = createMockDataset();
        assertThrows(IllegalArgumentException.class, () -> {
            ChartFactory.createBarChart("Title", "Category", "Value", dataset, null, true, true, true);
        });
    }

    private CategoryDataset createMockDataset() {
        // Implement a mock dataset for testing purposes
        return null; // Replace with actual dataset creation logic
    }
}