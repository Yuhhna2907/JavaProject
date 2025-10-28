package WordCounter;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordCounterTest {

    @Test
    void testCountWordsBasic() {
        String text = "Java is fun. Java is powerful!";
        Map<String, Integer> result = WordCounter.countWords(text);

        assertEquals(2, result.get("java"));
        assertEquals(2, result.get("is"));
        assertEquals(1, result.get("fun"));
        assertEquals(1, result.get("powerful"));
    }

    @Test
    void testEmptyString() {
        Map<String, Integer> result = WordCounter.countWords("");
        assertTrue(result.isEmpty());
    }

    @Test
    void testCaseInsensitive() {
        String text = "Hello hello HELLO";
        Map<String, Integer> result = WordCounter.countWords(text);
        assertEquals(3, result.get("hello"));
    }

    @Test
    void testVietnameseCharacters() {
        String text = "Đây là ví dụ về đếm từ Đếm từ";
        Map<String, Integer> result = WordCounter.countWords(text);
        assertEquals(2, result.get("đếm"));
    }
}