package NumberThread;

public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int j = 0; j < 10; j += 2) {
            System.out.println("EvenThread running: " + j);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
