package org.apache.commons.cli.help;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class HelpFormatterTest {

    @Test
    void testGetTableDefinition_EmptyOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Iterable<Option> options = Arrays.asList();
        TableDefinition result = formatter.getTableDefinition(options);
        assertNotNull(result);
        assertTrue(result.getRows().isEmpty());
    }

    @Test
    void testGetTableDefinition_SingleOptionWithoutArg() {
        HelpFormatter formatter = new HelpFormatter();
        Option option = new Option("a", "optionA", false, "Description for option A");
        Iterable<Option> options = Arrays.asList(option);
        TableDefinition result = formatter.getTableDefinition(options);
        assertNotNull(result);
        assertEquals(1, result.getRows().size());
        assertEquals(" -a", result.getRows().get(0).get(0));
        assertEquals("Description for option A", result.getRows().get(0).get(2));
    }

    @Test
    void testGetTableDefinition_SingleOptionWithArg() {
        HelpFormatter formatter = new HelpFormatter();
        Option option = new Option("b", "optionB", true, "Description for option B");
        Iterable<Option> options = Arrays.asList(option);
        TableDefinition result = formatter.getTableDefinition(options);
        assertNotNull(result);
        assertEquals(1, result.getRows().size());
        assertEquals(" -b <arg>", result.getRows().get(0).get(0));
        assertEquals("Description for option B", result.getRows().get(0).get(2));
    }

    @Test
    void testGetTableDefinition_MultipleOptions() {
        HelpFormatter formatter = new HelpFormatter();
        Option option1 = new Option("c", "optionC", false, "Description for option C");
        Option option2 = new Option("d", "optionD", true, "Description for option D");
        Iterable<Option> options = Arrays.asList(option1, option2);
        TableDefinition result = formatter.getTableDefinition(options);
        assertNotNull(result);
        assertEquals(2, result.getRows().size());
        assertEquals(" -c", result.getRows().get(0).get(0));
        assertEquals("Description for option C", result.getRows().get(0).get(2));
        assertEquals(" -d <arg>", result.getRows().get(1).get(0));
        assertEquals("Description for option D", result.getRows().get(1).get(2));
    }

    @Test
    void testGetTableDefinition_WithShowSince() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setShowSince(true);
        Option option = new Option("e", "optionE", false, "Description for option E");
        option.setSince("1.0");
        Iterable<Option> options = Arrays.asList(option);
        TableDefinition result = formatter.getTableDefinition(options);
        assertNotNull(result);
        assertEquals(1, result.getRows().size());
        assertEquals(" -e", result.getRows().get(0).get(0));
        assertEquals("1.0", result.getRows().get(0).get(1));
        assertEquals("Description for option E", result.getRows().get(0).get(2));
    }
}