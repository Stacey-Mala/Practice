package practice4.doWhileSolver;

import java.util.Scanner;

public class PasswordChecker {
    public static final String SECRET_PASSWORD = "password";

    public static void main(String[] args){
        System.out.println("--- Password Checker ---");
        try (Scanner scanner = new Scanner(System.in)) {
            String input;
            do {
                System.out.print("Enter the password: ");
                input = scanner.nextLine().trim();
            } while (!SECRET_PASSWORD.equals(input));
            System.out.println("Access granted. Welcome!");
        }
    }
}
