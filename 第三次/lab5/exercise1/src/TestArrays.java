//20301107 刘佳垚 2021.3.19
public class TestArrays {

    public static void printArray(int[] array) {
        System.out.print('<');
        for (int i = 0; i < array.length; i++) {
            // print an element
            System.out.print(array[i]);
            // print a comma delimiter if not the last element
            if ((i + 1) < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print(">\n");

    }

    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3, 5, 7, 11, 13, 19};
        int[] array2;
        TestArrays.printArray(array1);

        array2 = array1;
        //sign the array2 variable equal to the array1. Modify the even indexed element in array2 to be equal to the index value
        for (int i = 0; i <= array1.length; i += 2) {
            array1[i] = i;
        }
        TestArrays.printArray(array1);//test

        //Declare a variable called matrix with the type of int[][]
        int[][] matrix = new int[5][5];
        // Loop through the matrix from zero to its length; let's say that this index is i.
        // On each iteration assign matrix[i] to a new array of integers the size of which is i.
        for (int i = 0; i < 5; i++) {
            matrix[i] = new int[i];
            // On each inner iteration assign matrix[i][j] to the value of i * j.
            for (int j = 0; j < i; j++) {
                matrix[i][j] = i * j;
            }
            //test
            TestArrays.printArray(matrix[i]);
        }
    }
}

