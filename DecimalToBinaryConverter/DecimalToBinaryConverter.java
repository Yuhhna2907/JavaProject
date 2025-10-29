package DecimalToBinaryConverter;

public class DecimalToBinaryConverter {
    public static String convertToBinary(int number) {
        if (number == 0) return "0";
        Stack<Integer> stack = new Stack<Integer>();
        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number = number / 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
