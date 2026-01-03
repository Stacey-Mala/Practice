package practice4.ifElseSolver;

import java.util.Scanner;

public class GradeChecker {
    public enum Grade {
        EXCELLENT("Excellent"),
        GOOD("Good"),
        SATISFACTORY("Satisfactory"),
        FAIL("Fail");

        private final String label;

        Grade(String label) {
            this.label = label;
        }

        public static String readScore(int score) {
            return switch(score) {
                case 5 -> EXCELLENT.label;
                case 4 -> GOOD.label;
                case 3 -> SATISFACTORY.label;
                case 2, 1 -> FAIL.label;
                default -> "Invalid input. Score must be between 1 and 5";
            };
        }
    }

    public static int getValidInteger(Scanner scanner) {
        while (true) {
            System.out.print("Enter a score (1-5): ");
            String input = scanner.nextLine().trim();
            try {
                int score = Integer.parseInt(input);
                if (score >= 1 && score <= 5) {
                    return score;
                } else {
                    System.out.println("Invalid input. Score must be between 1 and 5");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Grade from Score ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int score = getValidInteger(scanner);
            System.out.println(Grade.readScore(score));
        }
    }
}
