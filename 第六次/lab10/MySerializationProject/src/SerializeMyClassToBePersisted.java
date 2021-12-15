//20301107 Liu Jiayao 2021.4.14

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SerializeMyClassToBePersisted {
    public static void main(String[] args) {
        String filename = "class.ser";
        if(args.length > 0) {
            filename = args[0];
        }
        // Create an object
        MyClassToBePersisted classToBePersisted = new MyClassToBePersisted("Forest",18,"eat","BJTU",2020);
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        //Write SerializeMyClassToBePersisted.java which creates an instance of MyClassToBePersisted class and serialize it into a file in its main method.
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(classToBePersisted);
            out.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Current time is saved into " + filename);

    }
}
