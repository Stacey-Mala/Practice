package practice5.theAquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium myAquarium = new Aquarium();

        SeaCreature mike = new Shark("Mike");
        SeaCreature patrik = new Starfish("Patrik");

        myAquarium.addCreature(mike);
        myAquarium.addCreature(patrik);

        myAquarium.showBehavior();
    }
}
