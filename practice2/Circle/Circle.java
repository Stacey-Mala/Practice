package practice2.Circle;

public class Circle {
    // field
    private double radius;
    // constructor w arg
    public Circle(double someRadius) {
        this.radius = someRadius;
    }
    // getter for a radius field
    public double getRadius() {
        return this.radius;
    }
    // setter to update the info about radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    // print out methods
    public void calculateArea() {
        System.out.println("The area of a circle with radius " + getRadius() + " cm is " +
                Math.PI * radius * radius + " cm2");
    }
    public void calculateCircumference() {
        System.out.println("The circumference of a circle with radius " + getRadius() + " cm is " +
                2 * Math.PI * radius + " cm2");
    }
}
