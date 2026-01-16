package practice5.theFarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<DomesticAnimal> animals = new ArrayList<>();

    public void setAnimal(DomesticAnimal a){
        animals.add(a);
        System.out.println("Animal set: " + a.getClass().getSimpleName());
    }
    public void serviceAnimal() {
        System.out.println("\n--- Farm ---");
        for (DomesticAnimal animal : animals) {
            System.out.println("Your animal: " + animal.getClass().getSimpleName());
            animal.eat();
            animal.care();
            if (animal instanceof Producer giver) {
                giver.produce();
            }
            System.out.println();
        }
    }
}
