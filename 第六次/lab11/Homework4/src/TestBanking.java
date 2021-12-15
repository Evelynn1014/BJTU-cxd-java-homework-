//20301107 刘佳垚 2021.4.11

/*
 * This class creates the program to test the banking classes.
 * It creates a set of customers, with a few accounts each,
 * and generates a report of current account balances.
 */

import banking.domain.*;
import banking.reports.CustomerReport;

import java.io.*;
import java.util.Scanner;


public class TestBanking {
//In the main() method of TestBanking.java program. You should read the customer's accounts information
// from a text file named account.txt to create custumers and their accounts objects.
    public static void main(String[] args) throws IOException {
        Bank bank = Bank.getBank();
        Customer customer;
        CustomerReport report = new CustomerReport();
        try{
            File file = new File("account.txt");
            FileReader fr = new FileReader(file);
            int acc = 0;
            BufferedReader bfr  = new BufferedReader(fr);
            //use scanner to read
            Scanner s = new Scanner(fr);
            s.nextLine();
            while ((s.hasNext())) {
                String str1 = s.next();
                String str2 = s.next();
                bank.addCustomer(str2, str1);
                customer = bank.getCustomer(acc);
                double a = 0;
                String str3 = s.next();
                //catch "null"
                if(!str3.equals("null") ){
                    a = Double.parseDouble(str3);
                    customer.addAccount(new SavingsAccount(a,0));

                }

                double b = 0;
                String str4 = s.next();
                if(!str4.equals("null") ){
                    b = Double.parseDouble(str4);
                    if(s.hasNext()){
                        double c = s.nextDouble();
                        customer.addAccount(new CheckingAccount(b, c));
                    }
                }else{
                    customer.addAccount(bank.getCustomer(2).getAccount(1));
                }
                acc++;
            }
            fr.close();
    }catch(IOException e){
        e.printStackTrace();
    }
        // Generate a report
        report.generateReport();
        File fa = new File("account.txt");
    }
}