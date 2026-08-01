package SPCS3354;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * SPAssignment4 conaints the main method for the SPCS3354 package. The SPCS3354 package
 * acts as a way to parse and sort bank information from properly formatted input files.
 * 
 * <p> 
 * Main method first checks the length of args, if length != 2 -> too many/litte args. If
 * the right number of args are present, create an array list of the BankAccount type, and
 * two File objects to hold the input/output files. 
 * 
 * Then a try-catch block is used with a Scanner and PrintWriter object to read/write information
 * from the files, and catch a FileNotFoundException which means the user input the wrong fileName,
 * or the file does not exist.
 * 
 * Then, while there is a line to read, I create a String object to store the token, then another
 * try-catch block.
 * 
 * In the second try-catch block each line is parsed into a String array using the ',' as a seperator. I can then
 * read each field from the array into variables of their specific type, using the wrapper class methods
 * Integer.parseInt & Double.parseDouble to type-cast those string values so that they can be stored appropriately.
 * 
 * A switch statements then checks which account type we want to create, and create the respective interest or checkLim
 * variables. Then, each account is added to the BankAccount ArrayList. If the parsing of the line goes wrong in some 
 * form: NumberFormatException, ArrayIndexOutOfBounds, etc.. the catch block will catch the exception and print the 
 * problematic line to the terminal.
 * 
 * Then, each succesfully created SavingsAccount & CheckingAccount object is sorted using the
 * Collections.sort method with a custom AccountNumberComparator object and written to the output
 * file using the PrintWriter object. Finally, the program prints Bye!
 * 
 * @param args Contains the names of the input/output files stored in a String array
 * 
 * @author Jack Grossenbacher
 * @author Daniel Gallegos
 */


public class SPAssignment4 {
    @SuppressWarnings({ "UseSpecificCatch"})
    public static void main(String[] args) {
        int i = args.length;

        if (i != 2) {
            System.out.println("Usage: SPCS3354.SPAssignment4 input_file output_file");
            return;
        }

        ArrayList<BankAccount> accountList = new ArrayList<>();
        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        try (Scanner scanner = new Scanner(inputFile); PrintWriter writer = new PrintWriter(outputFile)) {
            AccountNumberComparator accCompare = new AccountNumberComparator();
            
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                try {
                    String fields[] = line.split(",");

                    if (fields.length != 5) {
                        throw new IllegalArgumentException("Incorrect number of fields");
                    }

                    String name = fields[0];
                    int accountNum = Integer.parseInt(fields[1]);
                    double balance = Double.parseDouble(fields[2]);
                    String accType = fields[3];

                    switch (accType) {
                        
                        case "checking":
                            int checkLim = Integer.parseInt(fields[4]);
                            CheckingAccount cAccount = new CheckingAccount(name, accountNum, balance, checkLim);
                            accountList.add(cAccount);                            
                            break;

                        case "savings":
                        double interest = Double.parseDouble(fields[4]);
                        SavingsAccount sAccount = new SavingsAccount(name, accountNum, balance, interest);
                        accountList.add(sAccount);
                            break;

                        default:
                            throw new IllegalArgumentException("Unknown account type");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Improperly formatted line: " + line);
                } catch (IllegalArgumentException e) {
                    System.out.println("Improperly formatted line: " + line);
                } catch (Exception e) {
                    System.out.println("Improperly formatted line: " + line);
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
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
