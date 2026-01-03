package practice4.breakAndContinueSolver;

import java.util.Scanner;

public class Stop {
    public static void main(String[] args) {
        System.out.println("--- Loop until 'stop' ---");
        try (Scanner scanner = new Scanner(System.in)) {
            while(true){
                System.out.print("Enter something ('stop' to exit): ");
                String input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("stop")) {
                    break;
                }
            }
            System.out.println("Program stopped. Bye!");
        }
    }
}
