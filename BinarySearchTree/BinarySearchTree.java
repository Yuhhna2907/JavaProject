package BinarySearchTree;

public class BinarySearchTree {
    private Node root;

    // Thêm node mới
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Duyệt hậu tự
    public void postOrder() {
        postOrderRec(root);
    }

    private void postOrderRec(Node node) {
        if (node == null) return;
        postOrderRec(node.left);
        postOrderRec(node.right);
        System.out.print(node.value + " ");
    }

    public String getPostOrderString() {
        StringBuilder sb = new StringBuilder();
        buildPostOrderString(root, sb);
        return sb.toString().trim();
    }

    private void buildPostOrderString(Node node, StringBuilder sb) {
        if (node == null) return;
        buildPostOrderString(node.left, sb);
        buildPostOrderString(node.right, sb);
        sb.append(node.value).append(" ");
    }
}
