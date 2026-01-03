package practice4.doWhileSolver;

import practice4.breakAndContinueSolver.IntegerChecker;

import java.util.Scanner;

public class DigitsFromNumberCounter {
    public static void main(String[] args) {
        System.out.println("--- Digits From Numbers Counter ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = IntegerChecker.getInteger(scanner);
            int digits = number;
            int counter = 0;
            do {
                digits /= 10;
                counter++;
            } while (digits != 0);
            System.out.printf("There are %d digits in number %d%n", counter, number);
        }
    }
}
