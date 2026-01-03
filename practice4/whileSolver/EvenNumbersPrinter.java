package practice4.whileSolver;

import java.util.Scanner;

public class EvenNumbersPrinter {
    public static void printEvenNumbers(int n) {
        StringBuilder sb = new StringBuilder();
        int i = 2;
        while (i <= n) {
            if (i % 2 == 0) {
                sb.append(i).append(" ");
            }
            i++;
        }
        System.out.println("Even numbers from one to " + n + ": " + sb.toString().trim());
    }
    public static int getValidInteger(Scanner scanner) {
        while(true){
            System.out.print("Enter a number (> 1): ");
            String input = scanner.nextLine().trim();
            try{
                int number = Integer.parseInt(input);
                if (number > 1) {
                    return number;
                } else {
                    System.out.println("Invalid input. Number must be greater than 1");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer");
            }
        }
    }
    public static void main(String[] args){
        System.out.println("--- Even Number Printer ---");
        try(Scanner scanner = new Scanner(System.in)){
            int number = getValidInteger(scanner);
            printEvenNumbers(number);
        }
    }
}
