//20301107 刘佳垚 2021.3.27
package assertexample;

import javax.swing.*;

class Diamond {

    static void printDiamond(int size) throws MyOwnNegativeValueEnteredException,MyOwnZeroValueEnteredException {
        if (size < 0) {
            //If a user enters a negative value, throw a MyOwnNegativeValueEnteredException, which is an extension of ArithmeticException.
            // The display of the error information should display the negative number that was entered.
            throw new MyOwnNegativeValueEnteredException(size,"You should enter a number > 0 , " + size +" is error");
        } else if (size == 0) {//If a user enters zero, throw a MyOwnZeroValueEnteredException, which is an extension of ArithmeticException.
            throw new MyOwnZeroValueEnteredException("0");
        } else {
            String diamond = "";
            /* print upper triangle */
            for (int r = 1, a = 1; r <= size; r++, a += 2) {
                /* print spaces */
                for (int i = size - r; i >= 1; i--) {
                    diamond += " ";
                }
                /* print *'s */
                for (int j = 1; j <= a; j++) {
                    diamond += "*";
                }
                diamond += "\n";
            }
            /* print lower triangle */
            for (int r = size - 1, a = 2 * (size - 1) - 1; r >= 1; r--, a -= 2) {
                /* print spaces */
                for (int i = size - r; i >= 1; i--) {
                    diamond += " ";
                }
                /* print *'s */
                for (int j = 1; j <= a; j++) {
                    diamond += "*";
                }
                diamond += "\n";
            }
            JOptionPane.showMessageDialog(null, diamond);
            System.out.println(diamond);
        }
    }

    public static void main(String args[]) {
        String strSize;

        // Get the size of the diamond to draw
        strSize = JOptionPane.showInputDialog(null, "Enter diamond size:");
        int size = Integer.parseInt(strSize);

        // Assert that the value entered is greater than 0, otherwise,
        // it will generate AssertionError exception.
        try {
            printDiamond(size);
        } catch (MyOwnNegativeValueEnteredException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch (MyOwnZeroValueEnteredException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.exit(0);
    }
}