//20301107 Liu Jiayao 2021.3.27
package banking.domain;

public class CheckingAccount extends Account {
    private double overdraftProtection;

    //It must include another public constructor that takes two parameters: balance and protect.
    // This constructor must pass the balance parameter to the parent constructor by calling super(balance)
    // and set the overdraftProtection attribute.
    public CheckingAccount(double balance, double protect) {
        super(balance);
        overdraftProtection = protect;

    }
    //It must include one public constructor that takes one parameter: balance.
    // This constructor must pass the balance parameter to the parent constructor by calling super(balance)

    public CheckingAccount(double balance) {
        super(balance);
    }

    //The CheckingAccount class must override the withdraw(amt) method. It must perform the following check: if the current balance is adequate to cover the amt to withdraw,
    // then proceed as usual. If not and if there is overdraft protection,
    // then attempt to cover the difference (balance - amt) by value of the overdraftProtection.
    // If the amount needed to cover the overdraft is greater than the current level of protection,
    // then the whole transaction must fail with the checking balance unaffected.

    //Rewrite the witdraw method so that it does not return a value (that is, void). Declare that this method throws the OverdraftException.
    //Modify the code to throw an exception if necessary. There are two cases that need to be handled. First, there is a deficit with no overdraft protection from the savings account;
    // use the message "No overdraft protection" for this exception. Second, the overdraftProtection amount is insufficient to cover the deficit; use the message "Insufficient funds for overdraft protection" for this exception.
    public void withdraw(double amt) throws OverdraftException {
        if (this.overdraftProtection == 0) {
            if (amt <= super.balance) {
                super.balance -= amt;

            } else throw new OverdraftException("No overdraft protection", amt - super.balance);
        } else if (amt <= super.balance) {
            super.balance -= amt;
        } else {
            if (amt <= super.balance + overdraftProtection) {
                overdraftProtection = overdraftProtection + super.balance - amt;
                super.balance = 0;
            } else {
                throw new OverdraftException("Insufficient funds for overdraft protection", amt);
            }

        }
    }
}





