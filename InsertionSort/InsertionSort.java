package InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public void sortWithSteps(ArrayData arrayData) {
        int[] arr = arrayData.getArr();
        int n = arr.length;

        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.println("Bước " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    // Hàm trả về mảng đã sắp xếp — dùng cho test
    public int[] sort(int[] arr) {
        int[] copy = arr.clone();
        for (int i = 1; i < copy.length; i++) {
            int key = copy[i];
            int j = i - 1;
            while (j >= 0 && copy[j] > key) {
                copy[j + 1] = copy[j];
                j--;
            }
            copy[j + 1] = key;
        }
        return copy;
    }
}
