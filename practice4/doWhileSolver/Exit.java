package practice4.doWhileSolver;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args){
        System.out.println("--- Loop until 'exit' ---");
        try(Scanner scanner = new Scanner(System.in)) {
            String input;
            do {
                System.out.print("Enter something ('exit' to quit): ");
                input = scanner.nextLine().trim();
            } while (!"exit".equalsIgnoreCase(input));
            System.out.println("Bye!");
        }
    }
}
