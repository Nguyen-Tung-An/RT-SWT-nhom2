package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AttributesTest {

    @Test
    void testEquals_SameInstance() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.equals(attributes));
    }

    @Test
    void testEquals_NullObject() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        Attributes attributes = new Attributes();
        Object otherObject = new Object();
        assertFalse(attributes.equals(otherObject));
    }

    @Test
    void testEquals_DifferentSize() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.put("key1", "value1");
        attributes2.put("key2", "value2");
        assertFalse(attributes1.equals(attributes2));
    }

    @Test
    void testEquals_SameSize_DifferentValues() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        attributes1.put("key2", "value2");
        Attributes attributes2 = new Attributes();
        attributes2.put("key1", "value1");
        attributes2.put("key2", "value3");
        assertFalse(attributes1.equals(attributes2));
    }

    @Test
    void testEquals_SameSize_SameValues() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        attributes1.put("key2", "value2");
        Attributes attributes2 = new Attributes();
        attributes2.put("key1", "value1");
        attributes2.put("key2", "value2");
        assertTrue(attributes1.equals(attributes2));
    }

    @Test
    void testEquals_SameSize_SameKeys_DifferentOrder() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key1", "value1");
        attributes1.put("key2", "value2");
        Attributes attributes2 = new Attributes();
        attributes2.put("key2", "value2");
        attributes2.put("key1", "value1");
        assertTrue(attributes1.equals(attributes2));
    }
}