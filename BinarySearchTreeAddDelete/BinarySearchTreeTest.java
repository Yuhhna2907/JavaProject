package BinarySearchTreeAddDelete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    public void testDeleteLeafNode() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        bst.delete(20); // xóa nút lá
        assertEquals("30 40 50 70", bst.getInorderString());
    }

    @Test
    public void testDeleteNodeWithOneChild() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(40);
        bst.insert(70);

        bst.delete(30); // 30 có 1 con là 40
        assertEquals("40 50 70", bst.getInorderString());
    }

    @Test
    public void testDeleteNodeWithTwoChildren() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.delete(50); // nút gốc có 2 con
        assertEquals("20 30 40 60 70 80", bst.getInorderString());
    }

}