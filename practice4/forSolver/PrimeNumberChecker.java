package practice4.forSolver;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for(int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("--- Prime Number Checker ---");
        try(Scanner scanner = new Scanner(System.in)) {
            int number = SumCalculator.getInteger(scanner);
            System.out.println(
                    (isPrime(number)) ? number + " is prime": number + " is not prime"
            );
        }
    }
}
