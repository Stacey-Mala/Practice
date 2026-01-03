package Practice_3.University;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    public University(int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }
    public static String changeUniversityName(String newName) {
        return universityName = newName;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public void printStudentInfo() {
        System.out.println(
                "Student name: " + getStudentName() +
                ", student ID: " + studentID +
                        ", university name: " + universityName);
    }
}
