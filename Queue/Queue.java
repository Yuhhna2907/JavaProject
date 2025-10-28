package Queue;

public class Queue {
    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enQueue(int value) {

        Node temp = new Node(value);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.link = temp;
        this.rear = temp;
    }

    public void deQueue() {

        if (this.front == null) {
            System.out.println("Hàng đợi rỗng, không thể xóa phần tử!");
            return;
        }

        Node temp = this.front;

        this.front = this.front.link;

        if (this.front == null) {
            this.rear = null;
        }

        System.out.println("Đã lấy ra phần tử: " + temp.data);
    }

    public void displayQueue() {
        if (this.front == null) {
            System.out.println("Hàng đợi rỗng!");
            return;
        }

        System.out.print("Trạng thái hàng đợi: ");
        Node temp = this.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.println();
    }
}
