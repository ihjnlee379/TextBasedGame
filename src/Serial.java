import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
// need to change later

class Serial {
    public static void saveObject(Object obj, String path) {
        File outFile = new File(path);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outFile));
            out.writeObject(obj);
            out.close();
        } catch (IOException e) {
            System.out.println("Cannot save");
        }
    }

    public static Object loadObject(String path) {
        Object obj = null;
        File inFile = new File(path);
        if (new File(path).exists()) {
            try {
                ObjectInputStream inp = new ObjectInputStream(new FileInputStream(inFile));
                obj = (Object) inp.readObject();
                inp.close();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Cannot load");
            }
        }
        return obj;
    }
}