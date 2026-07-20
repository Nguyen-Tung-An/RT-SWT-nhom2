import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DefaultParserTest {

    @Test
    void testIsShortOption_NullToken() throws Exception {
        DefaultParser instance = new DefaultParser();
        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, (String) null);
        assertFalse((Boolean) result);
    }

    @Test
    void testIsShortOption_EmptyToken() throws Exception {
        DefaultParser instance = new DefaultParser();
        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, "");
        assertFalse((Boolean) result);
    }

    @Test
    void testIsShortOption_SingleCharacterWithoutPrefix() throws Exception {
        DefaultParser instance = new DefaultParser();
        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, "A");
        assertFalse((Boolean) result);
    }

    @Test
    void testIsShortOption_SingleCharacterWithPrefix() throws Exception {
        DefaultParser instance = new DefaultParser();
        Field f = DefaultParser.class.getDeclaredField("options");
        f.setAccessible(true);
        Options options = new Options();
        options.addOption("A", "optionA", false, "Option A");
        f.set(instance, options);

        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, "-A");
        assertTrue((Boolean) result);
    }

    @Test
    void testIsShortOption_ConcatenatedShortOptions() throws Exception {
        DefaultParser instance = new DefaultParser();
        Field f = DefaultParser.class.getDeclaredField("options");
        f.setAccessible(true);
        Options options = new Options();
        options.addOption("A", "optionA", false, "Option A");
        options.addOption("B", "optionB", false, "Option B");
        f.set(instance, options);

        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, "-AB");
        assertTrue((Boolean) result);
    }

    @Test
    void testIsShortOption_OptionWithValue() throws Exception {
        DefaultParser instance = new DefaultParser();
        Field f = DefaultParser.class.getDeclaredField("options");
        f.setAccessible(true);
        Options options = new Options();
        options.addOption("A", "optionA", true, "Option A");
        f.set(instance, options);

        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, "-A=value");
        assertTrue((Boolean) result);
    }

    @Test
    void testIsShortOption_InvalidOption() throws Exception {
        DefaultParser instance = new DefaultParser();
        Field f = DefaultParser.class.getDeclaredField("options");
        f.setAccessible(true);
        Options options = new Options();
        f.set(instance, options);

        Method m = DefaultParser.class.getDeclaredMethod("isShortOption", String.class);
        m.setAccessible(true);
        Object result = m.invoke(instance, "-C");
        assertFalse((Boolean) result);
    }
}