package practice5.botanicalGarden;

public class Main {
    public static void main(String[] args) {
        Garden myGarden = new Garden();

        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        myGarden.addPlant(orchid);
        myGarden.addPlant(cactus);

        myGarden.startCare();
    }
}
