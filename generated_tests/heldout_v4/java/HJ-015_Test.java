package org.apache.commons.collections4.list;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AVLNodeTest {

    @Test
    void testBalanceCase1() throws Exception {
        TreeList.AVLNode<Integer> node = createNodeWithHeight(0);
        Method m = TreeList.AVLNode.class.getDeclaredMethod("balance");
        m.setAccessible(true);
        Object result = m.invoke(node);
        assertEquals(node, result);
    }

    @Test
    void testBalanceCase0() throws Exception {
        TreeList.AVLNode<Integer> node = createNodeWithHeight(1);
        Method m = TreeList.AVLNode.class.getDeclaredMethod("balance");
        m.setAccessible(true);
        Object result = m.invoke(node);
        assertEquals(node, result);
    }

    @Test
    void testBalanceCaseMinus1() throws Exception {
        TreeList.AVLNode<Integer> node = createNodeWithHeight(-1);
        Method m = TreeList.AVLNode.class.getDeclaredMethod("balance");
        m.setAccessible(true);
        Object result = m.invoke(node);
        assertEquals(node, result);
    }

    @Test
    void testBalanceCaseMinus2LeftHeavy() throws Exception {
        TreeList.AVLNode<Integer> node = createNodeWithHeight(-2);
        Method m = TreeList.AVLNode.class.getDeclaredMethod("balance");
        m.setAccessible(true);
        Object result = m.invoke(node);
        assertEquals(node.rotateRight(), result);
    }

    @Test
    void testBalanceCase2RightHeavy() throws Exception {
        TreeList.AVLNode<Integer> node = createNodeWithHeight(2);
        Method m = TreeList.AVLNode.class.getDeclaredMethod("balance");
        m.setAccessible(true);
        Object result = m.invoke(node);
        assertEquals(node.rotateLeft(), result);
    }

    @Test
    void testBalanceThrowsIllegalStateException() throws Exception {
        TreeList.AVLNode<Integer> node = createNodeWithHeight(3); // Invalid state
        Method m = TreeList.AVLNode.class.getDeclaredMethod("balance");
        m.setAccessible(true);
        assertThrows(IllegalStateException.class, () -> {
            try {
                m.invoke(node);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw e.getCause();
            }
        });
    }

    private TreeList.AVLNode<Integer> createNodeWithHeight(int height) throws Exception {
        // Create a node with a specific height by manipulating its fields
        TreeList.AVLNode<Integer> node = new TreeList.AVLNode<>(Arrays.asList(1, 2, 3));
        Field heightField = TreeList.AVLNode.class.getDeclaredField("height");
        heightField.setAccessible(true);
        heightField.set(node, height);
        return node;
    }
}