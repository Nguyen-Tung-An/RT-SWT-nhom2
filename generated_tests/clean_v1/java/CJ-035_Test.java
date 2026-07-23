package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class OptionGroupTest {

    @Test
    void testToString_WithOptions() {
        Option option1 = new Option("a", "optionA", false, "Description A");
        Option option2 = new Option("b", "optionB", false, "Description B");
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setOptions(Arrays.asList(option1, option2));
        
        String expected = "[--optionA Description A, --optionB Description B]";
        assertEquals(expected, optionGroup.toString());
    }

    @Test
    void testToString_WithNullOpt() {
        Option option1 = new Option(null, "optionA", false, "Description A");
        Option option2 = new Option("b", "optionB", false, "Description B");
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setOptions(Arrays.asList(option1, option2));
        
        String expected = "[--optionA Description A, --optionB Description B]";
        assertEquals(expected, optionGroup.toString());
    }

    @Test
    void testToString_WithEmptyOptions() {
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setOptions(Arrays.asList());
        
        String expected = "[]";
        assertEquals(expected, optionGroup.toString());
    }

    @Test
    void testToString_WithOnlyLongOptions() {
        Option option1 = new Option(null, "optionA", false, null);
        Option option2 = new Option(null, "optionB", false, null);
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setOptions(Arrays.asList(option1, option2));
        
        String expected = "[--optionA, --optionB]";
        assertEquals(expected, optionGroup.toString());
    }
}