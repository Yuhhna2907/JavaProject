package RacingCar;

public class Main {
    public static void main(String[] args) {
        RacingCar carA=new RacingCar(" A");
        RacingCar carB=new RacingCar(" B");
        RacingCar carC=new RacingCar(" C");

        Thread t1=new Thread(carA);
        Thread t2=new Thread(carB);
        Thread t3=new Thread(carC);

        System.out.println("Distance:100KM");
        t1.start();
        t2.start();
        t3.start();
    }
}
