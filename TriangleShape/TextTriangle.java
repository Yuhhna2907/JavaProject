package TriangleShape;

import java.util.Scanner;

public class TextTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 of Triangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter side 2 of Triangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter side 3 of Triangle: ");
        int side3 = input.nextInt();
        System.out.print("Enter the color of Triangle: ");
        String color = input.next();
        System.out.print("Is the triangle filled with color (true/false):");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(color,filled,side1,side2,side3);

        System.out.println("\nThông tin tam giác:");
        System.out.println(triangle.toString());
    }
}
