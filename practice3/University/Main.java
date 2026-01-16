package practice3.University;

public class Main {
    public static void main(String[] args) {
        University student1 = new University(1, "Anna");
        University student2 = new University(2, "Steven");
        University student3 = new University(3, "Mary");

        University.changeUniversityName("Harvard");
        student1.printStudentInfo();
        student2.printStudentInfo();
        University.changeUniversityName("Yale");
        student3.printStudentInfo();
    }
}
