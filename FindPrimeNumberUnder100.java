public class FindPrimeNumberUnder100 {
    public static boolean checkPrime(int number) {
        return FindPrimeNumber.checkPrime(number);
    }

    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }
}


