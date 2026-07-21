import org.apache.commons.collections4.list.AbstractLinkedListJava21;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbstractLinkedListJava21Test {

    @Test
    void testToString_EmptyList() {
        AbstractLinkedListJava21 list = new AbstractLinkedListJava21();
        assertEquals("[]", list.toString());
    }

    @Test
    void testToString_SingleElement() {
        AbstractLinkedListJava21 list = new AbstractLinkedListJava21();
        list.add("element");
        assertEquals("[element]", list.toString());
    }

    @Test
    void testToString_MultipleElements() {
        AbstractLinkedListJava21 list = new AbstractLinkedListJava21();
        list.add("first");
        list.add("second");
        list.add("third");
        assertEquals("[first, second, third]", list.toString());
    }

    @Test
    void testToString_NullElement() {
        AbstractLinkedListJava21 list = new AbstractLinkedListJava21();
        list.add(null);
        assertEquals("[null]", list.toString());
    }

    @Test
    void testToString_ConcurrentModification() {
        AbstractLinkedListJava21 list = new AbstractLinkedListJava21();
        list.add("one");
        list.add("two");
        list.add("three");
        
        // Simulate concurrent modification
        list.remove("two");
        assertEquals("[one, three]", list.toString());
    }
}