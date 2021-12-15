//20301107 刘佳垚 2021.3.26
package banking.domain;

import banking.domain.Account;

public class SavingsAccount extends Account {
    double interestRate;

    //It must include a public constructor that takes two parameters: balance and interest_rate.
//This constructor must pass the balance parameter to the parent constructor by calling super(balance).
    public SavingsAccount(double balance, double interest_rate) {
        super(balance);
        this.interestRate = interest_rate;
    }

}


