package practice2.Teacher;

public class Teacher {
    // field
    private String name;
    private String subject;
    // constructor w args
    public Teacher(String someName, String someSubject) {
        this.name = someName;
        this.subject = someSubject;
    }
    // getters for fields
    public String getName() {
        return this.name;
    }
    public String getSubject() {
        return this.subject;
    }
    // setters to update info of fields' values
    public void setName(String newName) {
        this.name = newName;
    }
    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }
    //print method
    public void printInfo() {
        System.out.println("The teacher " + getName() + " instructs students in " + getSubject());
    }
}
