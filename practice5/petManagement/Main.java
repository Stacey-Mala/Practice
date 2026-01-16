package practice5.petManagement;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Chuppy");
        Pet cat = new Cat("Tom");

        PetManager alex = new PetManager();

        alex.setPet(dog);
        alex.setPet(cat);

        alex.handlePet();
    }
}
