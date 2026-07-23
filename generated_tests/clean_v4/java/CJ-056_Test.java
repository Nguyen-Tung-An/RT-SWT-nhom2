import org.apache.commons.cli.help.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.help.TableDefinition;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest {

    @Test
    public void testGetTableDefinitionWithNoOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Iterable<Option> options = Collections.emptyList();
        TableDefinition result = formatter.getTableDefinition(options);
        
        assertEquals(3, result.getHeaders().size());
        assertEquals("Options", result.getHeaders().get(0));
        assertEquals("Description", result.getHeaders().get(2));
        assertEquals(0, result.getRows().size());
    }

    @Test
    public void testGetTableDefinitionWithSingleOptionWithoutArg() {
        HelpFormatter formatter = new HelpFormatter();
        Option option = new Option("a", "optionA", false, "Description for option A");
        Iterable<Option> options = Collections.singletonList(option);
        TableDefinition result = formatter.getTableDefinition(options);
        
        assertEquals(3, result.getHeaders().size());
        assertEquals("Options", result.getHeaders().get(0));
        assertEquals("Description", result.getHeaders().get(2));
        assertEquals(1, result.getRows().size());
        assertEquals(" -a", result.getRows().get(0).get(0));
        assertEquals("Description for option A", result.getRows().get(0).get(2));
    }

    @Test
    public void testGetTableDefinitionWithSingleOptionWithArg() {
        HelpFormatter formatter = new HelpFormatter();
        Option option = new Option("b", "optionB", true, "Description for option B");
        option.setArgName("argB");
        Iterable<Option> options = Collections.singletonList(option);
        TableDefinition result = formatter.getTableDefinition(options);
        
        assertEquals(3, result.getHeaders().size());
        assertEquals("Options", result.getHeaders().get(0));
        assertEquals("Description", result.getHeaders().get(2));
        assertEquals(1, result.getRows().size());
        assertEquals(" -b argB", result.getRows().get(0).get(0));
        assertEquals("Description for option B", result.getRows().get(0).get(2));
    }

    @Test
    public void testGetTableDefinitionWithMultipleOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Option option1 = new Option("c", "optionC", false, "Description for option C");
        Option option2 = new Option("d", "optionD", true, "Description for option D");
        option2.setArgName("argD");
        Iterable<Option> options = Arrays.asList(option1, option2);
        TableDefinition result = formatter.getTableDefinition(options);
        
        assertEquals(3, result.getHeaders().size());
        assertEquals("Options", result.getHeaders().get(0));
        assertEquals("Description", result.getHeaders().get(2));
        assertEquals(2, result.getRows().size());
        assertEquals(" -c", result.getRows().get(0).get(0));
        assertEquals("Description for option C", result.getRows().get(0).get(2));
        assertEquals(" -d argD", result.getRows().get(1).get(0));
        assertEquals("Description for option D", result.getRows().get(1).get(2));
    }
}