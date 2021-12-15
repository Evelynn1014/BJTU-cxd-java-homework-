//20301107 刘佳垚 2021.4.10
package banking.domain;

import banking.domain.Customer;

import java.util.*;

public class Bank {
    //Add two attributes to the Bank class: customers (an array of Customer objects)
    // and numberOfCustomers (an integer that keeps track of the next customers array index).
    //Add a public constructor that initializes the customers array with some appropriate maximum size (at least bigger than 5).

    //Modify the declaration for the customers attribute to be of type List and drop the numberOfCustomers attribute.
    //Modify the Bank constructor to initialize the customers attribute to be a new ArrayList object.
    List<Customer> customer = new ArrayList<>();
    private static Bank bankInstance = new Bank();

    public static Bank getBank() {
        return bankInstance;
    }

    private Bank() {
    }

    //Modify the addCustomer method to use the add method.
    public void addCustomer(String f, String l) {
        Customer customer1 = new Customer(f, l);
        customer.add(customer1);
    }

    //Add the getCustomer method. This method returns the customer associated with the given index parameter.
    //Modify the getCustomer method to use the get method.
    public Customer getCustomer(int index) {
        return customer.get(index);
    }

    //Add the getNumOfCustomers accessor method, which returns the numberOfCustomers attribute.
    //Modify the getNumOfCustomers method to use the size method.
    public int getNumOfCustomers() {
        return customer.size();
    }
    public Iterator getCustomers(){
        return customer.iterator();
    }
    //Add the sortCustomers method to the Bank class.
    public void sortCustomers() {
        Collections.sort(customer);
    }
}
