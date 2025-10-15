import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] array = {12, 7, 9, 20, 5, 15, 36, 18, 25, 10};
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements you want to delete:");
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                found = true;
                index = i;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        if (!found) {
            System.out.println(n + " is not in the array");
        } else {
            System.out.println("The element" + n + " was deleted at index " + index + " .");
            System.out.println("The array after deletion is:" + Arrays.toString(array));
        }
    }
}
