package org.apache.commons.cli.help;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class TextHelpAppendableTest {

    @Test
    void testAppendList_Ordered_NonEmpty() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Arrays.asList("Item 1", "Item 2");
        instance.appendList(true, list);
        // Verify output or behavior as needed
    }

    @Test
    void testAppendList_Unordered_NonEmpty() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Arrays.asList("Item A", "Item B");
        instance.appendList(false, list);
        // Verify output or behavior as needed
    }

    @Test
    void testAppendList_Empty() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<CharSequence> list = Collections.emptyList();
        instance.appendList(true, list);
        // Verify output or behavior as needed
    }

    @Test
    void testAppendList_Null() throws IOException {
        TextHelpAppendable instance = new TextHelpAppendable();
        instance.appendList(true, null);
        // Verify output or behavior as needed
    }
}