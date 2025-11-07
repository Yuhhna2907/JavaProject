package NewRegex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsExtractor {
    public static List<News> extractNews(String html) {
        List<News> newsList = new ArrayList<>();

        // Biểu thức chính quy để tìm link & tiêu đề
        String regex = "href=\"(https?://[^\"]+\\.htm)\"[^>]*>(.*?)</a>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            String link = matcher.group(1);
            String title = matcher.group(2).replaceAll("<.*?>", ""); // xóa thẻ HTML phụ
            if (!title.trim().isEmpty()) {
                newsList.add(new News(title, link));
            }
        }
        return newsList;
    }
}
