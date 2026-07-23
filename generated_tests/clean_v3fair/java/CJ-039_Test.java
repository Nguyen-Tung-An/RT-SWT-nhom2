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
                private final Shape[] shapes = {new Rectangle(1, 1), new Rectangle(2, 2)};

                @Override
                public Shape getNextShape() {
                    return shapes[count++ % shapes.length];
                }
            };
        }

        @Override
        protected void setSeriesShape(int series, Shape shape, boolean notify) {
            // Simulate setting the shape
        }
    }

    @Test
    void testLookupSeriesShape_NullShapeAndAutoPopulate() {
        TestRenderer renderer = new TestRenderer();
        renderer.autoPopulateSeriesShape = true;
        Shape shape = renderer.lookupSeriesShape(0);
        assertNotNull(shape);
    }

    @Test
    void testLookupSeriesShape_NullShapeAndNoAutoPopulate() {
        TestRenderer renderer = new TestRenderer();
        renderer.autoPopulateSeriesShape = false;
        Shape shape = renderer.lookupSeriesShape(0);
        assertNull(shape);
    }

    @Test
    void testLookupSeriesShape_DefaultShape() {
        TestRenderer renderer = new TestRenderer();
        renderer.defaultShape = new Rectangle(3, 3);
        Shape shape = renderer.lookupSeriesShape(0);
        assertEquals(renderer.defaultShape, shape);
    }

    @Test
    void testLookupSeriesShape_WithExistingShape() {
        TestRenderer renderer = new TestRenderer() {
            @Override
            protected Shape getSeriesShape(int series) {
                return new Rectangle(4, 4); // Simulate existing shape
            }
        };
        Shape shape = renderer.lookupSeriesShape(0);
        assertEquals(new Rectangle(4, 4), shape);
    }
}