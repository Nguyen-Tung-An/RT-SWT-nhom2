package com.google.gson.internal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {

    private static class Entry<K, V> {
        private final K key;
        private final V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private static class Node<K, V> {
        private final K key;
        private final V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object o) {
            if (o instanceof Entry) {
                Entry<?, ?> other = (Entry<?, ?>) o;
                return (key == null ? other.getKey() == null : key.equals(other.getKey()))
                    && (value == null ? other.getValue() == null : value.equals(other.getValue()));
            }
            return false;
        }
    }

    @Test
    void testEquals_BothKeysAndValuesNull() {
        Node<String, String> node = new Node<>(null, null);
        Entry<String, String> entry = new Entry<>(null, null);
        assertTrue(node.equals(entry));
    }

    @Test
    void testEquals_KeyNull_ValueNotNull() {
        Node<String, String> node = new Node<>(null, "value");
        Entry<String, String> entry = new Entry<>(null, "value");
        assertTrue(node.equals(entry));
    }

    @Test
    void testEquals_KeyNotNull_ValueNull() {
        Node<String, String> node = new Node<>("key", null);
        Entry<String, String> entry = new Entry<>("key", null);
        assertTrue(node.equals(entry));
    }

    @Test
    void testEquals_BothKeysAndValuesEqual() {
        Node<String, String> node = new Node<>("key", "value");
        Entry<String, String> entry = new Entry<>("key", "value");
        assertTrue(node.equals(entry));
    }

    @Test
    void testEquals_KeysEqual_ValuesNotEqual() {
        Node<String, String> node = new Node<>("key", "value1");
        Entry<String, String> entry = new Entry<>("key", "value2");
        assertFalse(node.equals(entry));
    }

    @Test
    void testEquals_KeysNotEqual_ValuesEqual() {
        Node<String, String> node = new Node<>("key1", "value");
        Entry<String, String> entry = new Entry<>("key2", "value");
        assertFalse(node.equals(entry));
    }

    @Test
    void testEquals_NonEntryObject() {
        Node<String, String> node = new Node<>("key", "value");
        assertFalse(node.equals("not an entry"));
    }
}