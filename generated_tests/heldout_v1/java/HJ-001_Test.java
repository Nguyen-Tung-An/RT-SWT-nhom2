package org.jfree.chart.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FastScatterPlotTest {

    @Test
    void testCalculateXDataRange_NullData() {
        assertNull(new FastScatterPlot().calculateXDataRange(null));
    }

    @Test
    void testCalculateXDataRange_EmptyData() {
        float[][] data = {{}};
        assertNull(new FastScatterPlot().calculateXDataRange(data));
    }

    @Test
    void testCalculateXDataRange_SingleValue() {
        float[][] data = {{5.0f}};
        Range result = new FastScatterPlot().calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(5.0f, result.getLowerBound());
        assertEquals(5.0f, result.getUpperBound());
    }

    @Test
    void testCalculateXDataRange_MultipleValues() {
        float[][] data = {{1.0f, 2.0f, 3.0f}};
        Range result = new FastScatterPlot().calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(1.0f, result.getLowerBound());
        assertEquals(3.0f, result.getUpperBound());
    }

    @Test
    void testCalculateXDataRange_NegativeValues() {
        float[][] data = {{-3.0f, -1.0f, -2.0f}};
        Range result = new FastScatterPlot().calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(-3.0f, result.getLowerBound());
        assertEquals(-1.0f, result.getUpperBound());
    }

    @Test
    void testCalculateXDataRange_MixedValues() {
        float[][] data = {{-1.0f, 0.0f, 1.0f}};
        Range result = new FastScatterPlot().calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(-1.0f, result.getLowerBound());
        assertEquals(1.0f, result.getUpperBound());
    }
}