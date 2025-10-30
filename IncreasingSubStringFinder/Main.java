package IncreasingSubStringFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String result = IncreasingSubstringFinder.findLongestIncreasingSubstring(input);
        System.out.println(result);
    }
}
