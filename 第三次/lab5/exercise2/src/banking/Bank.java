//20301107 刘佳垚 2021.3.19
package banking;

public class Bank {
    //Add two attributes to the Bank class: customers (an array of Customer objects)
    // and numberOfCustomers (an integer that keeps track of the next customers array index).
    //Add a public constructor that initializes the customers array with some appropriate maximum size (at least bigger than 5).
    Customer[] customer = new Customer[30];
    int numberOfCustomers = 0;

    public void addCustomer(String f, String l) {
        customer[numberOfCustomers] = new Customer(f, l);
        numberOfCustomers++;
    }

    //Add the getNumOfCustomers accessor method, which returns the numberOfCustomers attribute.
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    //Add the getCustomer method. This method returns the customer associated with the given index parameter.
    public Customer getCustomer(int index) {
        return customer[index];
    }

}
