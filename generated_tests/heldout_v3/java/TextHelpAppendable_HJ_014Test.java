import org.apache.commons.cli.help.TextHelpAppendable;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextHelpAppendableTest {

    @Test
    public void testAppendList_Ordered_NonEmpty() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Arrays.asList("Item 1", "Item 2", "Item 3");
        instance.appendList(true, list);
        // Assert on the observable state or return value
        assertTrue(instance.toString().contains(" 1. Item 1"));
        assertTrue(instance.toString().contains(" 2. Item 2"));
        assertTrue(instance.toString().contains(" 3. Item 3"));
    }

    @Test
    public void testAppendList_Unordered_NonEmpty() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Arrays.asList("Item A", "Item B");
        instance.appendList(false, list);
        // Assert on the observable state or return value
        assertTrue(instance.toString().contains(" * Item A"));
        assertTrue(instance.toString().contains(" * Item B"));
    }

    @Test
    public void testAppendList_Empty() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Arrays.asList();
        instance.appendList(true, list);
        // Assert that nothing was appended
        assertTrue(instance.toString().isEmpty());
    }

    @Test
    public void testAppendList_Null() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        instance.appendList(true, null);
        // Assert that nothing was appended
        assertTrue(instance.toString().isEmpty());
    }

    @Test
    public void testAppendList_Ordered_SingleItem() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Arrays.asList("Single Item");
        instance.appendList(true, list);
        // Assert on the observable state or return value
        assertTrue(instance.toString().contains(" 1. Single Item"));
    }

    @Test
    public void testAppendList_Unordered_SingleItem() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Arrays.asList("Single Item");
        instance.appendList(false, list);
        // Assert on the observable state or return value
        assertTrue(instance.toString().contains(" * Single Item"));
    }
}