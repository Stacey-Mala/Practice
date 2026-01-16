package practice2.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(3.5);

        circle1.calculateArea();
        circle1.calculateCircumference();
        circle2.calculateArea();
        circle2.calculateCircumference();

        System.out.println();
        System.out.println("Updated");
        circle1.setRadius(2.5);
        circle2.setRadius(2.5);

        circle1.calculateArea();
        circle1.calculateCircumference();
        circle2.calculateArea();
        circle2.calculateCircumference();
    }
}
