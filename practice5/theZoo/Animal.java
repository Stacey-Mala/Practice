package practice5.theZoo;

public abstract class Animal implements Soundable{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() { return "Animal: " + name;}

    public abstract void move();
}
