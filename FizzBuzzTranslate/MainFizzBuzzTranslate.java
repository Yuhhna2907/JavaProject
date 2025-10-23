package FizzBuzzTranslate;

import java.util.Scanner;

public class MainFizzBuzzTranslate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH FIZZBUZZ TRANSLATE ===");
        System.out.print("Nhập một số (1–99): ");

        int input = scanner.nextInt();
        String result = FizzBuzzTranslate.translate(input);

        System.out.println("→ Kết quả: " + result);

    }
}
