package RunnableDemo;


public class RunnableDemo implements Runnable {
    private Thread t;
    private final String ThreadName;

    public RunnableDemo(String name) {
        ThreadName = name;
        System.out.print("Creating " + ThreadName + " Thread");
    }

    @Override
    public void run() {
        System.out.print("Running " + ThreadName + " Thread");
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println("Thread " + ThreadName + ": " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + ThreadName + " Interrupted");
        }
        System.out.println("Thread " + ThreadName + "Exiting");
    }

    public void start() {
        System.out.println("Starting " + ThreadName + " Thread");
        if (t == null) {
            t = new Thread(ThreadName);
            t.start();
        }
    }
}
