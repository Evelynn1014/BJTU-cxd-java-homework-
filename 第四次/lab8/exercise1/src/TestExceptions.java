//20301107 Jiayao Liu 2021.3.27
public class TestExceptions {
    public static void main(String[] args) {
        //use try ... catch
        try {
            for ( int i = 0; true; i++ ) {
                System.out.println("args[" + i + "] is '" + args[i] + "'");
            }
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.printf("Exception caught:  %s\nQuiting...", arrayIndexOutOfBoundsException);
        }

    }
}