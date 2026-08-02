package practice9;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет из " + Thread.currentThread().getName() + "!");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread t = new Thread(task);
        t.start();
        t.join();
    }
}
