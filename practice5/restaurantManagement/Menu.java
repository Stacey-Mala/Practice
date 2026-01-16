package practice5.restaurantManagement;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes = new ArrayList<>();

    public void addDish(Dish d) {
        dishes.add(d);
        System.out.println("New dish added: " + d.getName());
    }

    public void showMenu() {
        System.out.println("\n--- Menu ---");
        for (Dish dish : dishes ) {
            System.out.println(dish);
        }
        System.out.println();
    }
}
