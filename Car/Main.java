package Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2010);
        Car car2 = new Car("Mustang", 2022);

        car1.print();
        car2.print();

        // update the year of the first car
        System.out.println();
        System.out.println("Update");
        car1.setYear(2024);
        car1.print();
    }
}
