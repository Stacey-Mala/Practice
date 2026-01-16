package practice5.theZoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a) {
        animals.add(a);
        System.out.println("New animal added: " + a.getName());
    }
    public void demonstrateBehaviors() {
        System.out.println("\n--- Demonstration ---");
        for (Animal animal: animals){
            System.out.println(animal);
            animal.makeSound();
            animal.move();
            System.out.println();
        }
    }
}
