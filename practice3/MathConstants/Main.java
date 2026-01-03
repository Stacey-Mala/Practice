package Practice_3.MathConstants;

public class Main {
    public static void main(String[] args) {
        double r1 = 2.2;
        double r2 = 3.3;

        System.out.println("The first radius: " + r1 + " cm");
        MathConstants.calculateCircleArea(r1);
        MathConstants.calculateCircumference(r1);

        System.out.println();
        System.out.println("The second radius: " + r2 + " cm");
        MathConstants.calculateCircleArea(r2);
        MathConstants.calculateCircumference(r2);
    }
}
