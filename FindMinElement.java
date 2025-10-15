import java.util.Scanner;

public class FindMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array:");
        int size = sc.nextInt();
        int [] array = new int[size];
        int index = 0;
        int min=0;
        while(index<array.length){
            System.out.print("Enter element " + (index + 1) + ": ");
            array[index]=sc.nextInt();
            index++;
        }
        for(int j=0;j<array.length;j++){
            if(array[j]<min){
                min=array[j];
            }
        }
        System.out.println("The minimum element is "+min);
    }
}
