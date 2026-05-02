package practice7.exceptions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomUncheckedExceptionTask {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void validateEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidEmailException("Invalid email: " + email);
        }
        System.out.println("Email is valid");
    }
}
