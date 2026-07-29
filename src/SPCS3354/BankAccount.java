package SPCS3354;

import java.io.PrintWriter;


public abstract class BankAccount {
    protected String owner;
    protected int number;
    protected double balance;

    public BankAccount(){
    }
    public BankAccount(String owner, int number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }
    public int getNumber() {
        return number;
    }

    public abstract void printBankAccount();
    public abstract void printBankAccount(PrintWriter pw);

}