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
        doNothing().when(textHelpAppendable).appendList(true, Arrays.asList("Item 1", "Item 2"));
        
        textHelpAppendable.appendList(true, Arrays.asList("Item 1", "Item 2"));
        
        verify(textHelpAppendable).appendList(true, Arrays.asList("Item 1", "Item 2"));
    }

    @Test
    void testAppendList_Unordered_NonEmpty() throws IOException {
        TextHelpAppendable textHelpAppendable = mock(TextHelpAppendable.class);
        doNothing().when(textHelpAppendable).appendList(false, Arrays.asList("Item A", "Item B"));
        
        textHelpAppendable.appendList(false, Arrays.asList("Item A", "Item B"));
        
        verify(textHelpAppendable).appendList(false, Arrays.asList("Item A", "Item B"));
    }

    @Test
    void testAppendList_Empty() throws IOException {
        TextHelpAppendable textHelpAppendable = mock(TextHelpAppendable.class);
        doNothing().when(textHelpAppendable).appendList(true, Collections.emptyList());
        
        textHelpAppendable.appendList(true, Collections.emptyList());
        
        verify(textHelpAppendable).appendList(true, Collections.emptyList());
    }

    @Test
    void testAppendList_Null() throws IOException {
        TextHelpAppendable textHelpAppendable = mock(TextHelpAppendable.class);
        doNothing().when(textHelpAppendable).appendList(true, null);
        
        textHelpAppendable.appendList(true, null);
        
        verify(textHelpAppendable).appendList(true, null);
    }
}