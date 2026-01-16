package practice5.theFarm;

public class Chicken extends DomesticAnimal implements Producer {
    @Override
    public void eat() {
        System.out.println("Chicken eats grains");
    }
    @Override
    public void care() {
        System.out.println("It needs a feeder");
    }
    @Override
    public void produce() {
        System.out.println("It lays eggs every day");
    }
}
