//20301107 刘佳垚 2021.3.26
package banking.reports;

import java.text.NumberFormat;
import banking.domain.*;
//You should define a generateReport() method to generate a report in the CustomerReport class.
public class CustomerReport {
    public void generateReport(){
        Bank bank = Bank.getBank();
        Customer customer;
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");
        for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
            customer = bank.getCustomer(cust_idx);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
                Account account = customer.getAccount(acct_idx);
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
