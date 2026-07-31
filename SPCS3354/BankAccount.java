package SPCS3354;

import java.io.PrintWriter;

/**
* Represents a generic bank account.
*/
public abstract class BankAccount {
    protected String owner;
    protected int number;
    protected double balance;

    /**
    * Creates an empty bank account.
    */
    public BankAccount(){
    }

    /**
    * Creates a bank account with the specified owner, account number, and balance.
    *
    * @param owner the owner's name
    * @param number the account number
    * @param balance the account balance
    */
    public BankAccount(String owner, int number, double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    /**
    * Returns the account number.
    *
    * @return the account number
    */
    public int getNumber() {
        return number;
    }

    /**
    * Prints the bank account information to the console.
    */
    public void printBankAccount(){
        System.out.println(owner + "," + number + "," + balance);
    }

    /**
    * Prints the bank account information to a file.
    *
    * @param pw the PrintWriter used to write the account information
    */
    public void printBankAccount(PrintWriter pw){
        pw.println(owner + "," + number + "," + balance);
    }
}
