package practice5.amusmentPark;

public class Rollercoaster extends Attraction{
    @Override
    public void info() {
        System.out.println(getClass().getSimpleName() + " provides excitement and thrills");
    }
    @Override
    public void maintain() {
        System.out.println(getClass().getSimpleName() + " requires regular safety checks");
    }
}
