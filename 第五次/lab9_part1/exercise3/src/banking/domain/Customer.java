//20301107 刘佳垚 2021.3.26
package banking.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    //Modify the Customer class to use an ArrayList to implement the multiplicty on the accounts association. Perform the same modifications as above.
    private String firstName;
    private String lastName;
    private List<Account> account = new ArrayList<>();

    //declare a public constructor that takes two parameters (f and l) that populate the object attributes
    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //declare the setAccount method to assign the account attribute

    //declare the getAccount method to retrieve the account attribute

    //Modify the Customer class to handle the accounts association with generic multiplicity;
    //It must include the public methods: addAccount(Account), getAccount(int), and getNumOfAccounts().
    public void addAccount(Account newaccount) {
        account.add(newaccount);
    }

    public Account getAccount(int acct_idx) {
        return account.get(acct_idx);
    }

    public int getNumOfAccounts() {
        return account.size();
    }
    public Iterator getAccounts(){
        return account.iterator();
    }
}
