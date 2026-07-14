package org.jfree.chart;

import org.junit.jupiter.api.Test;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.chart.JFreeChart;

import static org.junit.jupiter.api.Assertions.*;

public class ChartFactoryTest {

    @Test
    void testCreateBarChart_ValidInputs_Vertical() {
        CategoryDataset dataset = createMockDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.VERTICAL, true, true, true);
        assertNotNull(chart);
        assertEquals("Title", chart.getTitle().getText());
    }

    @Test
    void testCreateBarChart_ValidInputs_Horizontal() {
        CategoryDataset dataset = createMockDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.HORIZONTAL, true, true, true);
        assertNotNull(chart);
        assertEquals("Title", chart.getTitle().getText());
    }

    @Test
    void testCreateBarChart_NullOrientation() {
        CategoryDataset dataset = createMockDataset();
        assertThrows(IllegalArgumentException.class, () -> {
            ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, null, true, true, true);
        });
    }

    @Test
    void testCreateBarChart_WithoutTooltipsAndUrls() {
        CategoryDataset dataset = createMockDataset();
        JFreeChart chart = ChartFactory.createBarChart("Title", "Category Axis", "Value Axis", dataset, PlotOrientation.VERTICAL, false, false, false);
        assertNotNull(chart);
    }

    private CategoryDataset createMockDataset() {
        // Implement a mock dataset for testing
        return new MockCategoryDataset();
    }
}