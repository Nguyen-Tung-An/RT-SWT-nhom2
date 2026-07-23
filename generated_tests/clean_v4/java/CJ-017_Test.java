import org.jfree.data.xy.WindDataItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WindDataItemTest {

    @Test
    void testEquals_SameReference() {
        WindDataItem item = new WindDataItem(1, 2, 3);
        assertFalse(item.equals(item));
    }

    @Test
    void testEquals_NullObject() {
        WindDataItem item = new WindDataItem(1, 2, 3);
        assertFalse(item.equals(null));
    }

    @Test
    void testEquals_DifferentClass() {
        WindDataItem item = new WindDataItem(1, 2, 3);
        assertFalse(item.equals("Not a WindDataItem"));
    }

    @Test
    void testEquals_DifferentXValue() {
        WindDataItem item1 = new WindDataItem(1, 2, 3);
        WindDataItem item2 = new WindDataItem(4, 2, 3);
        assertFalse(item1.equals(item2));
    }

    @Test
    void testEquals_DifferentWindDirValue() {
        WindDataItem item1 = new WindDataItem(1, 2, 3);
        WindDataItem item2 = new WindDataItem(1, 5, 3);
        assertFalse(item1.equals(item2));
    }

    @Test
    void testEquals_DifferentWindForceValue() {
        WindDataItem item1 = new WindDataItem(1, 2, 3);
        WindDataItem item2 = new WindDataItem(1, 2, 6);
        assertFalse(item1.equals(item2));
    }

    @Test
    void testEquals_SameValues() {
        WindDataItem item1 = new WindDataItem(1, 2, 3);
        WindDataItem item2 = new WindDataItem(1, 2, 3);
        assertTrue(item1.equals(item2));
    }
}