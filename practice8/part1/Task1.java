package practice8.part1;

public class Task1 {
    @FunctionalInterface
    interface MathOperation {
        double operate(double a, double b);
    }

    public static void main(String[] args) {
        MathOperation addition = (x, y) -> x + y;
        MathOperation subtraction = (x, y) -> x - y;
        MathOperation multiplication = (x, y) -> x * y;
        MathOperation deletion = (x, y) -> x / y;

        int a = 5;
        int b = 2;

        System.out.println(addition.operate(a, b));
        System.out.println(subtraction.operate(a, b));
        System.out.println(multiplication.operate(a, b));
        System.out.println(deletion.operate(a, b));
    }
}
