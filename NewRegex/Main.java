package NewRegex;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String url = "http://dantri.com.vn/the-gioi.htm";
        try {
            System.out.println(" Đang tải trang: " + url);
            String html = HTMLReader.getHTML(url);
            List<News> newsList = NewsExtractor.extractNews(html);

            System.out.println("\n=== DANH SÁCH BẢN TIN ===");
            if (newsList.isEmpty()) {
                System.out.println(" Không tìm thấy bản tin nào!");
            } else {
                int i = 1;
                for (News n : newsList) {
                    System.out.println((i++) + ". " + n);
                }
            }

        } catch (Exception e) {
            System.err.println(" Lỗi: " + e.getMessage());
        }
    }
}
