package org.jfree.data.xy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class DefaultXYZDatasetTest {

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
        dataset1.seriesKeys = List.of("Series1");
        dataset2.seriesKeys = List.of("Series2");
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    void testEquals_DifferentSeriesListSize() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        dataset1.seriesList = Arrays.asList(new double[][][] {{{1.0}, {2.0}, {3.0}}});
        dataset2.seriesList = Arrays.asList(new double[][][] {{{1.0}, {2.0}, {3.0}}, {{4.0}, {5.0}, {6.0}}});
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    void testEquals_DifferentDataValues() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        dataset1.seriesList = Arrays.asList(new double[][][] {{{1.0}, {2.0}, {3.0}}});
        dataset2.seriesList = Arrays.asList(new double[][][] {{{1.0}, {2.0}, {4.0}}});
        assertFalse(dataset1.equals(dataset2));
    }

    @Test
    void testEquals_SameData() {
        DefaultXYZDataset dataset1 = new DefaultXYZDataset();
        DefaultXYZDataset dataset2 = new DefaultXYZDataset();
        dataset1.seriesKeys = List.of("Series1");
        dataset1.seriesList = Arrays.asList(new double[][][] {{{1.0}, {2.0}, {3.0}}});
        dataset2.seriesKeys = List.of("Series1");
        dataset2.seriesList = Arrays.asList(new double[][][] {{{1.0}, {2.0}, {3.0}}});
        assertTrue(dataset1.equals(dataset2));
    }
}