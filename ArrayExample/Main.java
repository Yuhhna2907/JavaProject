package ArrayExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the number of elements you want in your array: ");
        int x = input.nextInt();
        try{
            System.out.println("The elements in the array: "+ x+ " is:" +arr[x] );
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Output Exception");
        }
    }
}
