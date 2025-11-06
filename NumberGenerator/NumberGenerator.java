package NumberGenerator;

public class NumberGenerator implements Runnable {

    @Override
    public void run() {
        try{
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() +
                        " - Số: " + i +
                        " | HashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
