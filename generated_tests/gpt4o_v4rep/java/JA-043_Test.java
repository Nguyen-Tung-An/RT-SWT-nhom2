import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionUtilsTest {

    @Test
    void testGetFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals("value1", CollectionUtils.get((Object) map, 0));
        assertEquals("value2", CollectionUtils.get((Object) map, 1));
    }

    @Test
    void testGetFromArray() {
        String[] array = {"element0", "element1", "element2"};
        assertEquals("element0", CollectionUtils.get((Object) array, 0));
        assertEquals("element1", CollectionUtils.get((Object) array, 1));
        assertEquals("element2", CollectionUtils.get((Object) array, 2));
    }

    @Test
    void testGetFromIterator() {
        List<String> list = Arrays.asList("item0", "item1", "item2");
        Iterator<String> iterator = list.iterator();
        assertEquals("item0", CollectionUtils.get((Object) iterator, 0));
        assertEquals("item1", CollectionUtils.get((Object) iterator, 1));
    }

    @Test
    void testGetFromIterable() {
        List<String> iterable = Arrays.asList("first", "second", "third");
        assertEquals("first", CollectionUtils.get((Object) iterable, 0));
        assertEquals("second", CollectionUtils.get((Object) iterable, 1));
    }

    @Test
    void testGetFromEnumeration() {
        Vector<String> enumeration = new Vector<>();
        enumeration.add("one");
        enumeration.add("two");
        assertEquals("one", CollectionUtils.get((Object) enumeration.elements(), 0));
        assertEquals("two", CollectionUtils.get((Object) enumeration.elements(), 1));
    }

    @Test
    void testGetNegativeIndex() {
        assertThrows(IndexOutOfBoundsException.class, () -> CollectionUtils.get(new Object[]{}, -1));
    }

    @Test
    void testGetNullObject() {
        assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get((Object) null, 0));
    }

    @Test
    void testGetUnsupportedObjectType() {
        assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get(new Object(), 0));
    }

    @Test
    void testGetArrayWithIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> CollectionUtils.get(new Object(), 1));
    }
}