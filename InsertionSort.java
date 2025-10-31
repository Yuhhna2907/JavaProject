public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];        // phần tử cần chèn
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key sang phải
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            // Chèn key vào vị trí đúng
            list[j + 1] = key;
        }
    }

    // Chương trình kiểm tra
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        System.out.print("Mảng ban đầu: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("Mảng sau khi sắp xếp: ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
