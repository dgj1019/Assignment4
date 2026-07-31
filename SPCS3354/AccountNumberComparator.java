package SPCS3354;

import java.util.Comparator;

/**
 * Compares two bank accounts by account numbers.
 */
public class AccountNumberComparator implements Comparator<BankAccount> {

  /**
 * Compares two bank accounts based on their account numbers.
 *
 * @param a1 first bank account
 * @param a2 second bank account
 * @return a negative integer, zero, or a positive integer if the first
 * account number is less than, equal to, or greater respectively 
 * than the second
 */
  @Override
  public int compare(BankAccount a1, BankAccount a2){
        if (a1.getNumber() < a2.getNumber()) {
            return -1;
        }
        else if (a1.getNumber() == a2.getNumber()) {
            return 0;
        }
        else {
            return 1;
        }    
  }
}
