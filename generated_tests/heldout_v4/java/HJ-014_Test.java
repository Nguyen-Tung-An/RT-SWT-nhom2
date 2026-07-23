import org.apache.commons.cli.help.TextHelpAppendable;
import org.junit.jupiter.api.Test;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextHelpAppendableTest {

    @Test
    public void testAppendListOrderedNonEmpty() throws Exception {
        StringWriter output = new StringWriter();
        TextHelpAppendable instance = new TextHelpAppendable(output);
        Collection<CharSequence> list = Arrays.asList("Item 1", "Item 2", "Item 3");
        
        instance.appendList(true, list);
        
        String expectedOutput = " 1. Item 1\n 2. Item 2\n 3. Item 3\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void testAppendListUnorderedNonEmpty() throws Exception {
        StringWriter output = new StringWriter();
        TextHelpAppendable instance = new TextHelpAppendable(output);
        Collection<CharSequence> list = Arrays.asList("Item A", "Item B", "Item C");
        
        instance.appendList(false, list);
        
        String expectedOutput = " * Item A\n * Item B\n * Item C\n";
        assertEquals(expectedOutput, output.toString());
    }

    @Test
    public void testAppendListEmpty() throws Exception {
        StringWriter output = new StringWriter();
        TextHelpAppendable instance = new TextHelpAppendable(output);
        Collection<CharSequence> list = Arrays.asList();
        
        instance.appendList(true, list);
        
        assertEquals("", output.toString());
    }

    @Test
    public void testAppendListNull() throws Exception {
        StringWriter output = new StringWriter();
        TextHelpAppendable instance = new TextHelpAppendable(output);
        
        instance.appendList(true, null);
        
        assertEquals("", output.toString());
    }

    @Test
    public void testAppendListWithDefaultValue() throws Exception {
        StringWriter output = new StringWriter();
        TextHelpAppendable instance = new TextHelpAppendable(output);
        Collection<CharSequence> list = Arrays.asList(null, "Item 1");
        
        instance.appendList(true, list);
        
        String expectedOutput = " 1. \n 2. Item 1\n";
        assertEquals(expectedOutput, output.toString());
    }
}