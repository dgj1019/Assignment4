package SPCS3354;

import java.util.Comparator;

public class AccountNumberComparator implements Comparator<BankAccount> {
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
