package BinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(27);
        bst.insert(14);
        bst.insert(35);
        bst.insert(10);
        bst.insert(19);
        bst.insert(31);
        bst.insert(42);

        String expected = "10 19 14 31 42 35 27";
        assertEquals(expected, bst.getPostOrderString());
    }
}