package BinarySearchTreeAddSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    @Test
    public void testSearch() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(27);
        bst.insert(14);
        bst.insert(35);
        bst.insert(10);
        bst.insert(19);
        bst.insert(31);
        bst.insert(42);

        assertTrue(bst.search(19));
        assertTrue(bst.search(42));
        assertFalse(bst.search(100));
    }

}