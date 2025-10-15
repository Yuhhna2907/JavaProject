import java.util.Scanner;

public class TotalColumnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns:");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];
        System.out.println("Enter elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println("\n Enter the columns index to sum(0 to" + (columns - 1) + ":");
        int columnIndex = sc.nextInt();
        if (columnIndex < 0 || columnIndex > columns - 1) {
            System.out.println("Invalid column index");
        } else {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + array[i][columnIndex];
            }
            System.out.println("The sum of the columns" + columnIndex + " is: " + sum);
        }
    }
}
