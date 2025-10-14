import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = input.nextInt();
        System.out.println("Enter the second number");
        int n2 = input.nextInt();
        int temp;
        while(n2!=0){
            temp=n1%n2;
            n1=n2;
            n2=temp;
        }
        System.out.println("The greatest common divisor is: "+n1);
    }
}
