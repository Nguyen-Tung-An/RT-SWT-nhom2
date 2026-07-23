import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionUtilsTest {

    @Test
    public void testFilter_NonEmptyCollection_RemovesMatchingElements() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        
        Predicate<Integer> predicate = x -> x % 2 == 0; // Remove odd numbers
        
        boolean result = CollectionUtils.filter(collection, predicate);
        
        assertEquals(true, result);
        assertEquals(List.of(2), collection);
    }

    @Test
    public void testFilter_EmptyCollection_NoElementsRemoved() {
        List<Integer> collection = new ArrayList<>();
        
        Predicate<Integer> predicate = x -> x % 2 == 0; // Remove odd numbers
        
        boolean result = CollectionUtils.filter(collection, predicate);
        
        assertEquals(false, result);
        assertEquals(List.of(), collection);
    }

    @Test
    public void testFilter_NullCollection_ReturnsFalse() {
        Predicate<Integer> predicate = x -> x % 2 == 0; // Remove odd numbers
        
        boolean result = CollectionUtils.filter(null, predicate);
        
        assertEquals(false, result);
    }

    @Test
    public void testFilter_NullPredicate_ReturnsFalse() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        
        boolean result = CollectionUtils.filter(collection, null);
        
        assertEquals(false, result);
        assertEquals(List.of(1, 2), collection);
    }

    @Test
    public void testFilter_NullCollectionAndPredicate_ReturnsFalse() {
        boolean result = CollectionUtils.filter(null, null);
        
        assertEquals(false, result);
    }

    @Test
    public void testFilter_SingleElementCollection_RemovesElement() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        
        Predicate<Integer> predicate = x -> x == 1; // Remove the only element
        
        boolean result = CollectionUtils.filter(collection, predicate);
        
        assertEquals(true, result);
        assertEquals(List.of(), collection);
    }

    @Test
    public void testFilter_SingleElementCollection_NoRemoval() {
        List<Integer> collection = new ArrayList<>();
        collection.add(2);
        
        Predicate<Integer> predicate = x -> x == 1; // No removal
        
        boolean result = CollectionUtils.filter(collection, predicate);
        
        assertEquals(false, result);
        assertEquals(List.of(2), collection);
    }
}