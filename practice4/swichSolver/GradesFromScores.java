package practice4.swichSolver;

import java.util.Scanner;

public class GradesFromScores {
    public enum Grade {
        A(9), B(8), C(7), D(6), F(0);

        public final int minThreshold;

        Grade(int minThreshold) {
            this.minThreshold = minThreshold;
        }
        public static Grade fromScore(int score) {
            return switch(score / 10) {
                case 10, 9 -> A;
                case 8 -> B;
                case 7 -> C;
                case 6 -> D;
                default -> F;
            };
        }
    }

    public static int getValidScore(Scanner scanner) {
        while(true) {
            System.out.print("Enter your score (0-100): ");
            String input = scanner.nextLine().trim();
            try {
                int score = Integer.parseInt(input);
                if (score >= 0 && score <= 100) {
                    return score;
                } else {
                    System.out.println("Error: Score must be between 0 and 100");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid integer");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Check your Grade ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int score = getValidScore(scanner);
            Grade yourGrade = Grade.fromScore(score);
            System.out.println("Your grade is " + yourGrade.name());
        }
    }
}
