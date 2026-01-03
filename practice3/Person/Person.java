package Practice_3.Person;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String someFirstName, String someLastName, String someSSN) {
        this.firstName = someFirstName;
        this.lastName = someLastName;
        this.ssn = someSSN;
    }
    // getters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getSSN() {
        return this.ssn;
    }
    // setters
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void printPersonInfo() {
        System.out.println(
                "Имя: " + getFirstName() +
                        ", Фамилия: " + getLastName() +
                        ", SSN: " + getSSN()
        );
    }
}
