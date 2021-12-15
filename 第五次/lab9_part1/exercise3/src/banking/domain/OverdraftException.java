//20301107 刘佳垚 2021.3.27
package banking.domain;
//Create a public class, called OverdraftException, in the banking.domain package. This class extends the Exception class.


public class OverdraftException extends Exception{
    //Add a private attribute called deficit that holds a double. Add a public accessor called getDeficit.
     private double deficit;
     //Add a public constructor that takes two arguments: message and deficit. The message parameter should be passed to the super class constructor.
    // The deficit parameter initializes the deficit attribute.
     public OverdraftException(String message,double deficit) {
         super(message);
         this.deficit = deficit;
     }
    public double getDeficit() {
        return deficit;
    }
}
