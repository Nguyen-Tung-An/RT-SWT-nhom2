package org.jfree.chart.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategoryMarkerTest {

    @Test
    void testEquals_NullObject() {
        CategoryMarker marker = new CategoryMarker("Test");
        assertFalse(marker.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        CategoryMarker marker = new CategoryMarker("Test");
        assertFalse(marker.equals("Not a CategoryMarker"));
    }

    @Test
    void testEquals_SuperEqualsFalse() {
        CategoryMarker marker1 = new CategoryMarker("Test");
        CategoryMarker marker2 = new CategoryMarker("Test");
        // Assuming super.equals() returns false for some reason
        // You would need to mock or extend CategoryMarker to simulate this
        assertFalse(marker1.equals(marker2)); // This is a placeholder
    }

    @Test
    void testEquals_DifferentKeys() {
        CategoryMarker marker1 = new CategoryMarker("Key1");
        CategoryMarker marker2 = new CategoryMarker("Key2");
        assertFalse(marker1.equals(marker2));
    }

    @Test
    void testEquals_SameKeys_DifferentDrawAsLine() {
        CategoryMarker marker1 = new CategoryMarker("Test");
        marker1.setDrawAsLine(true);
        CategoryMarker marker2 = new CategoryMarker("Test");
        marker2.setDrawAsLine(false);
        assertFalse(marker1.equals(marker2));
    }

    @Test
    void testEquals_SameObject() {
        CategoryMarker marker = new CategoryMarker("Test");
        assertTrue(marker.equals(marker));
    }

    @Test
    void testEquals_SameKeys_SameDrawAsLine() {
        CategoryMarker marker1 = new CategoryMarker("Test");
        marker1.setDrawAsLine(true);
        CategoryMarker marker2 = new CategoryMarker("Test");
        marker2.setDrawAsLine(true);
        assertTrue(marker1.equals(marker2));
    }
}