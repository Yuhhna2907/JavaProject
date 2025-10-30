package BinarySearchTreeAddSearch;

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

        System.out.println("Cây duyệt theo Preorder:");
        bst.preorder();

        System.out.println("\nKết quả tìm kiếm:");
        System.out.println("Tìm 19: " + bst.search(19));  // true
        System.out.println("Tìm 50: " + bst.search(50));  // false
    }
}
