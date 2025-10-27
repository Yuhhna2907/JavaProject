package MyLinkedList;

public class MyLinkedList {
    private Node head;
    private int numNodes;
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes ++;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }

    private static class Node {
        private Node next;
        private final Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
    public void add(int index,Object data) {
        Node temp = head;
        Node holder;
        for(int i=0;i<index-1&&temp.next!=null;i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes ++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        temp.next = head;
        numNodes ++;
    }

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
