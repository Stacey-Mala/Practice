package practice2.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Mrs. Jackson", "Literature");

        teacher1.printInfo();
        teacher2.printInfo();

        System.out.println();
        System.out.println("Updated");

        teacher1.setSubject("Chemistry");
        teacher2.setSubject("Arts");
        teacher1.printInfo();
        teacher2.printInfo();
    }

}
