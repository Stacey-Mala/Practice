package practice5.theAquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<SeaCreature> creatures = new ArrayList<>();

    public void addCreature(SeaCreature sc) {
        creatures.add(sc);
        System.out.println("New creature added: " +sc.getName());
    }

    public void showBehavior() {
        System.out.println("\n--- Aquarium ---");
        for(SeaCreature creature : creatures) {
            System.out.println(creature);
            creature.behave();
        }
        System.out.println();
    }
}
