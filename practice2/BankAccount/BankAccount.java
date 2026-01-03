package Practice_2.BankAccount;

public class BankAccount {

    // fields
    private String owner;
    private double balance;

    // constructor with arguments
    public BankAccount(String someOwner, double someBalance) {
        this.owner = someOwner;
        this.balance = someBalance;
    }

    // getters for owner and balance fields
    public String getOwner() {
        return this.owner;
    }
    public double getBalance() {
        return this.balance;
    }

    // setters to update owner- and balance- field values of a current object
    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    // operational methods
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
    // print balance
    public void printBalance() {
        System.out.println(getOwner() + "'s current balance is " + getBalance() + "$");
    }
}
