package practice8.part1;

public class Task2 {
    public static void main(String[] args) {
        Runnable greeting = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        greeting.run();
    }
}
