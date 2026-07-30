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
        System.out.println(owner + "," + number + "," + balance + ",checking," + checkLimit);
    }

    @Override
    public void printBankAccount(PrintWriter pw) {
        pw.println(owner + "," + number + "," + balance + ",checking," + checkLimit);
    }
}
