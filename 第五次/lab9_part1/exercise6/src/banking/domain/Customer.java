//20301107 Liu Jiayao 2021.4.10
package banking.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Liu Jiayao
 * @version 20210410
 */
public class Customer implements Comparable<Customer> {
    //Modify the Customer class to use an ArrayList to implement the multiplicty on the accounts association. Perform the same modifications as above.
    private String firstName;
    private String lastName;
    private List<Account> account = new ArrayList<>();

    /**
     *
     * @param f
     * @param l
     */
    //declare a public constructor that takes two parameters (f and l) that populate the object attributes
    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    /**
     *
     * @return return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @return return the last name
     */
    public String getLastName() {
        return lastName;
    }
    //declare the setAccount method to assign the account attribute

    //declare the getAccount method to retrieve the account attribute

    //Modify the Customer class to handle the accounts association with generic multiplicity;
    //It must include the public methods: addAccount(Account), getAccount(int), and getNumOfAccounts().

    /**
     *
     * @param newaccount
     */
    public void addAccount(Account newaccount) {
        account.add(newaccount);
    }

    /**
     *
     * @param acct_idx
     * @return return the account
     */
    public Account getAccount(int acct_idx) {
        return account.get(acct_idx);
    }

    /**
     *
     * @return return the size
     */
    public int getNumOfAccounts() {
        return account.size();
    }

    /**
     *
     * @return return a iterator
     */
    public Iterator getAccounts() {
        return account.iterator();
    }
    //Modify the Customer class to implement the Comparable interface.
    // You will need to specify the compareTo method. Make this method compare the two customers in a lexigraphical order with the last name taking precedence over the first name.
    // For example, "Joe Smith" should come before "Samuel Smith".

    /**
     *
     * @param c1
     * @return
     */
    public int compareTo(Customer c1) {

        if (c1.lastName.compareTo(lastName) != 0) {
            if (c1.lastName.compareTo(lastName) > 0) {
                return -1;
            } else{
                return 1;
            }
        } else {
            if (c1.firstName.compareTo(firstName) > 0) {
                return -1;
            } else if(c1.firstName.compareTo(firstName) < 0){
                return 1;
            }else return 0;
        }
    }
}

