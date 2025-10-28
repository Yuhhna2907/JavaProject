package arrayReverse;

import java.util.Arrays;
import java.util.Stack;

public class ArrayReverse {

    public static void reverse(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        Stack<Integer> stack = new Stack<>();

        for (int value : arr) {
            stack.push(value);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

    }

    public static String arrayToString(int[] arr) {
        return Arrays.toString(arr);
    }
}

