package practice9;

public class Task3 {
    private static final int TIMER = 2000;
    private static volatile boolean stop = false;
    private static long count = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            while(!stop) {
                count++;
            }
        };
        Thread counter = new Thread(task);
        counter.start();
        Thread.sleep(TIMER);
        stop = true;
        counter.join();
        System.out.println("Result: " + count);
    }
}
