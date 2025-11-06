package PrimeFactorization;

public class LazyPrimeFactorization implements Runnable {
    private boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println("Lazy Prime Factorization: " + number);
            }
            number++;
        }
    }
}
