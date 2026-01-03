package practice4.ifElseSolver;

import java.util.Scanner;

public class ScoreToGradeConverter {
    public enum Grade {
        EXCELLENT(90, "Excellent"),
        GOOD(75, "Good"),
        SATISFACTORY(60, "Satisfactory"),
        FAIL(0, "Fail");

        public final int minThreshold;
        public final String label;

        Grade(int minThreshold, String label) {
            this.minThreshold = minThreshold;
            this.label = label;
        }
        public String getLabel(){
            return this.label;
        }
        public static Grade fromScore(int score) {
            for (Grade grade : Grade.values()) {
                if (score >= grade.minThreshold) {
                    return grade;
                }
            }
            return FAIL;
        }
    }
    public static int getValidScore(Scanner scanner) {
        while(true) {
            System.out.print("Enter your score (0-100): ");
            String input = scanner.nextLine().trim();
            try {
                int score = Integer.parseInt(input);
                if (score >= 0 && score <= 100){
                    return score;
                } else {
                    System.out.println("Error: Score must be between 1 and 100");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a number");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("--- Check Your Grade ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int score = getValidScore(scanner);
            System.out.println("Result: " + Grade.fromScore(score).getLabel());
        }
    }
}
