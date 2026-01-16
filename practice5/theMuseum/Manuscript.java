package practice5.theMuseum;

public class Manuscript extends Exhibit{
    @Override
    public void info() {
        System.out.println(getClass().getSimpleName() + ": found in Rome, 58–49 BC");
    }
    @Override
    public void maintain() {
        System.out.println(getClass().getSimpleName() + " needs an optimal humidity regime");
    }
}
