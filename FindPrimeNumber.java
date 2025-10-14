import java.util.Scanner;

public class FindPrimeNumber {
    public static boolean checkPrime(int number){
    if(number<2){
        return false;
    }
    for(int i=2;i<=Math.sqrt(number);i++){
        if(number%i==0){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of prime numbers:");
        int n = sc.nextInt();
        int count = 0;
        int num=2;

        while(count<n){
           if(checkPrime(num)){
               System.out.println(num+"");
               count++;
           }
        num++;
        }
    }

}
