package org.jfree.data.xy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WindDataItemTest {

    @Test
    void testEquals_SameInstance() {
        WindDataItem item = new WindDataItem(1.0, 2.0, 3.0);
        assertFalse(item.equals(item));
    }

    @Test
    void testEquals_NullObject() {
        WindDataItem item = new WindDataItem(1.0, 2.0, 3.0);
        assertFalse(item.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        WindDataItem item = new WindDataItem(1.0, 2.0, 3.0);
        assertFalse(item.equals("Not a WindDataItem"));
    }

    @Test
    void testEquals_DifferentX() {
        WindDataItem item1 = new WindDataItem(1.0, 2.0, 3.0);
        WindDataItem item2 = new WindDataItem(4.0, 2.0, 3.0);
        assertFalse(item1.equals(item2));
    }

    @Test
    void testEquals_DifferentWindDir() {
        WindDataItem item1 = new WindDataItem(1.0, 2.0, 3.0);
        WindDataItem item2 = new WindDataItem(1.0, 5.0, 3.0);
        assertFalse(item1.equals(item2));
    }

    @Test
    void testEquals_DifferentWindForce() {
        WindDataItem item1 = new WindDataItem(1.0, 2.0, 3.0);
        WindDataItem item2 = new WindDataItem(1.0, 2.0, 6.0);
        assertFalse(item1.equals(item2));
    }

    @Test
    void testEquals_SameValues() {
        WindDataItem item1 = new WindDataItem(1.0, 2.0, 3.0);
        WindDataItem item2 = new WindDataItem(1.0, 2.0, 3.0);
        assertTrue(item1.equals(item2));
    }
}