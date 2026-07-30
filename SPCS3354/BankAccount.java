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

    public void printBankAccount(){
        System.out.println("Owner: " + owner);
        System.out.println("Account Number: " + number);
        System.out.println("Balance: " + balance);
    }

    public void printBankAccount(PrintWriter pw){
        pw.println("Owner: " + owner);
        pw.println("Account Number: " + number);
        pw.println("Balance: " + balance);
    }

}
