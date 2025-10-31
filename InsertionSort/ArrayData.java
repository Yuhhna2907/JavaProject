package InsertionSort;

import java.util.Arrays;

public class ArrayData {
    private int[] arr;

    public ArrayData(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
