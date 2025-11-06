package BankingThread;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized void withdraw(double amount, String threadName) {
        System.out.println(threadName + " đang kiểm tra tài khoản...");
        if (balance >= amount) {
            System.out.println(threadName + " đang rút " + amount + " VND...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(threadName + " đã rút tiền thành công. Số dư còn lại " + balance + " VND");
        } else {
            System.out.println(threadName + " không đủ số dư để rút " + amount + " VND");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
