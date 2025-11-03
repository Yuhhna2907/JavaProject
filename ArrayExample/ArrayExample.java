package ArrayExample;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rand = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Random Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
