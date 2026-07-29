package SPCS3354;

import java.io.PrintWriter;

public class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String owner, int number, double balance, double interest) {
        super(owner, number, balance);
        this.interest = interest;
    }

    @Override
    public void printBankAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + interest);
    }

    @Override
    public void printBankAccount(PrintWriter pw) {
        pw.println("Owner: " + owner);
        pw.println("Account Number: " + number);
        pw.println("Balance: " + balance);
        pw.println("Account Type: Savings");
        pw.println("Interest Rate: " + interest);
    }
}