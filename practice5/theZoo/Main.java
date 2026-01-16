package practice5.theZoo;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird("Mike");
        Animal elephant = new Elephant("Emma");

        Zoo myZoo = new Zoo();

        myZoo.addAnimal(bird);
        myZoo.addAnimal(elephant);

        myZoo.demonstrateBehaviors();
    }
}
