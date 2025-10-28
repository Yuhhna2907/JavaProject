package WordCounter;

import java.util.Map;
import java.util.TreeMap;

public class WordCounter {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordMap = new TreeMap<>();

        if (text == null || text.isEmpty()) {
            return wordMap;
        }

        String[] words = text.split("[^a-zA-Z0-9À-ỹ]+");

        for (String word : words) {
            if (word.isEmpty()) continue;

            String normalized = word.toLowerCase();

            if (wordMap.containsKey(normalized)) {
                wordMap.put(normalized, wordMap.get(normalized) + 1);
            } else {
                wordMap.put(normalized, 1);
            }
        }
        return wordMap;
    }
    public static void printWordCount(Map<String, Integer> wordMap) {
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.printf("%-15s : %d%n", entry.getKey(), entry.getValue());
        }
    }
}
