//20301107 刘佳垚 2021.3.12
package banking;

public class Account {

    private double balance;

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
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else {
            return false;
        }

    }
}