//20301107 刘佳垚 2021.4.10
package banking.reports;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;

import banking.domain.*;
//You should define a generateReport() method to generate a report in the CustomerReport class.
public class CustomerReport {
    //In the Bank class, add a method called getCustomers that returns an Iterator on the customers list.
    //In the Customer class, add a method called getAccounts that returns an Iterator on the accounts list.
    public void generateReport(){
        Bank bank = Bank.getBank();
        Customer customer;
        Account account;
        Iterator<Customer> customers = bank.getCustomers();

        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");
        while (customers.hasNext()) {
            customer = customers.next();
            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());
            Iterator<Account> accounts = customer.getAccounts();
            //Modify the CustomerReport class to use a pair of nested while loops that iterate over the customer's iterator and the account's iterator; instead of using the nested for loops.
            while(accounts.hasNext()){
                 account = accounts.next();
                String account_type = new String();
                if (account instanceof CheckingAccount) {
                    account_type = "Checking Account";
                }
                if (account instanceof SavingsAccount) {
                    account_type = "Savings Account";
                }
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                System.out.println(account_type + " : " + currencyFormat.format(account.getBalance()));

            }
        }
    }
}
