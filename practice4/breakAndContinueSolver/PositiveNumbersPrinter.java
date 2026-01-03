package practice4.breakAndContinueSolver;

import practice4.doWhileSolver.DigitsFromNumberCounter;

import java.util.Scanner;

public class PositiveNumbersPrinter {
    public static void main(String[] args) {
        System.out.println("--- Positive Numbers Printer ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            int counter = 0;
            StringBuilder sb = new StringBuilder();
            do {
                number = IntegerChecker.getInteger(scanner);
                if (number <= 0) {
                    continue;
                }
                sb.append(number).append(" ");
                counter ++;
            } while (number != 0);
            if (counter > 0) {
                System.out.println("Positive numbers: " + sb.toString().trim());
            } else{
                System.out.println("There are no positive numbers provided");
            }
        }
    }
}
