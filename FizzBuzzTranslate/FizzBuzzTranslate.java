package FizzBuzzTranslate;

public class FizzBuzzTranslate {
    public static String translate(int number) {
        if (number <= 0 || number >= 100) {
            return "Số không hợp lệ (chỉ nhận từ 1 đến 99)";
        }

        if (isFizzBuzz(number)) {
            return "FizzBuzz";
        }

        if (isFizz(number)) {
            return "Fizz";
        }

        if (isBuzz(number)) {
            return "Buzz";
        }

        return convertNumberToVietnamese(number);
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }

    private static boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }

    /**
     * Đọc số (1–99) ra tiếng Việt cơ bản
     */
    private static String convertNumberToVietnamese(int number) {
        String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

        if (number < 10) {
            return units[number];
        }

        int tens = number / 10;
        int ones = number % 10;
        StringBuilder result = new StringBuilder();

        if (tens == 1) {
            result.append("mười");
        } else {
            result.append(units[tens]).append(" mươi");
        }

        if (ones > 0) {
            result.append(" ").append(units[ones]);
        }

        return result.toString().trim();
    }
}
