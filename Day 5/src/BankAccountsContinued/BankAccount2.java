package BankAccountsContinued;

import java.util.Scanner;

public class BankAccount2 {

    private String accountHolderName;
    private double accountBalance;
    private int accountNumber;

    public BankAccount2() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bank of Wells");
        System.out.println("Are you an existing customer? (-1 to exit) \n" +
                "1. Yes \n" +
                "2. No");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Great! We appreciate your loyalty to Bank of Wells!");
                break;
            case 2:
                System.out.println("What is the name on the account?");
                this.accountHolderName = scanner.nextLine();
                scanner.nextLine();
                System.out.println("What is the balance for the account?");
                this.accountBalance = scanner.nextDouble();
                this.accountNumber = -1;
                break;
            case -1:
                System.out.println("Thank you, Have a good Day.");
                break;
        }
    }
    public BankAccount2(String name, double balance) {
        this.accountHolderName = name;
        this.accountBalance = balance;
    }
    public BankAccount2(String name, double balance, int accountNumber) {
        this.accountHolderName = name;
        this.accountBalance = balance;
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdrawal(double amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
        } else {
            System.out.println("No Money");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Number: "+ this.accountNumber + "\n" +
                "" + this.accountHolderName + " has a balance of: " + this.accountBalance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void transfer(BankAccount2 otherAcct, double amountToTransfer) {
        if(accountBalance < amountToTransfer) {
            System.out.println("Insufficient Balance");
        }

        withdrawal(amountToTransfer);

        otherAcct.deposit(amountToTransfer);

        printAccountDetails();
        otherAcct.printAccountDetails();
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}