package Counting;

public class Main {
    public static void main(String[] args) {
       Count count = new Count();
       try{
        while(count.getThread().isAlive()){
            System.out.println("Main thread will be alive");
            Thread.sleep(1500);
        }
       } catch (InterruptedException e) {
           System.out.println("Main thread was interrupted");
       }
        System.out.println("Main thread finished");
    }
}
