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
        System.out.println(owner + "," + number + "," + balance + ",savings," + interest);
    }

    @Override
    public void printBankAccount(PrintWriter pw) {
        pw.println(owner + "," + number + "," + balance + ",savings," + interest);
    }
}
