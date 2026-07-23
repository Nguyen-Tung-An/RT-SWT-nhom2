package org.jfree.chart.title;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompositeTitleTest {

    @Test
    void testEquals_SameInstance() {
        CompositeTitle title = new CompositeTitle();
        assertTrue(title.equals(title));
    }

    @Test
    void testEquals_DifferentType() {
        CompositeTitle title = new CompositeTitle();
        String notCompositeTitle = "Not a CompositeTitle";
        assertFalse(title.equals(notCompositeTitle));
    }

    @Test
    void testEquals_DifferentContainers() {
        CompositeTitle title1 = new CompositeTitle();
        CompositeTitle title2 = new CompositeTitle();
        title1.setContainer(new Object()); // Assuming setContainer is a method to set the container
        title2.setContainer(new Object()); // Different container
        assertFalse(title1.equals(title2));
    }

    @Test
    void testEquals_SameContainers_DifferentBackgroundPaint() {
        CompositeTitle title1 = new CompositeTitle();
        CompositeTitle title2 = new CompositeTitle();
        title1.setContainer(new Object()); // Same container
        title2.setContainer(title1.getContainer());
        title1.setBackgroundPaint(new Paint()); // Assuming setBackgroundPaint is a method to set the background paint
        title2.setBackgroundPaint(new Paint()); // Different background paint
        assertFalse(title1.equals(title2));
    }

    @Test
    void testEquals_SameContainers_SameBackgroundPaint() {
        CompositeTitle title1 = new CompositeTitle();
        CompositeTitle title2 = new CompositeTitle();
        title1.setContainer(new Object()); // Same container
        title2.setContainer(title1.getContainer());
        title1.setBackgroundPaint(new Paint()); // Same background paint
        title2.setBackgroundPaint(title1.getBackgroundPaint());
        assertTrue(title1.equals(title2));
    }
}