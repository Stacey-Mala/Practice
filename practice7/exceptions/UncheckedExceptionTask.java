package practice7.exceptions;

import java.util.Scanner;

public class UncheckedExceptionTask {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Quotient: " + num1/num2);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
        }
    }
}
