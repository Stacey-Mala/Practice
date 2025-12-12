package Practice_2.Rectangle;

public class Rectangle {

    // fields
    private double width;
    private double height;

    // constructor with arguments
    public Rectangle(double someWidth, double someHight) {
        this.width = someWidth;
        this.height = someHight;
    }

    // getters for getWidth and getHeight fields
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }

    // setters to update width and height
    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public void calculateArea() {
        System.out.println("Площадь треугольника: " + getWidth() * getHeight() + " см2");
    }
}
