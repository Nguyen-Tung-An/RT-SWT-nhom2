import org.apache.commons.collections4.trie.AbstractPatriciaTrie;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractPatriciaTrieEntryTest {

    @Test
    void testToStringRootEntry() {
        AbstractPatriciaTrie.TrieEntry entry = new AbstractPatriciaTrie.TrieEntry(null, null, -1);
        String result = entry.toString();
        assertEquals("RootEntry(key=null [0], value=null, parent=null, left=null, right=null, )", result);
    }

    @Test
    void testToStringEntryWithKeyValue() {
        AbstractPatriciaTrie.TrieEntry parentEntry = new AbstractPatriciaTrie.TrieEntry(null, "parentValue", 0);
        AbstractPatriciaTrie.TrieEntry entry = new AbstractPatriciaTrie.TrieEntry(parentEntry, "keyValue", 1);
        String result = entry.toString();
        assertEquals("Entry(key=keyValue [1], value=parentValue, parent=parentValue [0], left=null, right=null, )", result);
    }

    @Test
    void testToStringWithLeftChild() {
        AbstractPatriciaTrie.TrieEntry leftEntry = new AbstractPatriciaTrie.TrieEntry(null, "leftValue", 2);
        AbstractPatriciaTrie.TrieEntry entry = new AbstractPatriciaTrie.TrieEntry(null, "keyValue", 1);
        entry.left = leftEntry;
        String result = entry.toString();
        assertEquals("Entry(key=keyValue [1], value=null, parent=null, left=leftValue [2], right=null, )", result);
    }

    @Test
    void testToStringWithRightChild() {
        AbstractPatriciaTrie.TrieEntry rightEntry = new AbstractPatriciaTrie.TrieEntry(null, "rightValue", 3);
        AbstractPatriciaTrie.TrieEntry entry = new AbstractPatriciaTrie.TrieEntry(null, "keyValue", 1);
        entry.right = rightEntry;
        String result = entry.toString();
        assertEquals("Entry(key=keyValue [1], value=null, parent=null, left=null, right=rightValue [3], )", result);
    }

    @Test
    void testToStringWithPredecessor() {
        AbstractPatriciaTrie.TrieEntry predecessorEntry = new AbstractPatriciaTrie.TrieEntry(null, "predecessorValue", 4);
        AbstractPatriciaTrie.TrieEntry entry = new AbstractPatriciaTrie.TrieEntry(null, "keyValue", 1);
        entry.predecessor = predecessorEntry;
        String result = entry.toString();
        assertEquals("Entry(key=keyValue [1], value=null, parent=null, left=null, right=null, predecessor=predecessorValue [4])", result);
    }

    @Test
    void testToStringWithAllFields() {
        AbstractPatriciaTrie.TrieEntry parentEntry = new AbstractPatriciaTrie.TrieEntry(null, "parentValue", 0);
        AbstractPatriciaTrie.TrieEntry leftEntry = new AbstractPatriciaTrie.TrieEntry(null, "leftValue", 2);
        AbstractPatriciaTrie.TrieEntry rightEntry = new AbstractPatriciaTrie.TrieEntry(null, "rightValue", 3);
        AbstractPatriciaTrie.TrieEntry predecessorEntry = new AbstractPatriciaTrie.TrieEntry(null, "predecessorValue", 4);
        
        AbstractPatriciaTrie.TrieEntry entry = new AbstractPatriciaTrie.TrieEntry(parentEntry, "keyValue", 1);
        entry.left = leftEntry;
        entry.right = rightEntry;
        entry.predecessor = predecessorEntry;

        String result = entry.toString();
        assertEquals("Entry(key=keyValue [1], value=parentValue, parent=parentValue [0], left=leftValue [2], right=rightValue [3], predecessor=predecessorValue [4])", result);
    }
}