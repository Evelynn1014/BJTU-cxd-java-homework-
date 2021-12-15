//20301107 刘佳垚 2021.3.26
package banking.domain;

public class Customer {
    private String firstName;
    private String lastName;
    private Account[] account = new Account[15];
//declare a public constructor that takes two parameters (f and l) that populate the object attributes
    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }
    int acnum = 0;
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
//declare the setAccount method to assign the account attribute
 // public void setAccount(Account[] acct) {
   //     account[] = acct;
    //}
//declare the getAccount method to retrieve the account attribute

    //Modify the Customer class to handle the accounts association with generic multiplicity;
    //It must include the public methods: addAccount(Account), getAccount(int), and getNumOfAccounts().
    public void addAccount(Account newaccount) {
        if (newaccount instanceof CheckingAccount) {
            account[acnum] = new CheckingAccount(newaccount.balance,((CheckingAccount) newaccount).overdraftProtection);

        }
        if (newaccount instanceof SavingsAccount) {
            account[acnum] = new SavingsAccount(newaccount.balance,((SavingsAccount) newaccount).interestRate);
        }
        acnum++;
    }
    public Account getAccount(int acct_idx) {
       // account[acct_idx]
        return account[acct_idx];
    }
    public int getNumOfAccounts() {

       return acnum;
      //  return this.account.length;
    }
}
