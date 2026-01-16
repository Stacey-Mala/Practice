package practice5.restaurantManagement;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(String name, double price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }
    public int getTemperature() { return temperature; }

    @Override
    public String toString() {
        return super.toString() + " | Temperature: " + temperature + " C";
    }
}
