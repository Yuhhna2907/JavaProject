package Counting;

public class Count implements Runnable {
    private final Thread t;

    public Count() {
        t = new Thread(this, "My runnable thread");
        System.out.println("My thread created" + t);
        t.start();
    }

    public Thread getThread() {
        return t;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
        System.out.println("My thread finished");
    }
}
