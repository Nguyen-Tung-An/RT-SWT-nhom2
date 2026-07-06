package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {
    private final ArrayStack<Object> stack = new ArrayStack<>();

    @Test
    void testSearch_NullObjectInStack() {
        stack.push(null);
        stack.push("test");
        assertEquals(2, stack.search(null));
    }

    @Test
    void testSearch_NullObjectNotInStack() {
        stack.push("test");
        assertEquals(-1, stack.search(null));
    }

    @Test
    void testSearch_EqualObjectInStack() {
        stack.push("test");
        stack.push("example");
        assertEquals(1, stack.search("example"));
    }

    @Test
    void testSearch_EqualObjectNotInStack() {
        stack.push("test");
        assertEquals(-1, stack.search("example"));
    }

    @Test
    void testSearch_EmptyStack() {
        assertEquals(-1, stack.search("test"));
    }

    @Test
    void testSearch_MultipleEqualObjects() {
        stack.push("test");
        stack.push("test");
        stack.push("example");
        assertEquals(2, stack.search("test"));
    }
}