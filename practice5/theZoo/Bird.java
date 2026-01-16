package practice5.theZoo;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    @Override
    public void move() {
        System.out.println(getName() + " is flying");
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " is tweeting");
    }
    @Override
    public String toString() {
        return super.toString() + " the Bird";
    }
}
