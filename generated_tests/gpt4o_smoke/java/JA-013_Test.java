package org.apache.commons.collections4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayStackTest {

    @Test
    public void testSearch_NullObjectInStack() {
        ArrayStack stack = new ArrayStack();
        stack.push(null);
        stack.push("test");
        stack.push(null);
        assertEquals(1, stack.search(null));
    }

    @Test
    public void testSearch_ObjectFoundAtTop() {
        ArrayStack stack = new ArrayStack();
        stack.push("test");
        stack.push("example");
        stack.push("search");
        assertEquals(1, stack.search("search"));
    }

    @Test
    public void testSearch_ObjectFoundInMiddle() {
        ArrayStack stack = new ArrayStack();
        stack.push("test");
        stack.push("example");
        stack.push("search");
        assertEquals(2, stack.search("example"));
    }

    @Test
    public void testSearch_ObjectNotFound() {
        ArrayStack stack = new ArrayStack();
        stack.push("test");
        stack.push("example");
        stack.push("search");
        assertEquals(-1, stack.search("notfound"));
    }

    @Test
    public void testSearch_EmptyStack() {
        ArrayStack stack = new ArrayStack();
        assertEquals(-1, stack.search("test"));
    }

    @Test
    public void testSearch_NullObjectInStackWithNonNullSearch() {
        ArrayStack stack = new ArrayStack();
        stack.push("test");
        stack.push(null);
        stack.push("example");
        assertEquals(-1, stack.search("notfound"));
    }

    @Test
    public void testSearch_NullSearchWithNonNullObjects() {
        ArrayStack stack = new ArrayStack();
        stack.push("test");
        stack.push("example");
        assertEquals(-1, stack.search(null));
    }

    @Test
    public void testSearch_NullSearchWithNullObjects() {
        ArrayStack stack = new ArrayStack();
        stack.push(null);
        stack.push(null);
        assertEquals(1, stack.search(null));
    }
}