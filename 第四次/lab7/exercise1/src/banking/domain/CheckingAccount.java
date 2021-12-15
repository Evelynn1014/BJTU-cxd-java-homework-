//20301107 刘佳垚 2021.3.26
package banking.domain;

public class CheckingAccount extends Account {
    double overdraftProtection;

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
    public boolean withdraw(double amt) {
        if (amt < super.balance) {
            super.balance -= amt;
            return true;
        } else {
            if (amt - overdraftProtection > 0) {
                return false;
            } else {
                if (amt > super.balance) {
                    super.balance = 0;
                } else {
                    super.balance -= amt;
                }
                return true;
            }

        }

    }
}

