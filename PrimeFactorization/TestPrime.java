package PrimeFactorization;

public class TestPrime {
    public static void main(String[] args) {
        Thread lazyThread = new Thread(new LazyPrimeFactorization());
        Thread optimizedThread = new Thread(new OptimizedPrimeFactorization());

        lazyThread.setName("Lazy-Thread");
        optimizedThread.setName("Optimized-Thread");

        lazyThread.setPriority(Thread.MIN_PRIORITY);
        optimizedThread.setPriority(Thread.MAX_PRIORITY);

        lazyThread.start();
        optimizedThread.start();

        try {

            Thread.sleep(3000);
            lazyThread.interrupt();
            optimizedThread.interrupt();


            lazyThread.join();
            optimizedThread.join();

            System.out.println("Chương trình kết thúc!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


