import org.jsoup.nodes.Attributes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AttributesEqualsTest {

    @Test
    void testEquals_SameInstance() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.equals(attrs));
    }

    @Test
    void testEquals_NullObject() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        Attributes attrs = new Attributes();
        String differentClassObject = "Not an Attributes object";
        assertFalse(attrs.equals(differentClassObject));
    }

    @Test
    void testEquals_DifferentSize() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");
        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    void testEquals_SameSize_DifferentValues() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value3");
        assertFalse(attrs1.equals(attrs2));
    }

    @Test
    void testEquals_SameSize_SameValues() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");
        assertTrue(attrs1.equals(attrs2));
    }

    @Test
    void testEquals_SameSize_SameKeysDifferentOrder() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        attrs1.put("key2", "value2");
        Attributes attrs2 = new Attributes();
        attrs2.put("key2", "value2");
        attrs2.put("key1", "value1");
        assertTrue(attrs1.equals(attrs2));
    }

    @Test
    void testEquals_SameSize_OneNullValue() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", null);
        attrs1.put("key2", "value2");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", null);
        attrs2.put("key2", "value2");
        assertTrue(attrs1.equals(attrs2));
    }

    @Test
    void testEquals_SameSize_OneNullValueDifferent() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", null);
        attrs1.put("key2", "value2");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        attrs2.put("key2", "value2");
        assertFalse(attrs1.equals(attrs2));
    }
}