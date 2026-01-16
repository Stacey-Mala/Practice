package practice2.Point;

public class Main {
    public static void main(String[] args) {
        Point points1 = new Point(2, 7);
        Point points2 = new Point(-10, 0);

        points1.print();
        points2.print();

        System.out.println();
        System.out.println("Update!");

        points1.setX(5);
        points2.setX(6);
        points1.print();
        points2.print();
    }
}
