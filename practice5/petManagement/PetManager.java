package practice5.petManagement;

import java.util.ArrayList;
import java.util.List;

public class PetManager {
    private List<Pet> pets = new ArrayList<>();

    public void setPet(Pet p) {
        pets.add(p);
        System.out.println("Chosen Pet: " + p.getName());
    }

    public void handlePet() {
        System.out.println("\n--- Interaction ---");
        for (Pet pet: pets) {
            System.out.println(pet);
            pet.eat();
            pet.care();
            System.out.println();
        }
    }
}
