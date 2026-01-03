package practice4.whileSolver;

import java.util.Scanner;

public class ReversedCounter {
    public static void printReverse(int n) {
        StringBuilder sb = new StringBuilder();
        while (n >= 1) {
            sb.append(n).append(" ");
            n--;
        }
        System.out.println(sb.toString().trim());
    }
    public static int getValidInteger(Scanner scanner) {
        while(true){
            System.out.print("Enter a positive number: ");
            String input = scanner.nextLine().trim();
            try{
                int number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Invalid input. Number must be positive");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Reversed Counter ---");
        try(Scanner scanner = new Scanner(System.in)) {
            int number = getValidInteger(scanner);
            printReverse(number);
        }
    }
}
