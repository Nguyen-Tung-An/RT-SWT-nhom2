import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollectionUtilsTest {

    @Test
    public void testFilter_NonNullCollectionAndPredicate_RemovesMatchingElements() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        
        Predicate<Integer> predicate = number -> number % 2 == 0; // Remove even numbers
        
        boolean result = CollectionUtils.filter((Iterable<Integer>) collection, (org.apache.commons.collections4.Predicate<? super Integer>) predicate);
        
        assertTrue(result);
        assertFalse(collection.contains(2));
        assertTrue(collection.contains(1));
        assertTrue(collection.contains(3));
    }

    @Test
    public void testFilter_NonNullCollectionAndPredicate_NoElementsRemoved() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(3);
        
        Predicate<Integer> predicate = number -> number % 2 == 0; // Remove even numbers
        
        boolean result = CollectionUtils.filter((Iterable<Integer>) collection, (org.apache.commons.collections4.Predicate<? super Integer>) predicate);
        
        assertFalse(result);
        assertTrue(collection.contains(1));
        assertTrue(collection.contains(3));
    }

    @Test
    public void testFilter_NullCollection() {
        Predicate<Integer> predicate = number -> number % 2 == 0; // Remove even numbers
        
        boolean result = CollectionUtils.filter(null, (org.apache.commons.collections4.Predicate<? super Integer>) predicate);
        
        assertFalse(result);
    }

    @Test
    public void testFilter_NullPredicate() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        
        boolean result = CollectionUtils.filter((Iterable<Integer>) collection, null);
        
        assertFalse(result);
        assertTrue(collection.contains(1));
        assertTrue(collection.contains(2));
    }

    @Test
    public void testFilter_EmptyCollection() {
        List<Integer> collection = new ArrayList<>();
        
        Predicate<Integer> predicate = number -> number % 2 == 0; // Remove even numbers
        
        boolean result = CollectionUtils.filter((Iterable<Integer>) collection, (org.apache.commons.collections4.Predicate<? super Integer>) predicate);
        
        assertFalse(result);
    }
}