package org.jfree.chart.renderer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Shape;

public class AbstractRendererTest {

    private class TestRenderer extends AbstractRenderer {
        @Override
        protected Shape getSeriesShape(int series) {
            return null; // Simulate no shape for the series
        }

        @Override
        protected DrawingSupplier getDrawingSupplier() {
            return new DrawingSupplier() {
                private int count = 0;
                @Override
                public Shape getNextShape() {
                    return new Shape() {}; // Return a dummy shape
                }
            };
        }

        @Override
        protected void setSeriesShape(int series, Shape shape, boolean notify) {
            // Simulate setting the series shape
        }
    }

    @Test
    void testLookupSeriesShape_AutoPopulate() {
        TestRenderer renderer = new TestRenderer();
        renderer.autoPopulateSeriesShape = true;
        Shape shape = renderer.lookupSeriesShape(0);
        assertNotNull(shape, "Shape should not be null when auto-populating");
    }

    @Test
    void testLookupSeriesShape_NoAutoPopulate() {
        TestRenderer renderer = new TestRenderer();
        renderer.autoPopulateSeriesShape = false;
        Shape shape = renderer.lookupSeriesShape(0);
        assertNull(shape, "Shape should be null when not auto-populating and no series shape is defined");
    }

    @Test
    void testLookupSeriesShape_DefaultShape() {
        TestRenderer renderer = new TestRenderer();
        renderer.autoPopulateSeriesShape = false;
        renderer.defaultShape = new Shape() {}; // Set a default shape
        Shape shape = renderer.lookupSeriesShape(0);
        assertNotNull(shape, "Shape should not be null when default shape is set");
    }
}