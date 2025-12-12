package Practice_2.Laptop;

public class Main {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop("Lenovo", 255.99);
        Laptop mac = new Laptop("MacPC", 1999.99);

        lenovo.printInfo();
        mac.printInfo();

        System.out.println();
        System.out.println("Prices have changed");
        lenovo.setPrice(200.99);
        mac.setPrice(1500.99);

        lenovo.printInfo();
        mac.printInfo();
    }
}
