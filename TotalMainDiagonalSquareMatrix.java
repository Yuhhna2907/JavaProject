import java.util.Scanner;

public class TotalMainDiagonalSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix:");
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("\n Element[" + i + "][" + j + "] = ");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n The matrix is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sumMainDiagonalSquare = 0;
        for (int i = 0; i < array.length; i++) {
            sumMainDiagonalSquare += array[i][i];
        }
        System.out.println("The sum of the diagonal square matrix is: " + sumMainDiagonalSquare);
    }
}
