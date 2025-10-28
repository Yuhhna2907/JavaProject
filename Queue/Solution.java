package Queue;

public class Solution {
    public static void main(String[] args) {
        Queue q = new Queue();

        System.out.println("=== Bắt đầu mô phỏng Queue ===");

        // Thêm phần tử vào hàng đợi
        q.enQueue(14);
        q.displayQueue();

        q.enQueue(22);
        q.displayQueue();

        q.enQueue(6);
        q.displayQueue();

        // Lấy phần tử ra
        q.deQueue();
        q.displayQueue();

        q.deQueue();
        q.displayQueue();

        // Thêm phần tử khác
        q.enQueue(9);
        q.enQueue(20);
        q.displayQueue();

        q.deQueue();
        q.displayQueue();
    }
}
