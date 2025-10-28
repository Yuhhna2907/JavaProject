package WordCounter;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Đếm số lần xuất hiện của các từ trong văn bản ===");

        String inputText = """
                Học Java là điều thú vị. 
                Java rất mạnh mẽ và phổ biến. 
                Lập trình Java giúp bạn hiểu rõ hơn về cấu trúc dữ liệu và thuật toán.
                """;

        // Gọi hàm đếm
        Map<String, Integer> result = WordCounter.countWords(inputText);

        // In kết quả
        System.out.println("\nKết quả đếm từ:");
        WordCounter.printWordCount(result);
    }
}

