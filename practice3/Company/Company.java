package Practice_3.Company;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    public Company(int someEmployeeID, String someEmployeeName) {
        this.employeeID = someEmployeeID;
        this.employeeName = someEmployeeName;
    }
    static void printCompanyName() {
        System.out.println("The company name: " + companyName);
    }
    public String getEmployeeName() {
        return this.employeeName;
    }
    public void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }
}
