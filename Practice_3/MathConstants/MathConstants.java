package Practice_3.MathConstants;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    public static void calculateCircleArea(double r) {
        System.out.println("The circle area: " + (PI * r * r) + " cm2");
    }
    public static void calculateCircumference(double r) {
        System.out.println("The circle circumference: " + (2 * PI * r) + " cm");
    }
}
