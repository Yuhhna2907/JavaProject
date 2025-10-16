public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }

    public static void main(String[] args) {
        final int Size = 100000;
        int[] arr = new int[Size];
        for (int i = 0; i < Size; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        StopWatch sw = new StopWatch();
        sw.start();
        for (int i = 0; i < Size; i++) {
            int minIndex = i;
            for (int j = i + 1; j < Size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        sw.stop();
        System.out.println("Elapsed time: " + sw.getElapsedTime() + " milliseconds");
    }
}
