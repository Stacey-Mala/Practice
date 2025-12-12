package Practice_2.Product;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("banana", 2.0);
        Product apple = new Product("apple", 0.5);

        banana.printInfo();
        apple.printInfo();

        System.out.println();
        System.out.println("Black Friday! Everything is 10% off");

        banana.applyDiscount(10.0);
        apple.applyDiscount(10.0);

        banana.printInfo();
        apple.printInfo();
    }
}
