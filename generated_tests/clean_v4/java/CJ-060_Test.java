package org.jfree.chart.plot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Paint;
import java.awt.Stroke;

class CategoryMarkerTest {

    @Test
    void testEqualsWithNull() {
        CategoryMarker marker = new CategoryMarker("Key1");
        assertFalse(marker.equals(null));
    }

    @Test
    void testEqualsWithDifferentType() {
        CategoryMarker marker = new CategoryMarker("Key1");
        assertFalse(marker.equals("Not a CategoryMarker"));
    }

    @Test
    void testEqualsWithDifferentKey() {
        CategoryMarker marker1 = new CategoryMarker("Key1");
        CategoryMarker marker2 = new CategoryMarker("Key2");
        assertFalse(marker1.equals(marker2));
    }

    @Test
    void testEqualsWithSameKeyDifferentDrawAsLine() {
        CategoryMarker marker1 = new CategoryMarker("Key1");
        marker1.setDrawAsLine(true);
        CategoryMarker marker2 = new CategoryMarker("Key1");
        marker2.setDrawAsLine(false);
        assertFalse(marker1.equals(marker2));
    }

    @Test
    void testEqualsWithSameKeySameDrawAsLine() {
        CategoryMarker marker1 = new CategoryMarker("Key1");
        marker1.setDrawAsLine(true);
        CategoryMarker marker2 = new CategoryMarker("Key1");
        marker2.setDrawAsLine(true);
        assertTrue(marker1.equals(marker2));
    }

    @Test
    void testEqualsWithDifferentDrawAsLine() {
        CategoryMarker marker1 = new CategoryMarker("Key1");
        marker1.setDrawAsLine(false);
        CategoryMarker marker2 = new CategoryMarker("Key1");
        marker2.setDrawAsLine(false);
        assertTrue(marker1.equals(marker2));
    }

    @Test
    void testEqualsWithSameObject() {
        CategoryMarker marker = new CategoryMarker("Key1");
        assertTrue(marker.equals(marker));
    }
}