import java.util.Scanner;

public class MoneyInterest {
    public static void main(String[] args) {
        double money=1.0;
        int month=1;
        double interestRate=0.1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money=input.nextDouble();
        System.out.println("Enter number of months: ");
        month=input.nextInt();
        System.out.println("Enter investment rate in percentage: ");
        interestRate=input.nextDouble();
        double interestMoney=0;
        for(int j=1;j<=month;j++){
            interestMoney=money*(interestRate/100)/12*month;
        }
        System.out.println("The interest money is: "+interestMoney);
    }
}
