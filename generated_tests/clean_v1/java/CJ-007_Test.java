package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AttributeTest {

    @Test
    void testEquals_SameInstance() {
        Attribute attribute = new Attribute("key", "value");
        assertTrue(attribute.equals(attribute));
    }

    @Test
    void testEquals_NullObject() {
        Attribute attribute = new Attribute("key", "value");
        assertFalse(attribute.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        Attribute attribute = new Attribute("key", "value");
        String differentClassObject = "Not an Attribute";
        assertFalse(attribute.equals(differentClassObject));
    }

    @Test
    void testEquals_EqualAttributes() {
        Attribute attribute1 = new Attribute("key", "value");
        Attribute attribute2 = new Attribute("key", "value");
        assertTrue(attribute1.equals(attribute2));
    }

    @Test
    void testEquals_DifferentKeys() {
        Attribute attribute1 = new Attribute("key1", "value");
        Attribute attribute2 = new Attribute("key2", "value");
        assertFalse(attribute1.equals(attribute2));
    }

    @Test
    void testEquals_DifferentValues() {
        Attribute attribute1 = new Attribute("key", "value1");
        Attribute attribute2 = new Attribute("key", "value2");
        assertFalse(attribute1.equals(attribute2));
    }

    @Test
    void testEquals_DifferentKeyAndValue() {
        Attribute attribute1 = new Attribute("key1", "value1");
        Attribute attribute2 = new Attribute("key2", "value2");
        assertFalse(attribute1.equals(attribute2));
    }
}