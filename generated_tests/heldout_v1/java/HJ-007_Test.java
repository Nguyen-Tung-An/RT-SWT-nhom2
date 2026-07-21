package org.apache.commons.collections4.trie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrieEntryTest {

    @Test
    void testToString_RootEntry() {
        TrieEntry<String, String> rootEntry = new TrieEntry<>(null, null, -1);
        assertEquals("RootEntry(key=null [0], value=null, parent=null, left=null, right=null, predecessor=null)", rootEntry.toString());
    }

    @Test
    void testToString_EntryWithParent() {
        TrieEntry<String, String> parentEntry = new TrieEntry<>(null, null, 0);
        TrieEntry<String, String> childEntry = new TrieEntry<>(parentEntry, "childKey", 1);
        assertEquals("Entry(key=childKey [1], value=null, parent=ROOT, left=null, right=null, predecessor=null)", childEntry.toString());
    }

    @Test
    void testToString_EntryWithLeftAndRight() {
        TrieEntry<String, String> leftEntry = new TrieEntry<>(null, "leftKey", 0);
        TrieEntry<String, String> rightEntry = new TrieEntry<>(null, "rightKey", 1);
        TrieEntry<String, String> parentEntry = new TrieEntry<>(null, "parentKey", 2);
        parentEntry.left = leftEntry;
        parentEntry.right = rightEntry;
        assertEquals("Entry(key=parentKey [2], value=null, parent=null, left=leftKey [0], right=rightKey [1], predecessor=null)", parentEntry.toString());
    }

    @Test
    void testToString_EntryWithPredecessor() {
        TrieEntry<String, String> predecessorEntry = new TrieEntry<>(null, "predecessorKey", 0);
        TrieEntry<String, String> entry = new TrieEntry<>(null, "currentKey", 1);
        entry.predecessor = predecessorEntry;
        assertEquals("Entry(key=currentKey [1], value=null, parent=null, left=null, right=null, predecessor=predecessorKey [0])", entry.toString());
    }

    @Test
    void testToString_EntryWithNulls() {
        TrieEntry<String, String> entry = new TrieEntry<>(null, "key", 1);
        assertEquals("Entry(key=key [1], value=null, parent=null, left=null, right=null, predecessor=null)", entry.toString());
    }
}