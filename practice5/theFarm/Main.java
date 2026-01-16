package practice5.theFarm;

public class Main {
    public static void main(String[] args) {
        Farm myFarm = new Farm();

        DomesticAnimal cow = new Cow();
        DomesticAnimal chicken = new Chicken();

        myFarm.setAnimal(cow);
        myFarm.setAnimal(chicken);

        myFarm.serviceAnimal();
    }
}
