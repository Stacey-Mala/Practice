package practice4.breakAndContinueSolver;

import practice4.doWhileSolver.DigitsFromNumberCounter;

import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args){
        System.out.println("--- Calculate Sum Until Negative Number ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            while (true) {
                int number = IntegerChecker.getInteger(scanner);
                if (number < 0) {
                    break;
                }
                sum += number;
            }
            System.out.println("Sum: " + sum);
        }
    }
}
