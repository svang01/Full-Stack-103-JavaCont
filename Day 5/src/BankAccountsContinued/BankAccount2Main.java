package BankAccountsContinued;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount2> accountList = new ArrayList<>();

        BankAccount2 Larry = new BankAccount2("Larry", 500, 0);
        Larry.deposit(100);

        BankAccount2 Diesel = new BankAccount2("Diesel", 22000, 1);
        BankAccount2 Charlotte = new BankAccount2("Charlotte", 200, 2);

        Diesel.withdrawal(100);
        Charlotte.deposit(100);
        accountList.add(Larry);
        accountList.add(Diesel);
        accountList.add(Charlotte);

        BankAccount2 currentAccount = new BankAccount2();
        currentAccount.setAccountNumber(4);
        accountList.add(currentAccount);

        mainMenu(currentAccount, accountList);

    }

    public static void mainMenu(BankAccount2 currentAccount, ArrayList<BankAccount2> accountList) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hello " + currentAccount.getAccountHolderName() + "!");
            System.out.println("Welcome to the Main Menu, what would you like to do today? \n" +
                    "1. Check Account Balance \n" +
                    "2. Make A Withdrawal \n" +
                    "3. Make A Deposit \n" +
                    "4. Make A Transfer To Another Account \n" +
                    "0. Exit Main Menu");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentAccount.printAccountDetails();
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?");
                    double withdrawalAmt = scanner.nextDouble();
                    currentAccount.withdrawal(withdrawalAmt);
                    currentAccount.printAccountDetails();
                    break;
                case 3:
                    System.out.println("How much would you like to deposit?");
                    double depositAmt = scanner.nextDouble();
                    currentAccount.deposit(depositAmt);
                    currentAccount.printAccountDetails();
                    break;
                case 4:
                    System.out.println("Enter the account number you wish to transfer money to: ");
                    int transferAcctNumber = scanner.nextInt();

                    BankAccount2 transferAccount = findAcct(transferAcctNumber, accountList);

                    if (transferAccount == null) {
                        System.out.println("Account doesn't exist");
                        break;
                    }
                    System.out.println("Please enter the amount to transfer: ");
                    double transferAmt = scanner.nextDouble();

                    currentAccount.transfer(transferAccount, transferAmt);
                    break;

                case 0:
                    System.out.println("Have a good day!");
                    return;
                default:
                    System.out.println("Enter a valid option (1-4; or 0 to exit)");
                    break;

            }

        }

    }
    public static BankAccount2 findAcct(int acctNumber, ArrayList<BankAccount2> accountList) {
        for (BankAccount2 account : accountList) {
            if (account.getAccountNumber() == acctNumber) {
                return account;
            }
        }
        return null;
    }
}
