import org.jfree.chart.ChartHints;
import org.jfree.chart.ChartHints.Key;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyTest {

    @Test
    void testIsCompatibleValue_case0_withNull() {
        Key key = new Key(0);
        assertTrue(key.isCompatibleValue(null));
    }

    @Test
    void testIsCompatibleValue_case0_withString() {
        Key key = new Key(0);
        assertTrue(key.isCompatibleValue("test"));
    }

    @Test
    void testIsCompatibleValue_case0_withMap() {
        Key key = new Key(0);
        assertTrue(key.isCompatibleValue(new java.util.HashMap<>()));
    }

    @Test
    void testIsCompatibleValue_case0_withInteger() {
        Key key = new Key(0);
        assertFalse(key.isCompatibleValue(123));
    }

    @Test
    void testIsCompatibleValue_case1_withNull() {
        Key key = new Key(1);
        assertTrue(key.isCompatibleValue(null));
    }

    @Test
    void testIsCompatibleValue_case1_withObject() {
        Key key = new Key(1);
        assertTrue(key.isCompatibleValue(new Object()));
    }

    @Test
    void testIsCompatibleValue_case1_withString() {
        Key key = new Key(1);
        assertFalse(key.isCompatibleValue("test"));
    }

    @Test
    void testIsCompatibleValue_case1_withInteger() {
        Key key = new Key(1);
        assertFalse(key.isCompatibleValue(123));
    }

    @Test
    void testIsCompatibleValue_invalidCase() {
        Key key = new Key(2);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            key.isCompatibleValue(new Object());
        });
        assertEquals("Not possible!", exception.getMessage());
    }
}