import org.jfree.data.xy.DefaultXYZDataset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultXYZDatasetTest {

    @Test
    void testEquals_SameObject() {
        DefaultXYZDataset dataset = new DefaultXYZDataset();
        assertTrue(dataset.equals(dataset));
    }

    @Test
    void testEquals_NullObject() {
        DefaultXYZDataset dataset = new DefaultXYZDataset();
        assertFalse(dataset.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        DefaultXYZDataset dataset = new DefaultXYZDataset();
        String notADataset = "Not a dataset";
        assertFalse(dataset.equals(notADataset));
    }

    @Test
    void testEquals_DifferentSeriesKeys() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        dataset1.addSeries("Series1", new double[][]{{1.0}, {2.0}, {3.0}});
        dataset2.addSeries("Series2", new double[][]{{1.0}, {2.0}, {3.0}});
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    void testEquals_DifferentData() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        dataset1.addSeries("Series1", new double[][]{{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}});
        dataset2.addSeries("Series1", new double[][]{{1.0, 2.0}, {3.0, 4.0}, {5.0, 7.0}});
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    void testEquals_SameData() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        dataset1.addSeries("Series1", new double[][]{{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}});
        dataset2.addSeries("Series1", new double[][]{{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}});
        assertTrue(dataset1.equals(dataset2));
    }

    @Test
    void testEquals_DifferentNumberOfSeries() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        dataset1.addSeries("Series1", new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        dataset2.addSeries("Series1", new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        dataset2.addSeries("Series2", new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        assertFalse(dataset1.equals(dataset2));
    }
}