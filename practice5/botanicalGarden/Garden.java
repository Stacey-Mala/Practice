package practice5.botanicalGarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private List<Plant> plants = new ArrayList<>();

    public void addPlant(Plant p) {
        plants.add(p);
        System.out.println("New plant added: " + p.getClass().getSimpleName());
    }

    public void startCare() {
        System.out.println("\n--- Garden ---");
        for (Plant plant : plants) {
            plant.care();
        }
    }
}
