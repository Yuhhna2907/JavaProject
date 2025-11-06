package NumberGenerator;

public class Main {
    public static void main(String[] args) {
      NumberGenerator generator1 = new NumberGenerator();
      NumberGenerator generator2 = new NumberGenerator();

      Thread t1 = new Thread(generator1,"Thread-1");
      Thread t2 = new Thread(generator2,"Thread-2");

      t1.setPriority(Thread.MIN_PRIORITY);
      t2.setPriority(Thread.MAX_PRIORITY);

      t1.start();
      t2.start();
    }
}
