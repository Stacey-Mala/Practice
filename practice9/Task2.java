package practice9;

public class Task2 {
    public static void main(String[] args) throws InterruptedException{
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread t1 = new Thread(task, "A");
        Thread t2 = new Thread(task, "B");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
