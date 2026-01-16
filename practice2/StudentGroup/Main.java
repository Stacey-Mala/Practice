package practice2.StudentGroup;

public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("Buzz", 12);
        StudentGroup group2 = new StudentGroup("Fuzz", 11);

        group1.printInfo();
        group2.printInfo();

        System.out.println();
        System.out.println("Updated");

        group1.setStudentCount(10);
        group2.setStudentCount(13);

        group1.printInfo();
        group2.printInfo();
    }
}
