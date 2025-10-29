package PalindromeChecker;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Queue<T> {
    private final LinkedList<T> list = new LinkedList<>();
    public Queue() {}
    public void enqueue(T value) {
        list.addLast(value);
    }
    public T dequeue() {
        if (list.isEmpty()) throw new EmptyStackException();
        return list.removeFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
}
