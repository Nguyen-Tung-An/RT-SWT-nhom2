import org.apache.commons.collections4.list.TreeList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeListAVLNodeBalanceTest {

    private TreeList<Integer> treeList;
    private TreeList.AVLNode<Integer> avlNode;

    @BeforeEach
    void setUp() {
        treeList = new TreeList<>();
        avlNode = treeList.new AVLNode<>(10); // Create a new AVLNode with a value
    }

    @Test
    void testBalanceWhenNodeIsBalanced() {
        avlNode.left = treeList.new AVLNode<>(5);
        avlNode.right = treeList.new AVLNode<>(15);
        int balanceFactor = avlNode.balance();
        assertEquals(0, balanceFactor); // Balanced case
    }

    @Test
    void testBalanceWhenNodeIsLeftHeavy() {
        avlNode.left = treeList.new AVLNode<>(5);
        avlNode.left.left = treeList.new AVLNode<>(3);
        int balanceFactor = avlNode.balance();
        assertEquals(2, balanceFactor); // Left heavy case
    }

    @Test
    void testBalanceWhenNodeIsRightHeavy() {
        avlNode.right = treeList.new AVLNode<>(15);
        avlNode.right.right = treeList.new AVLNode<>(20);
        int balanceFactor = avlNode.balance();
        assertEquals(-2, balanceFactor); // Right heavy case
    }

    @Test
    void testBalanceWhenNodeHasOnlyLeftChild() {
        avlNode.left = treeList.new AVLNode<>(5);
        int balanceFactor = avlNode.balance();
        assertEquals(1, balanceFactor); // Only left child
    }

    @Test
    void testBalanceWhenNodeHasOnlyRightChild() {
        avlNode.right = treeList.new AVLNode<>(15);
        int balanceFactor = avlNode.balance();
        assertEquals(-1, balanceFactor); // Only right child
    }
}