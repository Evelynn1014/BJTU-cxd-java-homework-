//20301107 Liu jiayao 2020.4.14
import java.io.*;
//Use either ChangeToUpperCaseInputStream class or ChangeToUpperCaseOutputStream class to convert the characters read to upper case.
public class FilterInputOutputStream {

    public static void main(String[] args) throws IOException {

        Adler32 inChecker = new Adler32();
        Adler32 outChecker = new Adler32();
         ChangeToUpperCaseInputStream in = null;
        ChangeToUpperCaseOutputStream out = null;

        try {
            in = new   ChangeToUpperCaseInputStream(
                    new FileInputStream("farrago.txt"),
                    inChecker);
            out = new ChangeToUpperCaseOutputStream(
                    new FileOutputStream("outagain.txt"),
                    outChecker);
        } catch (FileNotFoundException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        } catch (IOException e) {
            System.err.println("CheckedIOTest: " + e);
            System.exit(-1);
        }

        int c;

        while ((c = in.read()) != -1)
            out.write(c);

        System.out.println("Input stream check sum: " +
                inChecker.getValue());
        System.out.println("Output stream check sum: " +
                outChecker.getValue());

        in.close();
        out.close();
    }
}