import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        final int rate=23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter currency value (USD): ");
        int usd=scanner.nextInt();
        int vnd=usd*rate;
        System.out.println("The Current Value is: " + vnd +" VND");
    }
}
