package practice5.theZoo;

public class Elephant extends Animal{
    public Elephant(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println(getName() + " is walking");
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " is trumpeting");
    }
    @Override
    public String toString() {
        return super.toString() + " the Elephant";
    }
}
