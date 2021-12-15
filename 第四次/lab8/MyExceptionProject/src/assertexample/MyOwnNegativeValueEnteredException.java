//20301107 刘佳垚 2021.3.27
package assertexample;

public class MyOwnNegativeValueEnteredException extends ArithmeticException{
    public MyOwnNegativeValueEnteredException(int size,String message){
//If a user enters zero, throw a MyOwnZeroValueEnteredException, which is an extension of ArithmeticException.
        super(message);

    }
}
