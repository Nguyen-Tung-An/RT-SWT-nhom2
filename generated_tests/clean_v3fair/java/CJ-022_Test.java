package com.google.gson.internal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedTreeMapNodeTest {

    private static class EntryMock implements LinkedTreeMap.Entry<String, String> {
        private final String key;
        private final String value;

        EntryMock(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    @Test
    void testEquals_BothNullKeysAndValues() {
        LinkedTreeMap.Node node1 = new LinkedTreeMap.Node(null, null);
        LinkedTreeMap.Node node2 = new LinkedTreeMap.Node(null, null);
        assertTrue(node1.equals(node2));
    }

    @Test
    void testEquals_OneNullKeyAndValue() {
        LinkedTreeMap.Node node1 = new LinkedTreeMap.Node(null, "value");
        LinkedTreeMap.Node node2 = new LinkedTreeMap.Node("key", null);
        assertFalse(node1.equals(node2));
    }

    @Test
    void testEquals_SameKeyAndValue() {
        LinkedTreeMap.Node node1 = new LinkedTreeMap.Node("key", "value");
        LinkedTreeMap.Node node2 = new LinkedTreeMap.Node("key", "value");
        assertTrue(node1.equals(node2));
    }

    @Test
    void testEquals_DifferentKey() {
        LinkedTreeMap.Node node1 = new LinkedTreeMap.Node("key1", "value");
        LinkedTreeMap.Node node2 = new LinkedTreeMap.Node("key2", "value");
        assertFalse(node1.equals(node2));
    }

    @Test
    void testEquals_DifferentValue() {
        LinkedTreeMap.Node node1 = new LinkedTreeMap.Node("key", "value1");
        LinkedTreeMap.Node node2 = new LinkedTreeMap.Node("key", "value2");
        assertFalse(node1.equals(node2));
    }

    @Test
    void testEquals_NonEntryObject() {
        LinkedTreeMap.Node node = new LinkedTreeMap.Node("key", "value");
        assertFalse(node.equals(new Object()));
    }

    @Test
    void testEquals_EntryObjectWithSameKeyAndValue() {
        LinkedTreeMap.Node node = new LinkedTreeMap.Node("key", "value");
        EntryMock entryMock = new EntryMock("key", "value");
        assertTrue(node.equals(entryMock));
    }

    @Test
    void testEquals_EntryObjectWithDifferentKey() {
        LinkedTreeMap.Node node = new LinkedTreeMap.Node("key", "value");
        EntryMock entryMock = new EntryMock("differentKey", "value");
        assertFalse(node.equals(entryMock));
    }

    @Test
    void testEquals_EntryObjectWithDifferentValue() {
        LinkedTreeMap.Node node = new LinkedTreeMap.Node("key", "value");
        EntryMock entryMock = new EntryMock("key", "differentValue");
        assertFalse(node.equals(entryMock));
    }
}