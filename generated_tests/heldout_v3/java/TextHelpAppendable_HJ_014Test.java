import org.apache.commons.cli.help.TextHelpAppendable;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextHelpAppendableTest {

    @Test
    public void testAppendListWithEmptyCollection() {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<String> emptyCollection = Arrays.asList();
        String result = instance.appendList(true, emptyCollection);
        assertEquals("", result);
    }

    @Test
    public void testAppendListWithSingleElement() {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<String> singleElement = Arrays.asList("element1");
        String result = instance.appendList(true, singleElement);
        assertEquals("element1", result);
    }

    @Test
    public void testAppendListWithMultipleElements() {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<String> multipleElements = Arrays.asList("element1", "element2", "element3");
        String result = instance.appendList(true, multipleElements);
        assertEquals("element1, element2, element3", result);
    }

    @Test
    public void testAppendListWithNullCollection() {
        TextHelpAppendable instance = new TextHelpAppendable();
        String result = instance.appendList(true, null);
        assertEquals("", result);
    }

    @Test
    public void testAppendListWithFalseFlag() {
        TextHelpAppendable instance = new TextHelpAppendable();
        Collection<String> multipleElements = Arrays.asList("element1", "element2");
        String result = instance.appendList(false, multipleElements);
        assertEquals("element1, element2", result);
    }
}