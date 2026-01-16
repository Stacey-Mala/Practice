package practice2.Point;

public class Point {

    // fields
    private int x;
    private int y;

    // constructor w args
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters for x and y fields
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }

    // setters to update x and y
    public void setX(int newX) {
        this.x = newX;
    }

    // print coordinates/points
    public void print() {
        System.out.println("Points: [" + getX() + ":" + getY() + "]");
    }
}
