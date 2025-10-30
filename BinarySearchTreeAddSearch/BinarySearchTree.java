package BinarySearchTreeAddSearch;

public class BinarySearchTree {
    private Node root;

    // ===== Thêm phần tử vào cây =====
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }

    // ===== Tìm kiếm phần tử trong BST =====
    public boolean search(int value) {
        Node current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return true; // Tìm thấy
            }
        }
        return false; // Không tìm thấy
    }

    // ===== In cây theo Preorder (để test dễ nhìn) =====
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorderRec(node.left);
        preorderRec(node.right);
    }
}
