package Practice_2.Product;

public class Product {
    //fields
    private String name;
    private double price;

    // constructor w args
    public Product(String someName, double somePrice) {
        this.name = someName;
        this.price = somePrice;
    }
    // getters
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    // setters
    public void setName(String newName) {
        this.name = newName;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    // special methods (functionality)
    public void applyDiscount(double discount) {
        setPrice((1.0 - (discount/100)) * getPrice());
    }
    public void printInfo(){
        System.out.println("Product " + getName() + " costs " + getPrice() + " $");
    }
}
