import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "Hello Java Programming";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to count:");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("The character " + ch + " appears " + count + " times in the string");
    }
}
