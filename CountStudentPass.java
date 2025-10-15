import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter number of students: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Size must be between 1 and 30");
            }
        } while (size > 30);
        int i = 0;
        int[] array = new int[size];
        while (i < array.length) {
            System.out.println("Enter mark for student: " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            System.out.println("List of student marks " + array[j]);
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("The number of student passing the exam is: " + count);
    }
}
