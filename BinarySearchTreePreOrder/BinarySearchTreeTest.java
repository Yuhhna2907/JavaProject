package BinarySearchTreePreOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    @Test
    public void testPreorderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(27);
        bst.insert(14);
        bst.insert(35);
        bst.insert(10);
        bst.insert(19);
        bst.insert(31);
        bst.insert(42);

        String preorder = bst.getPreorderString();
        assertEquals("27 14 10 19 35 31 42", preorder);
    }

}