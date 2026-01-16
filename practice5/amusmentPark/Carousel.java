package practice5.amusmentPark;

public class Carousel extends Attraction{
    @Override
    public void info() {
        System.out.println(getClass().getSimpleName() + " rides slowly and smoothly");
    }
    @Override
    public void maintain() {
        System.out.println(getClass().getSimpleName() + " requires frequent technical maintenance");
    }
}
