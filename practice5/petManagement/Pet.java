package practice5.petManagement;

public abstract class Pet implements Interactable {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() { return name;}

    public String toString() {
        return "Pet: " + name;
    }

    public abstract void eat();
}
