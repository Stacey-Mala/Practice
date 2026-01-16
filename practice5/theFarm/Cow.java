package practice5.theFarm;

public class Cow extends DomesticAnimal implements Producer {
    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }
    @Override
    public void care() {
        System.out.println("It needs grazing");
    }
    @Override
    public void produce() {
        System.out.println("It also gives milk");
    }
}
