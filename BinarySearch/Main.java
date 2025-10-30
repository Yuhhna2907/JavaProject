package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));

        System.out.print("Nhập giá trị cần tìm: ");
        int value = sc.nextInt();

        int index = BinarySearch.binarySearch(arr, value);
        if (index != -1) {
            System.out.println(value + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println(value + " không có trong mảng.");
        }
    }
}
