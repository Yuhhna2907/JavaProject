package DecimalToBinaryConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân: ");
        int decimal = scanner.nextInt();

        String binary = DecimalToBinaryConverter.convertToBinary(decimal);
        System.out.println("Số nhị phân tương ứng là: " + binary);
    }
}
