package BinarySearchTreePreOrder;

public class BinarySearchTree {
    private Node root;

    // ======= Thêm node vào BST =======
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

    // ======= Duyệt Preorder (Root - Left - Right) =======
    public void preorderTraversal() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if (root == null) return;
        System.out.print(root.value + " "); // Bước 1: Truy cập gốc
        preorderRec(root.left);             // Bước 2: Duyệt cây con trái
        preorderRec(root.right);            // Bước 3: Duyệt cây con phải
    }

    // ======= Trả về chuỗi Preorder (phục vụ test) =======
    public String getPreorderString() {
        StringBuilder sb = new StringBuilder();
        buildPreorderString(root, sb);
        return sb.toString().trim();
    }

    private void buildPreorderString(Node node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.value).append(" ");
        buildPreorderString(node.left, sb);
        buildPreorderString(node.right, sb);
    }
}
