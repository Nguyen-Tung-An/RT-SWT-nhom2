import org.apache.commons.collections4.list.TreeList;
import org.apache.commons.collections4.list.TreeList.AVLNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLNodeBalanceTest {
    private AVLNode<Integer> node;

    @BeforeEach
    void setUp() {
        // Create a balanced AVL tree node for testing
        node = new TreeList.AVLNode<>(null, null, null);
    }

    @Test
    void testBalanceWhenHeightIsZero() {
        // Test case where heightRightMinusLeft() returns 0
        node.setLeft(new TreeList.AVLNode<>(null, null, null));
        node.setRight(new TreeList.AVLNode<>(null, null, null));
        assertSame(node, node.balance());
    }

    @Test
    void testBalanceWhenHeightIsOne() {
        // Test case where heightRightMinusLeft() returns 1
        node.setLeft(new TreeList.AVLNode<>(null, null, null));
        node.setRight(new TreeList.AVLNode<>(new TreeList.AVLNode<>(null, null, null), null, null));
        assertSame(node, node.balance());
    }

    @Test
    void testBalanceWhenHeightIsMinusOne() {
        // Test case where heightRightMinusLeft() returns -1
        node.setLeft(new TreeList.AVLNode<>(new TreeList.AVLNode<>(null, null, null), null, null));
        node.setRight(new TreeList.AVLNode<>(null, null, null));
        assertSame(node, node.balance());
    }

    @Test
    void testBalanceWhenHeightIsMinusTwoAndLeftChildNeedsRotation() {
        // Test case where heightRightMinusLeft() returns -2 and left child needs rotation
        AVLNode<Integer> leftChild = new TreeList.AVLNode<>(new TreeList.AVLNode<>(null, null, null), null, null);
        node.setLeft(leftChild);
        node.setRight(new TreeList.AVLNode<>(null, null, null));
        assertNotSame(node, node.balance());
    }

    @Test
    void testBalanceWhenHeightIsTwoAndRightChildNeedsRotation() {
        // Test case where heightRightMinusLeft() returns 2 and right child needs rotation
        AVLNode<Integer> rightChild = new TreeList.AVLNode<>(null, new TreeList.AVLNode<>(null, null, null), null);
        node.setLeft(new TreeList.AVLNode<>(null, null, null));
        node.setRight(rightChild);
        assertNotSame(node, node.balance());
    }

    @Test
    void testBalanceThrowsExceptionForInconsistentTree() {
        // Test case where heightRightMinusLeft() returns an unexpected value
        assertThrows(IllegalStateException.class, () -> {
            // Simulate an inconsistent state
            node.setLeft(new TreeList.AVLNode<>(null, null, null));
            node.setRight(new TreeList.AVLNode<>(null, null, null));
            node.balance(); // This should throw an exception
        });
    }
}