package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {
    @Test
    void testSearch_NullObjectInStack() {
        ArrayStack stack = new ArrayStack();
        stack.push(null);
        stack.push("test");
        assertEquals(2, stack.search(null));
    }

    @Test
    void testSearch_ObjectFound() {
        ArrayStack stack = new ArrayStack();
        stack.push("test");
        stack.push("example");
        assertEquals(1, stack.search("test"));
    }

    @Test
    void testSearch_ObjectNotFound() {
        ArrayStack stack = new ArrayStack();
        stack.push("example");
        stack.push("test");
        assertEquals(-1, stack.search("notfound"));
    }

    @Test
    void testSearch_EmptyStack() {
        ArrayStack stack = new ArrayStack();
        assertEquals(-1, stack.search("test"));
    }

    @Test
    void testSearch_NullObjectInStackWithNullSearch() {
        ArrayStack stack = new ArrayStack();
        stack.push(null);
        assertEquals(1, stack.search(null));
    }

    @Test
    void testSearch_NullObjectInStackWithNonNullSearch() {
        ArrayStack stack = new ArrayStack();
        stack.push(null);
        assertEquals(-1, stack.search("test"));
    }
}