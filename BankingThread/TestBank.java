package BankingThread;

public class TestBank {
    public static void main(String[] args) {
        Account account = new Account("0965899414", 1_000_000);

        Thread t1 = new Thread(new WithDrawTask(account, 400_000), "Người 1");
        Thread t2 = new Thread(new WithDrawTask(account, 400_000), "Người 2");
        Thread t3 = new Thread(new WithDrawTask(account, 500_000), "Người 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Số dư cuối cùng: " + account.getBalance());
    }
}
