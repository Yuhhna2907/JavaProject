package RacingCar;

import java.util.Random;

public class RacingCar implements Runnable {
    private static final int DISTANCE = 100;
    private static final int STEP = 2;
    private final String carName;

    public RacingCar(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentTravel = (runDistance / DISTANCE) * 100;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel <= i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.carName + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.carName + "broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.carName + " Finish in " + (endTime - startTime) + "ms");
    }
}
