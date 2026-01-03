package practice4.ifElseSolver;

import java.util.Scanner;

public class FindMax {
    public static int getInteger(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
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
        System.out.println("--- Determine the Max ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number1 = getInteger(scanner, "Enter the first number: ");
            int number2 = getInteger(scanner, "Enter the second number: ");
            int max = Math.max(number1, number2);
            System.out.println("The max is: " + max);
        }
    }
}
