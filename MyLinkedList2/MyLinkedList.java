package MyLinkedList2;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.setNext(head);
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (index == 0) {
            addFirst(element);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
        }

        Node newNode = new Node(element);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        numNodes++;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node temp = head;
        Object removedData;

        if (index == 0) {
            removedData = head.getData();
            head = head.getNext();
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            removedData = temp.getNext().getData();
            temp.setNext(temp.getNext().getNext());
        }

        numNodes--;
        return (E) removedData;
    }

    public boolean remove(Object e) {
        Node temp = head;

        if (head == null) return false;

        if (head.getData().equals(e)) {
            head = head.getNext();
            numNodes--;
            return true;
        }

        while (temp.getNext() != null) {
            if (temp.getNext().getData().equals(e)) {
                temp.setNext(temp.getNext().getNext());
                numNodes--;
                return true;
            }
            temp = temp.getNext();
        }

        return false;
    }

    public int size() {
        return numNodes;
    }

    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }

        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.getNext();
        }

        return (E) temp.getData();
    }

    public E getFirst() {
        if (head == null) return null;
        return (E) head.getData();
    }

    public E getLast() {
        if (head == null) return null;

        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(o)) {
                return i;
            }
            temp = temp.getNext();
        }
        return -1;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> newList = new MyLinkedList<>();
        Node temp = head;
        while (temp != null) {
            newList.addLast((E) temp.getData());
            temp = temp.getNext();
        }
        return newList;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}