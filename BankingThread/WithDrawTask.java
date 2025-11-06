package BankingThread;

public class WithDrawTask implements Runnable {
    private Account account;
    private double amount;

    public WithDrawTask(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        account.withdraw(amount, threadName);
    }
}
