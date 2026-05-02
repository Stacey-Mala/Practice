package practice7.exceptions;

import java.util.Scanner;

public class CustomCheckedExceptionTask {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        System.out.println("Age is valid");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());
            validateAge(age);
        } catch (IllegalArgumentException e){
            System.out.println("Invalid input");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
