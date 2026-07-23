package com.google.gson.internal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedTreeMapNodeEqualsTest {

    @Test
    void testEqualsWithNullKeyAndValue() {
        LinkedTreeMap.Node<Object, Object> node1 = new LinkedTreeMap.Node<>(true);
        LinkedTreeMap.Node<Object, Object> node2 = new LinkedTreeMap.Node<>(true);
        assertTrue(node1.equals(node2));
    }

    @Test
    void testEqualsWithNullKeyAndNonNullValue() {
        LinkedTreeMap.Node<Object, String> node1 = new LinkedTreeMap.Node<>(true);
        node1.value = "value";
        LinkedTreeMap.Node<Object, String> node2 = new LinkedTreeMap.Node<>(true);
        node2.value = "value";
        assertFalse(node1.equals(node2));
    }

    @Test
    void testEqualsWithNonNullKeyAndNullValue() {
        LinkedTreeMap.Node<String, Object> node1 = new LinkedTreeMap.Node<>(true);
        node1.key = "key";
        LinkedTreeMap.Node<String, Object> node2 = new LinkedTreeMap.Node<>(true);
        node2.key = "key";
        assertFalse(node1.equals(node2));
    }

    @Test
    void testEqualsWithDifferentKeysAndValues() {
        LinkedTreeMap.Node<String, String> node1 = new LinkedTreeMap.Node<>(true);
        node1.key = "key1";
        node1.value = "value1";
        LinkedTreeMap.Node<String, String> node2 = new LinkedTreeMap.Node<>(true);
        node2.key = "key2";
        node2.value = "value2";
        assertFalse(node1.equals(node2));
    }

    @Test
    void testEqualsWithSameKeyAndValue() {
        LinkedTreeMap.Node<String, String> node1 = new LinkedTreeMap.Node<>(true);
        node1.key = "key";
        node1.value = "value";
        LinkedTreeMap.Node<String, String> node2 = new LinkedTreeMap.Node<>(true);
        node2.key = "key";
        node2.value = "value";
        assertTrue(node1.equals(node2));
    }

    @Test
    void testEqualsWithDifferentObjectType() {
        LinkedTreeMap.Node<String, String> node = new LinkedTreeMap.Node<>(true);
        assertFalse(node.equals("not a LinkedTreeMap.Node"));
    }

    @Test
    void testEqualsWithNullObject() {
        LinkedTreeMap.Node<String, String> node = new LinkedTreeMap.Node<>(true);
        assertFalse(node.equals(null));
    }
}