package SPCS3354;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SPAssignment4 {
    public static void main(String[] args) {
        int i = args.length;

        if (i != 2) {
            System.out.println("Usage: SPCS3354.SPAssignment4 input_file output_file");
            return;
        }

        ArrayList<BankAccount> accountList = new ArrayList<>();
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        try (Scanner scanner = new Scanner(inputFile)) {
            PrintWriter writer = new PrintWriter(outputFile);
            AccountNumberComparator accCompare = new AccountNumberComparator();

                while(scanner.hasNext()) {
                String line = scanner.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                try {
                String fields[] = line.split(",");

                String name = fields[0];
                int accountNum = Integer.parseInt(fields[1]);
                double balance = Double.parseDouble(fields[2]);
                String accType = fields[3];


                if ("checking".equals(accType)) {
                    int checkLim = Integer.parseInt(fields[4]);
                    CheckingAccount cAccount = new CheckingAccount(name, accountNum, balance, checkLim);
                    accountList.add(cAccount);
                }
                else if ("savings".equals(accType)) {
                    double interest = Double.parseDouble(fields[4]);
                    SavingsAccount sAccount = new SavingsAccount(name, accountNum, balance, interest);
                    accountList.add(sAccount);
                }
                else {
                    throw new IllegalArgumentException("Unknown account type");
                }
                
            } catch (Exception e) {
                System.out.println("Invalid Line: " + line);
                }            
            }

            Collections.sort(accountList, accCompare);

            for (BankAccount b : accountList) {
                b.printBankAccount(writer);
            }

            writer.close();

            System.out.println("Bye!");
        } catch (FileNotFoundException e) {
            System.out.println("Usage: SPCS3354.SPAssignment4 input_file output_file");
            e.printStackTrace();;
        }
        
    }
}