package practice2.Laptop;

public class Laptop {
    // fields
    private String brand;
    private double price;

    // constructor w args
    public Laptop(String someBrand,double somePrice) {
        this.brand = someBrand;
        this.price = somePrice;
    }
    // getters
    public String getBrand() {
        return this.brand;
    }
    public double getPrice() {
        return this.price;
    }
    // setters
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    // print info
    public void printInfo() {
        System.out.println("Laptop " + getBrand() + " costs " + getPrice() + " $");
    }
}
