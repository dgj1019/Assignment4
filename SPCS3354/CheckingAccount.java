package SPCS3354;

import java.io.PrintWriter;

public class CheckingAccount extends BankAccount {
    private int checkLimit;

    public CheckingAccount(){
        super();
    }

    public CheckingAccount(String owner, int number, double balance, int checkLimit) {
        super(owner, number, balance);
        this.checkLimit = checkLimit;
    }

    @Override
    public void printBankAccount() {
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: Checking");
        System.out.println("Check Limit: " + checkLimit);
    }

    @Override
    public void printBankAccount(PrintWriter pw) {
        pw.println("Owner: " + owner);
        pw.println("Account Number: " + number);
        pw.println("Balance: " + balance);
        pw.println("Account Type: Checking");
        pw.println("Check Limit: " + checkLimit);
    }
}