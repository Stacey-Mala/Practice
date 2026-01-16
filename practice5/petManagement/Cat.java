package practice5.petManagement;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName() + " is eating wet food");
    }
    @Override
    public void care() {
        System.out.println(getName() + " is playing");
    }
    @Override
    public String toString() {
        return super.toString() + " the Cat";
    }
}
