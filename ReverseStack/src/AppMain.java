public class AppMain {
    public static void main(String[] args) {

        System.out.println("=== Demo: Đảo ngược mảng số nguyên bằng Stack ===");

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Bước 0 - Mảng ban đầu: " + arrayReverse.ArrayReverse.arrayToString(arr));

        arrayReverse.ArrayReverse.reverse(arr);

        System.out.println("Kết quả - Mảng sau khi đảo: " + arrayReverse.ArrayReverse.arrayToString(arr));
        System.out.println();

        // -------- Demo 2: Đảo chuỗi theo từ --------
        System.out.println("=== Demo: Đảo ngược chuỗi (word-level) bằng Stack ===");

        String input = "Đảo ngược chuỗi sử dụng Stack theo từ";
        System.out.println("Bước 0 - Chuỗi ban đầu: \"" + input + "\"");
        String reversed = stringReverse.StringReverse.reverseWords(input);

        System.out.println("Kết quả - Chuỗi sau khi đảo: \"" + reversed + "\"");
    }
}
