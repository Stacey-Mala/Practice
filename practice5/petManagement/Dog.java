package practice5.petManagement;

public class Dog extends Pet{
    public Dog(String name) { super(name); }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dry food");
    }
    @Override
    public void care() {
        System.out.println(getName() + " is walking");
    }
    @Override
    public String toString() {
        return super.toString() + " the Dog";
    }
}
