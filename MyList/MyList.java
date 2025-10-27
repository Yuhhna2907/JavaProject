package MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size =0;
    private static final int DEFAULT_CAPACITY=10;
    private Object[] elements;
    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        int newCapacity=elements.length*2;
        elements= Arrays.copyOf(elements, newCapacity);
    }
    public void add(E e){
        ensureCapacity();
        elements[size++]=e;
    }
    public E get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("\"Index: \" + i + \", Size \" + i ");
        }
        return (E) elements[index];
    }
}
