package practice4.switchSolver;

import java.util.Scanner;

public class SimpleCalculator {
    public enum Operator {
        ADD("+"), SUB("-"), MUL("*"), DIV("/");

        public final String symbol;

        Operator(String symbol) {
            this.symbol = symbol;
        }
        public String getSymbol(){
            return this.symbol;
        }

        public static Operator fromInput (String input) {
            return switch(input) {
                case "+" -> ADD;
                case "-" -> SUB;
                case "*" -> MUL;
                case "/" -> DIV;
                default -> throw new IllegalArgumentException ("Invalid operator: " + input);
            };
        }
    }

    public static double calculate(int a, int b, Operator operator) {
        return switch(operator) {
            case ADD -> a + b;
            case SUB -> a - b;
            case MUL -> a * b;
            case DIV -> {
                if (b == 0) {
                    throw new ArithmeticException ("You cannot divide by zero");
                }
                yield (double) a / b;
            }
        };
    }

    public static Operator getOperator(Scanner scanner) {
        while(true) {
            System.out.print("Choose an operator (+, -, *, /): ");
            String input = scanner.nextLine().trim();
            try {
                return Operator.fromInput(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Invalid operator. Use only +, -, *, /");
            }
        }
    }

    public static int getInteger(Scanner scanner, String prompt) {
        while(true){
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Simple Calculator ---");
        try (Scanner scanner = new Scanner(System.in)) {
            int number1 = getInteger(scanner, "Enter first number: ");
            int number2 = getInteger(scanner, "Enter second number: ");

            Operator operator = getOperator(scanner);

            double result = calculate(number1, number2, operator);

            System.out.printf("%d %s %d = %.2f%n", number1, operator.getSymbol(), number2, result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
