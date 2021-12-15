//20301107 刘佳垚 2021.3.19
package banking;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
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
    public void setAccount(Account acct) {
        account = acct;
    }
//declare the getAccount method to retrieve the account attribute
    public Account getAccount() {
        return account;
    }
}
