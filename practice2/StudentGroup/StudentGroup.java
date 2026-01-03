package Practice_2.StudentGroup;

public class StudentGroup {
    // fields
    private String groupName;
    private int studentCount;

    // constructor w args
    public StudentGroup(String someGroupName, int someStudentCount) {
        this.groupName = someGroupName;
        this.studentCount = someStudentCount;
    }

    // getters for groupName and studentCount fields
    public String getGroupName() {
        return this.groupName;
    }
    public int getStudentCount() {
        return this.studentCount;
    }

    // setters to update values of groupName and studentCount fields
    public void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }
    public void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    // print the info
    public void printInfo() {
        System.out.println("Group " + getGroupName() + " has " + getStudentCount() + " students");
    }
}
