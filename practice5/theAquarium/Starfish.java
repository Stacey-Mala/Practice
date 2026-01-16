package practice5.theAquarium;

public class Starfish extends SeaCreature{
    public Starfish(String name) { super(name); }

    @Override
    public void behave() {
        System.out.println(getName() + " is crawling slowly");
    }
    @Override
    public String toString() {
        return super.toString() + " the Starfish";
    }
}
