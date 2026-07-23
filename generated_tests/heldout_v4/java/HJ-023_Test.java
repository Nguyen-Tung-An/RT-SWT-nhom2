import org.apache.commons.collections4.list.AbstractLinkedListJava21;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractLinkedListJava21Test {

    @Test
    void testToString_EmptyList() {
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<Object>() {};
        assertEquals("[]", list.toString());
    }

    @Test
    void testToString_SingleElement() {
        AbstractLinkedListJava21<String> list = new AbstractLinkedListJava21<>(Collections.singletonList("element"));
        assertEquals("[element]", list.toString());
    }

    @Test
    void testToString_MultipleElements() {
        AbstractLinkedListJava21<String> list = new AbstractLinkedListJava21<>(Arrays.asList("first", "second", "third"));
        assertEquals("[first, second, third]", list.toString());
    }

    @Test
    void testToString_SelfReference() {
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<>(Collections.singletonList(new Object() {
            @Override
            public String toString() {
                return "self";
            }
        }));
        assertEquals("[self]", list.toString());
    }

    @Test
    void testToString_SelfReferenceInMultipleElements() {
        Object self = new Object() {
            @Override
            public String toString() {
                return "self";
            }
        };
        AbstractLinkedListJava21<Object> list = new AbstractLinkedListJava21<>(Arrays.asList(self, "other"));
        assertEquals("[self, other]", list.toString());
    }
}