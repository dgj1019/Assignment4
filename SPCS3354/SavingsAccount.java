package SPCS3354;

import java.io.PrintWriter;

/**
* Represents a savings account.
*/
public class SavingsAccount extends BankAccount {
    private double interest;

    /**
    * Creates an empty savings account.
    */
    public SavingsAccount() {
        super();
    }

    /**
    * Creates a savings account with the specified information.
    *
    * @param owner the account owner's name
    * @param number the account number
    * @param balance the account balance
    * @param interest the interest rate
    */
    public SavingsAccount(String owner, int number, double balance, double interest) {
        super(owner, number, balance);
        this.interest = interest;
    }

    /**
    * Prints the savings account information to the console.
    */
    @Override
    public void printBankAccount() {
        System.out.println(owner + "," + number + "," + balance + ",savings," + interest);
    }

    /**
    * Prints the savings account information to a file.
    *
    * @param pw the PrintWriter used to write the account information
    */
    @Override
    public void printBankAccount(PrintWriter pw) {
        pw.println(owner + "," + number + "," + balance + ",savings," + interest);
    }
}
