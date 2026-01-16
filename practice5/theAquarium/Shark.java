package practice5.theAquarium;

public class Shark extends SeaCreature{
    public Shark(String name) { super(name); }

    @Override
    public void behave() {
        System.out.println(getName() + " is swimming fast and aggressively");
    }
    @Override
    public String toString() {
        return super.toString() + " the Shark";
    }
}
