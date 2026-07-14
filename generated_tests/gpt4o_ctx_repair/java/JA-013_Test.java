package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {
    @Test
    void testSearch_NullObjectInStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push(null);
        stack.push("test");
        assertEquals(2, stack.search(null));
    }

    @Test
    void testSearch_ObjectFound() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push("test");
        stack.push("example");
        assertEquals(2, stack.search("test"));
    }

    @Test
    void testSearch_ObjectNotFound() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push("example");
        stack.push("test");
        assertEquals(-1, stack.search("notfound"));
    }

    @Test
    void testSearch_EmptyStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        assertEquals(-1, stack.search("test"));
    }

    @Test
    void testSearch_NullObjectInStackWithNullSearch() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push(null);
        assertEquals(1, stack.search(null));
    }

    @Test
    void testSearch_NullObjectInStackWithNonNullSearch() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push(null);
        assertEquals(-1, stack.search("test"));
    }
}