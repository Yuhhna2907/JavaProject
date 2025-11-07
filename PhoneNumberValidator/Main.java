package PhoneNumberValidator;

public class Main {
    public static void main(String[] args) {
        String[] valid = {
                "(84)-(0978489648)"
        };

        String[] invalid = {
                "(a8)-(22222222)",   // có chữ
                "(84)-(22b22222)",   // có ký tự không phải số
                "(84)-(9978489648)", // không bắt đầu bằng 0
                "(84)0978489648",    // thiếu dấu -
                "84-(0978489648)"    // thiếu ngoặc ở đầu
        };

        System.out.println("=== Kiểm tra số điện thoại hợp lệ ===");
        for (String s : valid) {
            System.out.println(s + " -> " + PhoneNumberValidator.isValidPhoneNumber(s));
        }

        System.out.println("\n=== Kiểm tra số điện thoại không hợp lệ ===");
        for (String s : invalid) {
            System.out.println(s + " -> " + PhoneNumberValidator.isValidPhoneNumber(s));
        }
    }
}
