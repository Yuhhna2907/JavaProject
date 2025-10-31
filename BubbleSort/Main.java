package BubbleSort;

import static BubbleSort.BubbleSort.bubbleSort;
import static BubbleSort.BubbleSort.list;

public class Main {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int j : list) System.out.print(j + " ");
    }
}
