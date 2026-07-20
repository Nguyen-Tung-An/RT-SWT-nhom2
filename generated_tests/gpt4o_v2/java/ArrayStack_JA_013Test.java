import org.apache.commons.collections4.ArrayStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayStackTest {

    @Test
    public void testSearch_NullObjectInStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push(null);
        stack.push("test");
        stack.push(null);
        assertEquals(1, stack.search(null));
    }

    @Test
    public void testSearch_ExistingObjectInStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
        assertEquals(2, stack.search("test2"));
    }

    @Test
    public void testSearch_NonExistingObjectInStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
        assertEquals(-1, stack.search("test4"));
    }

    @Test
    public void testSearch_EmptyStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        assertEquals(-1, stack.search("test"));
    }

    @Test
    public void testSearch_NullObjectInEmptyStack() {
        ArrayStack<Object> stack = new ArrayStack<>();
        assertEquals(-1, stack.search(null));
    }

    @Test
    public void testSearch_NullAndNonNullObjects() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push("test1");
        stack.push(null);
        stack.push("test2");
        assertEquals(1, stack.search(null));
    }

    @Test
    public void testSearch_MultipleSameObjects() {
        ArrayStack<Object> stack = new ArrayStack<>();
        stack.push("test");
        stack.push("test");
        stack.push("test");
        assertEquals(3, stack.search("test"));
    }
}