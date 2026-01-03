package Practice_2.Car;

public class Car {
    // class fields
    private String brand;
    private int year;

    // constructor w args
    public Car(String someBrand, int someYear) {
        this.brand = someBrand;
        this.year = someYear;
    }

    // getters for getBrand and getYear fields
    public String getBrand() {
        return this.brand;
    }
    public int getYear() {
        return this.year;
    }
    // setters for setBrand and setYear fields
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }

    // print method
    public void print() {
        System.out.println("Марка машины: " + getBrand() + ", год выпуска: " + getYear());
    }
}
