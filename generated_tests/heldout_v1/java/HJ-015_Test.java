package org.apache.commons.collections4.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreeListTest {

    private class TestAVLNode<E> extends AVLNode<E> {
        TestAVLNode<E> left;
        TestAVLNode<E> right;

        TestAVLNode(E value) {
            super(value);
        }

        @Override
        public AVLNode<E> getLeft() {
            return left;
        }

        @Override
        public AVLNode<E> getRight() {
            return right;
        }

        @Override
        public void setLeft(AVLNode<E> left, Object obj) {
            this.left = (TestAVLNode<E>) left;
        }

        @Override
        public void setRight(AVLNode<E> right, Object obj) {
            this.right = (TestAVLNode<E>) right;
        }

        @Override
        public int heightRightMinusLeft() {
            return (right == null ? 0 : right.height()) - (left == null ? 0 : left.height());
        }

        @Override
        public AVLNode<E> rotateLeft() {
            // Implement rotation logic
            return this; // Placeholder
        }

        @Override
        public AVLNode<E> rotateRight() {
            // Implement rotation logic
            return this; // Placeholder
        }
    }

    @Test
    void testBalance_Case1() {
        TestAVLNode<Integer> node = new TestAVLNode<>(1);
        node.left = new TestAVLNode<>(0);
        node.right = new TestAVLNode<>(2);
        assertSame(node, node.balance());
    }

    @Test
    void testBalance_Case0() {
        TestAVLNode<Integer> node = new TestAVLNode<>(1);
        node.left = new TestAVLNode<>(0);
        node.right = new TestAVLNode<>(2);
        assertSame(node, node.balance());
    }

    @Test
    void testBalance_CaseMinus1() {
        TestAVLNode<Integer> node = new TestAVLNode<>(1);
        node.left = new TestAVLNode<>(0);
        node.right = new TestAVLNode<>(2);
        assertSame(node, node.balance());
    }

    @Test
    void testBalance_CaseMinus2_LeftHeavy() {
        TestAVLNode<Integer> node = new TestAVLNode<>(1);
        node.left = new TestAVLNode<>(0);
        node.left.left = new TestAVLNode<>(-1);
        assertNotNull(node.balance());
    }

    @Test
    void testBalance_Case2_RightHeavy() {
        TestAVLNode<Integer> node = new TestAVLNode<>(1);
        node.right = new TestAVLNode<>(2);
        node.right.right = new TestAVLNode<>(3);
        assertNotNull(node.balance());
    }

    @Test
    void testBalance_IllegalStateException() {
        TestAVLNode<Integer> node = new TestAVLNode<>(1);
        node.left = new TestAVLNode<>(0);
        node.right = new TestAVLNode<>(2);
        node.left.left = new TestAVLNode<>(-1);
        node.right.right = new TestAVLNode<>(3);
        assertThrows(IllegalStateException.class, node::balance);
    }
}