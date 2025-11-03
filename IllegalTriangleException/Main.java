package IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Nhập cạnh a: ");
            double a = input.nextDouble();

            System.out.print("Nhập cạnh b: ");
            double b = input.nextDouble();

            System.out.print("Nhập cạnh c: ");
            double c = input.nextDouble();
            TriangleChecker.checkTriangle(a, b, c);
            System.out.println("The three sides form a valid triangle!");
        } catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("“Input error: Please enter a valid number!”\n");
        } finally {
            System.out.println("Program finished");
        }
    }
}
