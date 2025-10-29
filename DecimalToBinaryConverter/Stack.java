package DecimalToBinaryConverter;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private final ArrayList<T> list = new ArrayList<>();
    public void push(T item) {
        list.add(item);
    }
    public T pop() {
        if (list.isEmpty()) throw new EmptyStackException();
        return list.remove(list.size() - 1);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
}
