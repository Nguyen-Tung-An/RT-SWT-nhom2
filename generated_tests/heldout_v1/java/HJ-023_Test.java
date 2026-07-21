package org.apache.commons.collections4.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

class AbstractLinkedListJava21Test {

    private class TestList extends AbstractLinkedListJava21<Object> {
        @Override
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override
        public Iterator<Object> iterator() {
            return new Iterator<Object>() {
                private int index = 0;

                @Override
                public boolean hasNext() {
                    return index < size();
                }

                @Override
                public Object next() {
                    return get(index++);
                }
            };
        }

        @Override
        public int size() {
            return 0; // Default size for empty list
        }

        @Override
        public Object get(int index) {
            return null; // Default implementation
        }
    }

    @Test
    void testToString_EmptyList() {
        TestList list = new TestList();
        assertEquals("[]", list.toString());
    }

    @Test
    void testToString_SingleElement() {
        TestList list = new TestList() {
            @Override
            public int size() {
                return 1;
            }

            @Override
            public Object get(int index) {
                return "element";
            }
        };
        assertEquals("[element]", list.toString());
    }

    @Test
    void testToString_MultipleElements() {
        TestList list = new TestList() {
            private final Object[] elements = {"first", "second", "third"};

            @Override
            public int size() {
                return elements.length;
            }

            @Override
            public Object get(int index) {
                return elements[index];
            }
        };
        assertEquals("[first, second, third]", list.toString());
    }

    @Test
    void testToString_SelfReference() {
        TestList list = new TestList() {
            private final Object[] elements = new Object[1];

            @Override
            public int size() {
                return 1;
            }

            @Override
            public Object get(int index) {
                return this; // Self-reference
            }
        };
        assertEquals("[ (this Collection) ]", list.toString());
    }
}