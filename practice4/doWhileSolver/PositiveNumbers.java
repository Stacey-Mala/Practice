package practice4.doWhileSolver;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args){
        System.out.println("--- Loop until positive ---");
        try (Scanner scanner = new Scanner(System.in)){
            int number = 0;
            do {
                System.out.print("Enter a number: ");
                String input = scanner.nextLine().trim();
                try {
                    number = Integer.parseInt(input);
                } catch (NumberFormatException e){
                    System.out.println("Invalid input. Please enter a number");
                }
            } while (number <= 0);
            System.out.println(number);
        }
    }
}
