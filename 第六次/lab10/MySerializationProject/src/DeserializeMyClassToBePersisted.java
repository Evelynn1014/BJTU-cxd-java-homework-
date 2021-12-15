//20301107 Liu Jiayao 2021.4.14

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;

//Write DeserializeMyClassToBePersisted.java which read the serialized file and deserialize it into instance of MyClassToBePersisted class in its main method.
public class DeserializeMyClassToBePersisted {
    public static void main(String[] args) {
        String filename = "class.ser";
        if(args.length > 0) {
            filename = args[0];
        }
        // Deserialize the previously saved
        // PersistentTime object instance.
        MyClassToBePersisted  classToBePersisted = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            classToBePersisted = (MyClassToBePersisted) in.readObject();
            in.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        } catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        // print out restored time
        System.out.println();

        // print out the current time
        classToBePersisted.out();
    }

}

