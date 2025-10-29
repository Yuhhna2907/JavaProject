package PalindromeChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        boolean result = PalindromeChecker.isPalindrome(input);
        if (result) {
            System.out.println(" Chuỗi \"" + input + "\" là Palindrome.");
        } else {
            System.out.println(" Chuỗi \"" + input + "\" không phải là Palindrome.");
        }
    }
}
