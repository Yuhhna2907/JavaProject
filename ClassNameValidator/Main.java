package ClassNameValidator;

import static ClassNameValidator.ClassNameValidator.isValidClassName;

public class Main {
    public static void main(String[] args) {
        String[] valid = {"C0223G", "A0323K"};
        String[] invalid = {"M0318G", "P0323A", "C12K", "P@123H"};

        System.out.println("=== Kiểm tra tên lớp hợp lệ ===");
        for (String s : valid) {
            System.out.println(s + " -> " + isValidClassName(s));
        }

        System.out.println("\n=== Kiểm tra tên lớp không hợp lệ ===");
        for (String s : invalid) {
            System.out.println(s + " -> " + isValidClassName(s));
        }
    }
}

