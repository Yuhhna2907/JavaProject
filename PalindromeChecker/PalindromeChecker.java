package PalindromeChecker;

import java.util.Stack;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        if (input == null || input.isEmpty())
            return false;
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new Queue<Character>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
            queue.enqueue(c);
        }
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.dequeue())) {
                return false;
            }
        }
        return true;
    }
}

