package practice4.ifElseSolver;

import java.util.Scanner;

public class SignDeterminer {
    public static String determineSign(int number) {
        String result;
        if (number > 0) {
            result = "The number is positive";
        } else if (number < 0) {
            result = "The number is negative";
        } else {
            result = "The number is zero";
        }
        return result;
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
        System.out.println("--- Determiner of Number Sign ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = getInteger(scanner);
            System.out.println(determineSign(number));
        }
    }
}
