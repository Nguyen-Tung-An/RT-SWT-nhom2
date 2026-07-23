package org.jfree.chart.title;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompositeTitleTest {

    @Test
    void testEquals_SameInstance() {
        CompositeTitle title = new CompositeTitle();
        assertTrue(title.equals(title));
    }

    @Test
    void testEquals_NullObject() {
        CompositeTitle title = new CompositeTitle();
        assertFalse(title.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        CompositeTitle title = new CompositeTitle();
        String otherObject = "Not a CompositeTitle";
        assertFalse(title.equals(otherObject));
    }

    @Test
    void testEquals_DifferentCompositeTitle_DifferentContainer() {
        BlockContainer container1 = new BlockContainer();
        BlockContainer container2 = new BlockContainer();
        CompositeTitle title1 = new CompositeTitle(container1);
        CompositeTitle title2 = new CompositeTitle(container2);
        assertFalse(title1.equals(title2));
    }

    @Test
    void testEquals_SameContainer_DifferentBackgroundPaint() {
        BlockContainer container = new BlockContainer();
        CompositeTitle title1 = new CompositeTitle(container);
        CompositeTitle title2 = new CompositeTitle(container);
        title1.setBackgroundPaint(java.awt.Color.RED);
        title2.setBackgroundPaint(java.awt.Color.BLUE);
        assertFalse(title1.equals(title2));
    }

    @Test
    void testEquals_SameCompositeTitle() {
        BlockContainer container = new BlockContainer();
        CompositeTitle title1 = new CompositeTitle(container);
        CompositeTitle title2 = new CompositeTitle(container);
        title1.setBackgroundPaint(java.awt.Color.GREEN);
        title2.setBackgroundPaint(java.awt.Color.GREEN);
        assertTrue(title1.equals(title2));
    }

    @Test
    void testEquals_SuperEquals() {
        BlockContainer container = new BlockContainer();
        CompositeTitle title1 = new CompositeTitle(container);
        CompositeTitle title2 = new CompositeTitle(container);
        title1.setBackgroundPaint(java.awt.Color.BLACK);
        title2.setBackgroundPaint(java.awt.Color.BLACK);
        assertTrue(title1.equals(title2));
        assertTrue(title2.equals(title1));
    }
}