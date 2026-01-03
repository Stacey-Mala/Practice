package practice4.whileSolver;

import java.util.Scanner;

public class FactorialCalculator {
    public static long calculateFactorial(int n) {
        int i = 1;
        int result = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }
    public static int getValidInteger(Scanner scanner) {
        while(true){
            System.out.print("Enter a number (>= 0): ");
            String input = scanner.nextLine().trim();
            try{
                int number = Integer.parseInt(input);
                if (number >= 0) {
                    return number;
                } else {
                    System.out.println("Invalid input. Number must be non-negative");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Factorial Calculator ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = getValidInteger(scanner);
            long factorial = calculateFactorial(number);
            System.out.printf("The factorial of %d is %d%n", number, factorial);
        }
    }
}
