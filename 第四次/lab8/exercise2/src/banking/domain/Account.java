//20301107 刘佳垚 2021.3.27
package banking.domain;

public class Account {

    double balance;
    public Account(double init_balance) {
        balance = init_balance;
    }
    public double getBalance() {
        return balance;
    }
    //Modify the deposit method to return true. (meaning all deposits are successful)
    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }
    //Modify the withdraw method to check that the amount being withdrawn is not greater than the current balance.
    // If amt is less than balance, then subtract the amount from the balance and return true; else, leave the balance alone and return false.

    //Rewrite the witdraw method so that it does not return a value (that is, void). Declare that this method throws the OverdraftException.
    //Modify the code to throw a new exception that specifies "Insufficient funds" and the deficit (the amount requested subtracted by the current balance).
    public void withdraw(double amt) throws OverdraftException{

        if (balance >= amt) {
            balance -= amt;
        } else {
            throw new OverdraftException("Insufficient funds",amt-balance);
        }

    }
}