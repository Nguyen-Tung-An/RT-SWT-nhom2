import org.apache.commons.collections4.trie.AbstractPatriciaTrie;
import org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieEntry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrieEntryToStringTest {

    @Test
    public void testToString_EmptyEntry() {
        TrieEntry<String, String> entry = new AbstractPatriciaTrie.TrieEntry<>(null, null, null);
        assertEquals("null", entry.toString());
    }

    @Test
    public void testToString_EntryWithKeyAndValue() {
        TrieEntry<String, String> entry = new AbstractPatriciaTrie.TrieEntry<>("key", "value", null);
        assertEquals("key=value", entry.toString());
    }

    @Test
    public void testToString_EntryWithNullValue() {
        TrieEntry<String, String> entry = new AbstractPatriciaTrie.TrieEntry<>("key", null, null);
        assertEquals("key=null", entry.toString());
    }

    @Test
    public void testToString_EntryWithEmptyKey() {
        TrieEntry<String, String> entry = new AbstractPatriciaTrie.TrieEntry<>("", "value", null);
        assertEquals("=value", entry.toString());
    }

    @Test
    public void testToString_EntryWithEmptyKeyAndValue() {
        TrieEntry<String, String> entry = new AbstractPatriciaTrie.TrieEntry<>("", "", null);
        assertEquals("= ", entry.toString());
    }
}