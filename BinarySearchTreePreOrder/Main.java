package BinarySearchTreePreOrder;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(27);
        bst.insert(14);
        bst.insert(35);
        bst.insert(10);
        bst.insert(19);
        bst.insert(31);
        bst.insert(42);

        System.out.println("Duyệt cây theo thứ tự Preorder (Root - Left - Right):");
        bst.preorderTraversal(); 
    }
}
