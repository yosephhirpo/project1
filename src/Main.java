public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("Alex", 1000.0);

        myAccount.deposit(500);
        myAccount.displayInfo();
    }
}
class BankAccount {
    private String accountHolder;
    protected double balance;
    public BankAccount(String name, double openingBalance) {
        this.accountHolder = name;
        this.balance = openingBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    public void displayInfo() {
        System.out.println("Holder: " + accountHolder + " | Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {

    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }
}