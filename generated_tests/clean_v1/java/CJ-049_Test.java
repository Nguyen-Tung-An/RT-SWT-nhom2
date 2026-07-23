package org.apache.commons.cli.help;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class TextHelpAppendableTest {

    @Test
    void testAppendList_Ordered_NonEmpty() throws IOException {
        TextHelpAppendable textHelpAppendable = mock(TextHelpAppendable.class);
        Collection<CharSequence> list = Arrays.asList("Item 1", "Item 2");
        textHelpAppendable.appendList(true, list);
        verify(textHelpAppendable, times(1)).appendList(true, list);
    }

    @Test
    void testAppendList_Unordered_NonEmpty() throws IOException {
        TextHelpAppendable textHelpAppendable = mock(TextHelpAppendable.class);
        Collection<CharSequence> list = Arrays.asList("Item A", "Item B");
        textHelpAppendable.appendList(false, list);
        verify(textHelpAppendable, times(1)).appendList(false, list);
    }

    @Test
    void testAppendList_Empty() throws IOException {
        TextHelpAppendable textHelpAppendable = mock(TextHelpAppendable.class);
        Collection<CharSequence> list = Collections.emptyList();
        textHelpAppendable.appendList(true, list);
        verify(textHelpAppendable, times(1)).appendList(true, list);
    }

    @Test
    void testAppendList_Null() throws IOException {
        TextHelpAppendable textHelpAppendable = mock(TextHelpAppendable.class);
        textHelpAppendable.appendList(true, null);
        verify(textHelpAppendable, times(1)).appendList(true, null);
    }
}