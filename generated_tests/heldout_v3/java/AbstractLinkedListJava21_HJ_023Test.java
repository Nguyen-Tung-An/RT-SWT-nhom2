import org.apache.commons.collections4.list.AbstractLinkedListJava21;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractLinkedListJava21Test {

    @Test
    public void testToString_EmptyList() {
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<>();
        assertEquals("[]", list.toString());
    }

    @Test
    public void testToString_SingleElement() {
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<>();
        list.add("element1");
        assertEquals("[element1]", list.toString());
    }

    @Test
    public void testToString_MultipleElements() {
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<>();
        list.add("element1");
        list.add("element2");
        assertEquals("[element1, element2]", list.toString());
    }

    @Test
    public void testToString_SelfReference() {
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<>();
        list.add(list); // Adding itself to the list
        assertEquals("[(this Collection)]", list.toString());
    }

    @Test
    public void testToString_MultipleElementsWithSelfReference() {
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<>();
        list.add("element1");
        list.add(list); // Adding itself to the list
        assertEquals("[element1, (this Collection)]", list.toString());
    }
}