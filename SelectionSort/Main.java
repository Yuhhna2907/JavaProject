package SelectionSort;

import static SelectionSort.SelectionSort.list;
import static SelectionSort.SelectionSort.selectionSort;

public class Main {
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
