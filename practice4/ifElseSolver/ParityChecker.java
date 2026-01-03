package practice4.ifElseSolver;

import java.util.Scanner;

public class ParityChecker {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int getInteger(Scanner scanner) {
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim();
            try {
                int number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Parity Checker ---");
        try (Scanner scanner = new Scanner(System.in)){
            int number = getInteger(scanner);
            if (isEven(number)) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }
}
