//20301107 刘佳垚 2021.3.27
package assertexample;

public class MyOwnZeroValueEnteredException extends ArithmeticException {
    public MyOwnZeroValueEnteredException(String message) {
//If a user enters a negative value, throw a MyOwnNegativeValueEnteredException, which is an extension of ArithmeticException.
// The display of the error information should display the negative number that was entered.
        super("You cannot enter 0, please enter size > 0 ");
    }
}

