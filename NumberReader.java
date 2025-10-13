import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number=scanner.nextInt();
        String result="";
        if (number>=0&&number<1000) {
            int hundred=number/100;
            int ten=(number/10)%10;
            int one=number%10;
            if(number==0){
                System.out.println("The number in English is zero" );
            }
            switch (hundred) {
                case 1:result+="One Hundred";break;
                case 2:result+="Two Hundred";break;
                case 3:result+="Three Hundred";break;
                case 4:result+="Four Hundred";break;
                case 5:result+="Five Hundred";break;
                case 6:result+="Six Hundred";break;
                case 7:result+="Seven Hundred";break;
                case 8:result+="Eight Hundred";break;
                case 9:result+="Nine Hundred";break;
            }
            if(hundred>0&&(ten>0||one>0)){
                result+=" and ";
            }
            if (ten==1){
                switch (one){
                    case 0:result+="Ten";break;
                    case 1:result+="Eleven";break;
                    case 2:result+="Twelve";break;
                    case 3:result+="Thirteen";break;
                    case 4:result+="Fourteen";break;
                    case 5:result+="Fifteen";break;
                    case 6:result+="Sixteen";break;
                    case 7:result+="Seventeen";break;
                    case 8:result+="Eighteen";break;
                    case 9:result+="Nineteen";break;
                }
            }else {
                switch(ten){
                    case 2:result+="Twenty";break;
                    case 3:result+="Thirty";break;
                    case 4:result+="Forty";break;
                    case 5:result+="Fifty";break;
                    case 6:result+="Sixty";break;
                    case 7:result+="Seventy";break;
                    case 8:result+="Eighty";break;
                    case 9:result+="Ninety";break;
                }
            }
            if(ten>2&&one>0){
                result+="-";
            }
            if(ten!=1){
                switch (one){
                    case 1:result+="One";break;
                    case 2:result+="Two";break;
                    case 3:result+="Three";break;
                    case 4:result+="Four";break;
                    case 5:result+="Five";break;
                    case 6:result+="Six";break;
                    case 7:result+="Seven";break;
                    case 8:result+="Eight";break;
                    case 9:result+="Nine";break;
                }
            }
        }
        System.out.println("The number in English is: " + result);
    }
}
