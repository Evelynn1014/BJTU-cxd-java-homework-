//20301107 Liu jiayao 2020.4.14

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class DirListing {
    //Create a program called DirListing that takes a command-line argument to specify a directory that you wish to be listed.
    static int fileLevel = 0;

    public static String createPrintStr(String name, int level) {

        String printStr = "\t";

        for (int i = 0; i < level; i++) {
            printStr = printStr + "\t";
        }
        printStr = printStr + "- " + name;
        return printStr;
    }



    public static void readFile(File dir) {
        try{    // build File object


        File[] list = dir.listFiles();

        for (int i = 0; i < list.length; i++) {
            if (list[i].isDirectory()) {
                System.out.println(createPrintStr(list[i].getName(), fileLevel));
                fileLevel++;
                readFile(list[i]);
                fileLevel--;
            }
        }
         }catch (NullPointerException e ){
            System.out.println("ERROR");
        }
    }


    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("argument is null");
            System.exit(0);
        }
        String filename;
//The -verbose switch tells the program to display the size of the file and date last modified; "non-verbose" mode just shows the file name.
        if (args.length == 2) {
            filename = args[1];
            if (args[0].equals("-verbose")) {
                File myDir = new File(filename);
                File[] contents = myDir.listFiles();
                DateFormat df = DateFormat.getDateTimeInstance();

                for (int i = 0; i < contents.length; i++) {
                    if (!contents[i].isDirectory()) {
                        System.out.println(contents[i].getName() + " : \n    "
                                + (contents[i].isDirectory() ? "" : "This is a document" + " which size is " + contents[i].length() + ", modified time: " + df.format(new Date(contents[i].lastModified()))));
                    }
                }
                //The -R switch tells the program to show the directory specified and recursively descend into the sub-directories and display these (with some spacing for indentation).
            } else if (args[0].equals("-R")) {
                System.out.println("- "+filename);
                File dir = new File(filename);
                readFile(dir);

            }
        }

        if (args.length == 3) {
            filename = args[2];
            if (args[0].equals("-R")){
                //DirListing rl = new DirListing();
                System.out.println("- "+filename);
                File dir = new File(filename);
                readFile(dir);

            }
            if (args[1].equals("-verbose")) {
                File myDir = new File(filename);
                File[] contents = myDir.listFiles();
                DateFormat df = DateFormat.getDateTimeInstance();


                for (int i = 0; i < contents.length; i++) {
                    if (!contents[i].isDirectory()) {
                        System.out.println(contents[i].getName() + " : \n    "
                                + (contents[i].isDirectory() ? "" : "This is a document" + " which size is " + contents[i].length() + ", modified time: " + df.format(new Date(contents[i].lastModified()))));
                    }
                }
            }
        }
    }
}
