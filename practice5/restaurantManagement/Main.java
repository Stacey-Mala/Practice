package practice5.restaurantManagement;

public class Main {
    public static void main(String[] args) {
        Menu ourMenu = new Menu();

        Dish soup = new HotDish("Soup", 3.00, 60);
        Dish tea = new Drink("Green Tea", 0.50, 250);

        ourMenu.addDish(soup);
        ourMenu.addDish(tea);

        ourMenu.showMenu();
    }
}
