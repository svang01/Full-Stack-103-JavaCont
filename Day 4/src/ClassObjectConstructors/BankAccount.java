package ClassObjectConstructors;

public class BankAccount {
    public double balance;
    public String acctHolder;

    public BankAccount(double initialBalance, String acctHolder) {
        this.balance = initialBalance;
        this.acctHolder = acctHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Holder: " + acctHolder);
        System.out.println("Account Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0, "Diesel Vang");
        account.deposit(100.0);
        account.printAccountDetails();
    }
}