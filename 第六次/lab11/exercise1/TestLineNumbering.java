//203011007 Liu Jiayao 2021.4.14
import java.io.*;
public class TestLineNumbering {
    public static void main(String[] args) {

        try {

            if (args.length == 0) {
                System.out.println("no argument!");
                System.exit(-1);
            }

            String filename = args[0];
            int i = 1;
            //Declare a variable that holds a File object that is initialized from the file named in the first command-line argument.
            File fw = new File(filename);
            //Within a try-catch block, create a buffered, input stream reader based on the System.in stream (standard input).
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //Also, create a print file writer based on the File variable.
            Writer out = new FileWriter(fw);

            System.out.println("please casually enter, enter \"ctrl + C\" into a Separate line to stop the program.\n");
            //Write the while loop that reads each line from the console input stream and prints the line out to the file. Each line should be prepended with the count of the line number.
            String str = br.readLine();
            while (i != -1) {
                out.write(i + " " + str + '\n');
                str = br.readLine();
                out.flush();
                i++;
            }


            //Make sure to close the I/O streams.
            out.close();

        } catch (IOException e) {
            System.out.println("Failed to  create a buffered, input stream reader based on the System.in stream");
        }
    }
}
