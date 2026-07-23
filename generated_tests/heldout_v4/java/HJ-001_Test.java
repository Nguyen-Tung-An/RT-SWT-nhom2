import org.jfree.chart.plot.FastScatterPlot;
import org.jfree.data.Range;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FastScatterPlotTest {

    @Test
    public void testCalculateXDataRange_NullData() throws Exception {
        FastScatterPlot instance = new FastScatterPlot();
        Method m = FastScatterPlot.class.getDeclaredMethod("calculateXDataRange", float[][].class);
        m.setAccessible(true);
        
        Object result = m.invoke(instance, (Object) null);
        assertNull(result);
    }

    @Test
    public void testCalculateXDataRange_EmptyData() throws Exception {
        FastScatterPlot instance = new FastScatterPlot();
        Method m = FastScatterPlot.class.getDeclaredMethod("calculateXDataRange", float[][].class);
        m.setAccessible(true);
        
        float[][] data = new float[1][0];
        Object result = m.invoke(instance, (Object) data);
        assertNull(result);
    }

    @Test
    public void testCalculateXDataRange_SingleValue() throws Exception {
        FastScatterPlot instance = new FastScatterPlot();
        Method m = FastScatterPlot.class.getDeclaredMethod("calculateXDataRange", float[][].class);
        m.setAccessible(true);
        
        float[][] data = {{5.0f}};
        Object result = m.invoke(instance, (Object) data);
        Range expected = new Range(5.0, 5.0);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateXDataRange_MultipleValues() throws Exception {
        FastScatterPlot instance = new FastScatterPlot();
        Method m = FastScatterPlot.class.getDeclaredMethod("calculateXDataRange", float[][].class);
        m.setAccessible(true);
        
        float[][] data = {{1.0f, 3.0f, 2.0f}};
        Object result = m.invoke(instance, (Object) data);
        Range expected = new Range(1.0, 3.0);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateXDataRange_NegativeValues() throws Exception {
        FastScatterPlot instance = new FastScatterPlot();
        Method m = FastScatterPlot.class.getDeclaredMethod("calculateXDataRange", float[][].class);
        m.setAccessible(true);
        
        float[][] data = {{-1.0f, -3.0f, -2.0f}};
        Object result = m.invoke(instance, (Object) data);
        Range expected = new Range(-3.0, -1.0);
        assertEquals(expected, result);
    }

    @Test
    public void testCalculateXDataRange_MixedValues() throws Exception {
        FastScatterPlot instance = new FastScatterPlot();
        Method m = FastScatterPlot.class.getDeclaredMethod("calculateXDataRange", float[][].class);
        m.setAccessible(true);
        
        float[][] data = {{-1.0f, 0.0f, 1.0f}};
        Object result = m.invoke(instance, (Object) data);
        Range expected = new Range(-1.0, 1.0);
        assertEquals(expected, result);
    }
}