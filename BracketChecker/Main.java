package BracketChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập biểu thức cần kiểm tra: ");
        String expr = scanner.nextLine();

        boolean result = BracketChecker.isValidExpression(expr);
        if (result) {
            System.out.println(" Biểu thức hợp lệ (dấu ngoặc khớp đúng).");
        } else {
            System.out.println(" Biểu thức KHÔNG hợp lệ (dấu ngoặc sai hoặc thiếu).");
        }
    }
}
