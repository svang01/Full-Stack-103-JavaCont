package ClassObjectConstructors;

public class BankTransfer {
    public static void main(String [] args) {
        BankAccount account1 = new BankAccount(5000, "Larry");
        BankAccount account2 = new BankAccount(300, "Mary");

        account1.withdrawal(100);
        account2.deposit(100);
        account1.printAccountDetails();
        account2.printAccountDetails();
    }
}