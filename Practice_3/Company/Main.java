package Practice_3.Company;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Mike");
        Company employee2 = new Company(2, "Alice");
        Company employee3 = new Company(3, "John");

        Company.companyName = "Apple";
        employee1.printCompanyName();
        employee2.printCompanyName();
        employee3.printCompanyName();

        // employee1.employeeID = 1;
    }
}
