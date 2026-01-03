package practice4.ifElseSolver;

import java.util.Scanner;

public class DiscountPlan {
    public static int calculateDiscount(int age) {
        int discount;
        if (age < 18) {
            discount = 25;
        } else if (age >= 65) {
            discount = 30;
        } else {
            discount = 0;
        }
        return discount;
    }

    public static int getValidAge(Scanner scanner) {
        while(true){
            System.out.print("Enter your age: ");
            String input = scanner.nextLine().trim();
            try {
                int age = Integer.parseInt(input);
                if (age >= 0 && age <= 110) {
                    return age;
                } else {
                    System.out.println("Error: Age must be between 0 and 110");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a number");
            }
        }
    }

    public static void printResult(int discount) {
        if (discount > 0) {
            System.out.printf("Your discount is %d%%%n", discount);
        } else {
            System.out.println("You don't have a discount");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Discount Plan ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int age = getValidAge(scanner);
            int discount = calculateDiscount(age);
            printResult(discount);
        }
    }
}
