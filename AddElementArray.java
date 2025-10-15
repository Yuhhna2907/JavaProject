import java.util.Arrays;
import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        int[] array = {4, 11, 36, 7, 19, 5, 23, 8, 16, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to add to the array:");
        int n = sc.nextInt();
        System.out.println("Enter the index of the element you want to add to the array:");
        int index = sc.nextInt();
        if (index <= -1 || index >= array.length-1) {
            System.out.println("The index is out of bounds.");
        }else {
            int[]newArray = new int[array.length+1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = n;
            for(int i =index; i<array.length; i++){
                newArray[i+1] = array[i];
            }
            System.out.println("The element " + n +" was added at index " + index +".");
            System.out.println("The array after addition is:" + Arrays.toString(newArray));
        }
    }
}
