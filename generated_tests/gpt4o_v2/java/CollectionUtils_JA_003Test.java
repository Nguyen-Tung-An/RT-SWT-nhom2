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
        
        Predicate<Integer> predicate = x -> x < 3;
        
        boolean result = CollectionUtils.filter(collection, predicate);
        
        assertEquals(true, result);
        assertEquals(List.of(3), collection);
    }

    @Test
    public void testFilter_EmptyCollection_NoRemoval() {
        List<Integer> collection = new ArrayList<>();
        
        Predicate<Integer> predicate = x -> x < 3;
        
        boolean result = CollectionUtils.filter(collection, predicate);
        
        assertEquals(false, result);
        assertEquals(List.of(), collection);
    }

    @Test
    public void testFilter_NullCollection() {
        Predicate<Integer> predicate = x -> x < 3;
        
        boolean result = CollectionUtils.filter(null, predicate);
        
        assertEquals(false, result);
    }

    @Test
    public void testFilter_NullPredicate() {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        
        boolean result = CollectionUtils.filter(collection, null);
        
        assertEquals(false, result);
        assertEquals(List.of(1), collection);
    }

    @Test
    public void testFilter_NullCollectionAndPredicate() {
        boolean result = CollectionUtils.filter(null, null);
        
        assertEquals(false, result);
    }

    @Test
    public void testFilter_SingleElementCollection_RemovesElement() {
        List<Integer> collection = new ArrayList<>();
        collection.add(5);
        
        Predicate<Integer> predicate = x -> x > 3;
        
        boolean result = CollectionUtils.filter(collection, predicate);
        
        assertEquals(true, result);
        assertEquals(List.of(), collection);
    }
}