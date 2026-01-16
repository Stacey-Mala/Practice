package practice5.restaurantManagement;

public class Drink extends Dish{
    private int volume;

    public Drink(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() { return volume; }

    @Override
    public String toString() {
        return super.toString() + " | Volume: " + volume + " ml";
    }
}
