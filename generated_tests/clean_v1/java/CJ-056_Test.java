package org.apache.commons.cli.help;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class HelpFormatterTest {

    @Test
    void testGetTableDefinition_WithOptionsAndShowSince() {
        Option option1 = new Option("a", "arg1", true, "Description for option a");
        Option option2 = new Option("b", "arg2", false, "Description for option b");
        option1.setSince("1.0");
        option2.setSince("1.1");
        
        List<Option> options = Arrays.asList(option1, option2);
        HelpFormatter formatter = new HelpFormatter();
        formatter.setShowSince(true);
        
        TableDefinition tableDefinition = formatter.getTableDefinition(options);
        
        assertNotNull(tableDefinition);
        assertEquals(3, tableDefinition.getHeaders().size());
        assertEquals("Options", tableDefinition.getHeaders().get(0));
        assertEquals("Since", tableDefinition.getHeaders().get(1));
        assertEquals("Description", tableDefinition.getHeaders().get(2));
        assertEquals(2, tableDefinition.getRows().size());
    }

    @Test
    void testGetTableDefinition_WithOptionsWithoutShowSince() {
        Option option1 = new Option("c", "arg3", true, "Description for option c");
        Option option2 = new Option("d", "arg4", false, "Description for option d");
        
        List<Option> options = Arrays.asList(option1, option2);
        HelpFormatter formatter = new HelpFormatter();
        formatter.setShowSince(false);
        
        TableDefinition tableDefinition = formatter.getTableDefinition(options);
        
        assertNotNull(tableDefinition);
        assertEquals(2, tableDefinition.getHeaders().size());
        assertEquals("Options", tableDefinition.getHeaders().get(0));
        assertEquals("Description", tableDefinition.getHeaders().get(1));
        assertEquals(2, tableDefinition.getRows().size());
    }

    @Test
    void testGetTableDefinition_EmptyOptions() {
        List<Option> options = Arrays.asList();
        HelpFormatter formatter = new HelpFormatter();
        
        TableDefinition tableDefinition = formatter.getTableDefinition(options);
        
        assertNotNull(tableDefinition);
        assertEquals(3, tableDefinition.getHeaders().size());
        assertEquals("Options", tableDefinition.getHeaders().get(0));
        assertEquals("Since", tableDefinition.getHeaders().get(1));
        assertEquals("Description", tableDefinition.getHeaders().get(2));
        assertEquals(0, tableDefinition.getRows().size());
    }
}