package Practice_3.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mike", "Smith", "123-45-6789");
        Person person2 = new Person("Anna", "Smith", "321-54-9876");

        person2.setLastName("Black");
        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
