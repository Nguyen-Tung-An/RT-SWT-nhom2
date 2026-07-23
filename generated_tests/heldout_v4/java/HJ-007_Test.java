package org.apache.commons.collections4.trie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractPatriciaTrieTest {

    private static class TestTrieEntry<K, V> extends AbstractPatriciaTrie.TrieEntry<K, V> {
        public TestTrieEntry(K key, V value, int bitIndex) {
            super(key, value, bitIndex);
        }
    }

    @Test
    void testToStringRootEntry() {
        TestTrieEntry<String, String> entry = new TestTrieEntry<>("rootKey", "rootValue", -1);
        String result = entry.toString();
        assertEquals("RootEntry(key=rootKey [0], value=rootValue, parent=null, left=null, right=null, )", result);
    }

    @Test
    void testToStringNormalEntry() {
        TestTrieEntry<String, String> parentEntry = new TestTrieEntry<>("parentKey", "parentValue", 0);
        TestTrieEntry<String, String> entry = new TestTrieEntry<>("childKey", "childValue", 1);
        entry.parent = parentEntry; // Set parent
        String result = entry.toString();
        assertEquals("Entry(key=childKey [1], value=childValue, parent=parentKey [0], left=null, right=null, )", result);
    }

    @Test
    void testToStringWithLeftChild() {
        TestTrieEntry<String, String> leftEntry = new TestTrieEntry<>("leftKey", "leftValue", 2);
        TestTrieEntry<String, String> entry = new TestTrieEntry<>("parentKey", "parentValue", 0);
        entry.left = leftEntry; // Set left child
        String result = entry.toString();
        assertEquals("Entry(key=parentKey [0], value=parentValue, parent=null, left=leftKey [2], right=null, )", result);
    }

    @Test
    void testToStringWithRightChild() {
        TestTrieEntry<String, String> rightEntry = new TestTrieEntry<>("rightKey", "rightValue", 3);
        TestTrieEntry<String, String> entry = new TestTrieEntry<>("parentKey", "parentValue", 0);
        entry.right = rightEntry; // Set right child
        String result = entry.toString();
        assertEquals("Entry(key=parentKey [0], value=parentValue, parent=null, left=null, right=rightKey [3], )", result);
    }

    @Test
    void testToStringWithPredecessor() {
        TestTrieEntry<String, String> predecessorEntry = new TestTrieEntry<>("predecessorKey", "predecessorValue", 4);
        TestTrieEntry<String, String> entry = new TestTrieEntry<>("parentKey", "parentValue", 0);
        entry.predecessor = predecessorEntry; // Set predecessor
        String result = entry.toString();
        assertEquals("Entry(key=parentKey [0], value=parentValue, parent=null, left=null, right=null, predecessor=predecessorKey [4])", result);
    }

    @Test
    void testToStringWithAllFields() {
        TestTrieEntry<String, String> leftEntry = new TestTrieEntry<>("leftKey", "leftValue", 2);
        TestTrieEntry<String, String> rightEntry = new TestTrieEntry<>("rightKey", "rightValue", 3);
        TestTrieEntry<String, String> parentEntry = new TestTrieEntry<>("parentKey", "parentValue", 0);
        parentEntry.left = leftEntry; // Set left child
        parentEntry.right = rightEntry; // Set right child
        String result = parentEntry.toString();
        assertEquals("Entry(key=parentKey [0], value=parentValue, parent=null, left=leftKey [2], right=rightKey [3], )", result);
    }
}