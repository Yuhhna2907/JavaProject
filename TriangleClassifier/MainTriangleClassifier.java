package TriangleClassifier;

import java.util.Scanner;

public class MainTriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PHÂN LOẠI TAM GIÁC ===");

        System.out.print("Nhập cạnh a: ");
        int sideA = scanner.nextInt();

        System.out.print("Nhập cạnh b: ");
        int sideB = scanner.nextInt();

        System.out.print("Nhập cạnh c: ");
        int sideC = scanner.nextInt();

        String result = TriangleClassifier.classifyTriangle(sideA, sideB, sideC);

        System.out.println("→ Kết quả: " + result);
    }
}
