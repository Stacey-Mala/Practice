package practice5.theAquarium;

public abstract class SeaCreature {
    private String name;

    public SeaCreature(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public abstract void behave();

    @Override
    public String toString() {
        return "Sea Creature: " + name;
    }
}
