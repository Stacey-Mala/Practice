package practice4.swichSolver;

import java.util.Scanner;

public class MoviePriceSystem {
    public static final int REGULAR_PRICE = 300;
    public static final int WEEKEND_PRICE = 450;

    public static int calculatePrice(int day) {
        return switch(day) {
            case 1, 2, 3, 4, 5 -> REGULAR_PRICE;
            case 6, 7 -> WEEKEND_PRICE;
            default -> throw new IllegalArgumentException ("Error: Unexpected day " + day);
        };
    }

    public static int getValidDay(Scanner scanner) {
        boolean isValid = false;
        int day = 0;
        do {
            System.out.print("Enter a day number (1-7): ");
            String input = scanner.nextLine().trim();
            try {
                day = Integer.parseInt(input);
                if (day >= 1 && day <= 7) {
                    isValid = true;
                } else {
                    System.out.println("Error: Number must be between 1 and 7");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number");
            }
        } while (!isValid);
        return day;
    }
    public static void main(String[] args) {
        System.out.println("--- Movie Price System ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int day = getValidDay(scanner);
            System.out.printf("The ticket costs %d RUB%n", calculatePrice(day));
        }
    }
}
