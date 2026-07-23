package org.jfree.chart.renderer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Shape;

class AbstractRendererTest {

    @Test
    void testLookupSeriesShapeWithExistingShape() {
        AbstractRenderer renderer = new AbstractRenderer();
        Shape expectedShape = new java.awt.Rectangle(10, 10);
        renderer.setSeriesShape(0, expectedShape, true);
        
        Shape result = renderer.lookupSeriesShape(0);
        
        assertSame(expectedShape, result);
    }

    @Test
    void testLookupSeriesShapeWithAutoPopulateEnabled() {
        AbstractRenderer renderer = new AbstractRenderer();
        renderer.setAutoPopulateSeriesShape(true);
        Shape expectedShape = new java.awt.Circle(5);
        DrawingSupplier supplier = new DrawingSupplier() {
            @Override
            public Shape getNextShape() {
                return expectedShape;
            }
        };
        renderer.setDrawingSupplier(supplier);
        
        Shape result = renderer.lookupSeriesShape(1);
        
        assertSame(expectedShape, result);
    }

    @Test
    void testLookupSeriesShapeWithNullShapeAndAutoPopulateDisabled() {
        AbstractRenderer renderer = new AbstractRenderer();
        renderer.setAutoPopulateSeriesShape(false);
        
        Shape result = renderer.lookupSeriesShape(2);
        
        assertSame(renderer.getDefaultShape(), result);
    }

    @Test
    void testLookupSeriesShapeWithNullShapeAndAutoPopulateEnabled() {
        AbstractRenderer renderer = new AbstractRenderer();
        renderer.setAutoPopulateSeriesShape(true);
        renderer.setDrawingSupplier(null);
        
        Shape result = renderer.lookupSeriesShape(3);
        
        assertSame(renderer.getDefaultShape(), result);
    }

    @Test
    void testLookupSeriesShapeWithNegativeIndex() {
        AbstractRenderer renderer = new AbstractRenderer();
        Shape result = renderer.lookupSeriesShape(-1);
        
        assertSame(renderer.getDefaultShape(), result);
    }
}