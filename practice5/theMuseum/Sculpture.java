package practice5.theMuseum;

public class Sculpture extends Exhibit{
    @Override
    public void info() {
        System.out.println(getClass().getSimpleName() + ": from Renaissance");
    }
    @Override
    public void maintain() {
        System.out.println(getClass().getSimpleName() + " requires frequent restorations");
    }
}
