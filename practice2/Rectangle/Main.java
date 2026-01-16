package practice2.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 6.0);
        Rectangle rectangle2 = new Rectangle(3.3, 3.0);

        rectangle1.calculateArea();
        rectangle2.calculateArea();

        // change the width of the second rectangle
        System.out.println("Update");
        rectangle2.setWidth(4.0);
        rectangle2.calculateArea();
    }
}
