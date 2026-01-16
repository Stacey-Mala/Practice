package practice4.switchSolver;

import java.util.Scanner;

public class DayOfWeekEvaluator {
    public enum DayOfWeek {
        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday"),
        SUNDAY("Sunday");

        public final String label;

        DayOfWeek(String label) {
            this.label = label;
        }

        public String getLabel() {
            return this.label;
        }

        public static DayOfWeek dayByNumber(int day) {
            return switch (day) {
                case 1 -> MONDAY;
                case 2 -> TUESDAY;
                case 3 -> WEDNESDAY;
                case 4 -> THURSDAY;
                case 5 -> FRIDAY;
                case 6 -> SATURDAY;
                case 7 -> SUNDAY;
                default -> throw new IllegalArgumentException("Unexpected day: " + day);
            };
        }
    }
    public static int getValidInteger(Scanner scanner) {
        while(true) {
            System.out.print("Enter a number (1-7): ");
            String input = scanner.nextLine().trim();
            try {
                int day = Integer.parseInt(input);
                if (day >=1 && day <= 7) {
                    return day;
                }
                System.out.println("Error: Number must be between 1 and 7");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a number");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Day by Number Evaluator ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int day = getValidInteger(scanner);
            System.out.println("Today is " + DayOfWeek.dayByNumber(day).getLabel());
        }
    }
}
