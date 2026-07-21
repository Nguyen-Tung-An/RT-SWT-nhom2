import org.jfree.chart.plot.FastScatterPlot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FastScatterPlotTest {

    @Test
    void testCalculateXDataRangeWithNegativeValue() {
        FastScatterPlot instance = new FastScatterPlot();
        float result = instance.calculateXDataRange(-1.0f);
        assertEquals(expectedValueForNegative, result);
    }

    @Test
    void testCalculateXDataRangeWithZero() {
        FastScatterPlot instance = new FastScatterPlot();
        float result = instance.calculateXDataRange(0.0f);
        assertEquals(expectedValueForZero, result);
    }

    @Test
    void testCalculateXDataRangeWithPositiveValue() {
        FastScatterPlot instance = new FastScatterPlot();
        float result = instance.calculateXDataRange(1.0f);
        assertEquals(expectedValueForPositive, result);
    }

    @Test
    void testCalculateXDataRangeWithLargeValue() {
        FastScatterPlot instance = new FastScatterPlot();
        float result = instance.calculateXDataRange(Float.MAX_VALUE);
        assertEquals(expectedValueForLarge, result);
    }

    @Test
    void testCalculateXDataRangeWithSmallValue() {
        FastScatterPlot instance = new FastScatterPlot();
        float result = instance.calculateXDataRange(Float.MIN_VALUE);
        assertEquals(expectedValueForSmall, result);
    }
}