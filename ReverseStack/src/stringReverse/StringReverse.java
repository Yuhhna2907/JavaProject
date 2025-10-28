package stringReverse;

import java.util.Stack;

public class StringReverse {

    public static String reverseWords(String input) {
        if (input == null) return null;

        String trimmed = input.trim();
        if (trimmed.isEmpty()) return "";

        Stack<String> wStack = new Stack<>();

        String[] words = trimmed.split("\\s+");
        for (String word : words) {
            wStack.push(word);
        }

        StringBuilder output = new StringBuilder();
        while (!wStack.isEmpty()) {
            String mWord = wStack.pop();
            output.append(mWord);
            if (!wStack.isEmpty()) {
                output.append(" ");
            }
        }
        return output.toString();
    }
}

