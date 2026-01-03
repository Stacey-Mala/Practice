package practice4.forSolver;

import java.util.Scanner;

public class SumCalculator {
    public static long calculateSum(int n) {
        int sum = 0;
        n = Math.abs(n);
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static int getInteger(Scanner scanner) {
        while(true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine().trim();
            try{
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter an integer");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Sum Calculator ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = getInteger(scanner);
            long sum = calculateSum(number);
            System.out.println("Sum: " + sum);
        }
    }
}
