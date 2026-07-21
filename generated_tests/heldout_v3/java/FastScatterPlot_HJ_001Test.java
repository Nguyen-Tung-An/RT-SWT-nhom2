import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.data.Range;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FastScatterPlotTest {

    @Test
    void testCalculateXDataRangeWithNullData() {
        FastScatterPlot instance = new FastScatterPlot();
        Range result = instance.calculateXDataRange(null);
        assertNull(result);
    }

    @Test
    void testCalculateXDataRangeWithSingleValue() {
        FastScatterPlot instance = new FastScatterPlot();
        float[][] data = {{5.0f}};
        Range result = instance.calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(5.0f, result.getLowerBound());
        assertEquals(5.0f, result.getUpperBound());
    }

    @Test
    void testCalculateXDataRangeWithMultipleValues() {
        FastScatterPlot instance = new FastScatterPlot();
        float[][] data = {{1.0f, 3.0f, 2.0f}};
        Range result = instance.calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(1.0f, result.getLowerBound());
        assertEquals(3.0f, result.getUpperBound());
    }

    @Test
    void testCalculateXDataRangeWithIdenticalValues() {
        FastScatterPlot instance = new FastScatterPlot();
        float[][] data = {{4.0f, 4.0f, 4.0f}};
        Range result = instance.calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(4.0f, result.getLowerBound());
        assertEquals(4.0f, result.getUpperBound());
    }

    @Test
    void testCalculateXDataRangeWithNegativeValues() {
        FastScatterPlot instance = new FastScatterPlot();
        float[][] data = {{-3.0f, -1.0f, -2.0f}};
        Range result = instance.calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(-3.0f, result.getLowerBound());
        assertEquals(-1.0f, result.getUpperBound());
    }

    @Test
    void testCalculateXDataRangeWithMixedValues() {
        FastScatterPlot instance = new FastScatterPlot();
        float[][] data = {{-1.0f, 0.0f, 1.0f}};
        Range result = instance.calculateXDataRange(data);
        assertNotNull(result);
        assertEquals(-1.0f, result.getLowerBound());
        assertEquals(1.0f, result.getUpperBound());
    }
}