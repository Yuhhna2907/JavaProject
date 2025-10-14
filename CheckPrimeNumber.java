import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        if (n < 2) {
            System.out.println(n +" is not a prime number");
        }
        else {
            int i=2;
            boolean check=true;
            while(i<=Math.sqrt(n)){
                if(n%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println("The number "+n+" is a prime number");
            }else {
                System.out.println("The number "+n+" is not a prime number");
            }
        }
    }
}
