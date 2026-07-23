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
    void testEquals_NotCategoryMarker() {
        CategoryMarker marker = new CategoryMarker("Test");
        assertFalse(marker.equals(new Object()));
    }

    @Test
    void testEquals_SuperEqualsFalse() {
        CategoryMarker marker1 = new CategoryMarker("Test") {
            @Override
            public boolean equals(Object obj) {
                return false; // Simulate super.equals() returning false
            }
        };
        CategoryMarker marker2 = new CategoryMarker("Test");
        assertFalse(marker1.equals(marker2));
    }

    @Test
    void testEquals_KeyNotEqual() {
        CategoryMarker marker1 = new CategoryMarker("Test1");
        CategoryMarker marker2 = new CategoryMarker("Test2");
        assertFalse(marker1.equals(marker2));
    }

    @Test
    void testEquals_DrawAsLineNotEqual() {
        CategoryMarker marker1 = new CategoryMarker("Test");
        marker1.setDrawAsLine(true);
        CategoryMarker marker2 = new CategoryMarker("Test");
        marker2.setDrawAsLine(false);
        assertFalse(marker1.equals(marker2));
    }

    @Test
    void testEquals_EqualMarkers() {
        CategoryMarker marker1 = new CategoryMarker("Test");
        marker1.setDrawAsLine(true);
        CategoryMarker marker2 = new CategoryMarker("Test");
        marker2.setDrawAsLine(true);
        assertTrue(marker1.equals(marker2));
    }
}