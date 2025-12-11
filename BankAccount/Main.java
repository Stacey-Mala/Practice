package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Ben", 100.0);
        BankAccount bankAccount2 = new BankAccount("Anna", 500.0);

        bankAccount1.printBalance();
        bankAccount2.printBalance();

        System.out.println();
        System.out.println("Update");

        bankAccount1.deposit(50.0);
        bankAccount2.withdraw(133.0);

        bankAccount1.printBalance();
        bankAccount2.printBalance();
    }
}
