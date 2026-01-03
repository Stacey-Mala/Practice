package practice4.breakAndContinueSolver;

import java.util.Scanner;

public class IntegerChecker {
    public static int getInteger(Scanner scanner) {
        while(true){
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim();
            try{
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter an integer");
            }
        }
    }
}
