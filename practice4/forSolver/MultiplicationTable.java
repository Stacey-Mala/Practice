package practice4.forSolver;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printTable(int number) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number*i);
        }
    }
    public static void main(String[] args){
        System.out.println("--- Multiplication Table ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = SumCalculator.getInteger(scanner);
            printTable(number);
        }
    }
}
