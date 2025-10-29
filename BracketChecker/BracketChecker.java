package BracketChecker;

public class BracketChecker {
    public static boolean isValidExpression(String expr) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : expr.toCharArray()) {
            // 1. Gặp dấu mở -> đưa vào stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // 2. Gặp dấu đóng -> kiểm tra khớp
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false; // thiếu dấu mở

                char open = stack.pop();
                if (!isMatchingPair(open, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}

