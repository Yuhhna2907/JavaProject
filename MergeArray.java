import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        int size2;
        int[] array2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1:");
        size1 = sc.nextInt();
        int i1 = 0, i2 = 0;
        array1 = new int[size1];
        while (i1 < size1) {
            System.out.print("Enter element " + (i1 + 1) + ": ");
            array1[i1] = sc.nextInt();
            i1++;
        }
        System.out.println("Enter the size of array 2:");
        size2 = sc.nextInt();
        array2 = new int[size2];
        while (i2 < size2) {
            System.out.print("Enter element " + (i2 + 1) + ": ");
            array2[i2] = sc.nextInt();
            i2++;
        }
        int[] array3 = new int[array1.length + array2.length];
        for (int j = 0; j < array1.length; j++) {
            array3[j] = array1[j];
        }
        for (int k = 0; k < array2.length; k++) {
            array3[array1.length + k] = array2[k];
        }
        System.out.println("The merged array is:" + Arrays.toString(array3));
    }
}
