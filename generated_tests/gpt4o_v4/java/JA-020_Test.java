import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelpFormatterTest {

    @Test
    public void testAppendOptionGroupWithRequiredGroup() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(true);
        Option option1 = new Option("a", "optionA", false, "Option A");
        optionGroup.addOption(option1);
        
        invokeAppendOptionGroup(instance, buff, optionGroup);
        
        assertEquals("a", buff.toString());
    }

    @Test
    public void testAppendOptionGroupWithOptionalGroup() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        Option option1 = new Option("a", "optionA", false, "Option A");
        Option option2 = new Option("b", "optionB", false, "Option B");
        optionGroup.addOption(option1);
        optionGroup.addOption(option2);
        
        invokeAppendOptionGroup(instance, buff, optionGroup);
        
        assertEquals("[a" + AbstractHelpFormatter.DEFAULT_OPTION_GROUP_SEPARATOR + "b]", buff.toString());
    }

    @Test
    public void testAppendOptionGroupWithEmptyGroup() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        
        invokeAppendOptionGroup(instance, buff, optionGroup);
        
        assertEquals("[]", buff.toString());
    }

    @Test
    public void testAppendOptionGroupWithNullComparator() throws Exception {
        HelpFormatter instance = new HelpFormatter();
        StringBuilder buff = new StringBuilder();
        OptionGroup optionGroup = new OptionGroup();
        optionGroup.setRequired(false);
        Option option1 = new Option("a", "optionA", false, "Option A");
        optionGroup.addOption(option1);
        
        // Set the comparator to null
        Field comparatorField = HelpFormatter.class.getDeclaredField("optionComparator");
        comparatorField.setAccessible(true);
        comparatorField.set(instance, null);
        
        invokeAppendOptionGroup(instance, buff, optionGroup);
        
        assertEquals("[a]", buff.toString());
    }

    private void invokeAppendOptionGroup(HelpFormatter instance, StringBuilder buff, OptionGroup optionGroup) throws Exception {
        Method m = HelpFormatter.class.getDeclaredMethod("appendOptionGroup", StringBuilder.class, OptionGroup.class);
        m.setAccessible(true);
        m.invoke(instance, buff, optionGroup);
    }
}