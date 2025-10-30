package BinarySearchTreeAddDelete;

public class BinarySearchTree {
    private Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.value) root.left = insertRec(root.left, value);
        else if (value > root.value) root.right = insertRec(root.right, value);
        return root;
    }

    // ======= Xóa node =======
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    private Node deleteRec(Node root, int value) {
        if (root == null) return null;

        // Tìm nút cần xóa
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {
            //  Trường hợp 1: Nút không có con
            if (root.left == null && root.right == null)
                return null;

                // Trường hợp 2: Chỉ có một con
            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            //  Trường hợp 3: Có cả hai con
            root.value = minValue(root.right);  // tìm giá trị nhỏ nhất bên phải
            root.right = deleteRec(root.right, root.value); // xóa nút thay thế
        }
        return root;
    }

    private int minValue(Node node) {
        int min = node.value;
        while (node.left != null) {
            node = node.left;
            min = node.value;
        }
        return min;
    }

    // ======= Duyệt inorder (để kiểm tra sau khi xóa) =======
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root == null) return;
        inorderRec(root.left);
        System.out.print(root.value + " ");
        inorderRec(root.right);
    }

    // Dùng cho test
    public String getInorderString() {
        StringBuilder sb = new StringBuilder();
        buildInorderString(root, sb);
        return sb.toString().trim();
    }

    private void buildInorderString(Node node, StringBuilder sb) {
        if (node == null) return;
        buildInorderString(node.left, sb);
        sb.append(node.value).append(" ");
        buildInorderString(node.right, sb);
    }

}
