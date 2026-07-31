package SPCS3354;

import java.io.PrintWriter;

/**
* Represents a checking account.
*/
public class CheckingAccount extends BankAccount {
    private int checkLimit;

    /**
    * Creates an empty checking account.
    */
    public CheckingAccount(){
        super();
    }

    /**
    * Creates a checking account with the specified information.
    *
    * @param owner the account owner's name
    * @param number the account number
    * @param balance the account balance
    * @param checkLimit the check limit
    */
    public CheckingAccount(String owner, int number, double balance, int checkLimit) {
        super(owner, number, balance);
        this.checkLimit = checkLimit;
    }

    /**
    * Prints the checking account information to the console.
    */
    @Override
    public void printBankAccount() {
        System.out.println(owner + "," + number + "," + balance + ",checking," + checkLimit);
    }

    /**
    * Prints the checking account information to a file.
    *
    * @param pw the PrintWriter used to write the account information
    */
    @Override
    public void printBankAccount(PrintWriter pw) {
        pw.println(owner + "," + number + "," + balance + ",checking," + checkLimit);
    }
}
