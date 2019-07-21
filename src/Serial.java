import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
// need to change later

class Serial {
    public static void saveStagingArea(HashMap<String, String> obj, String path) {
        File outFile = new File(path);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outFile));
            out.writeObject(obj);
            out.close();
        } catch (IOException e) {

        }
    }

    public static HashMap<String, String> loadStagingArea(String path) {
        HashMap<String, String> obj = null;
        File inFile = new File(path);
        if (new File(path).exists()) {
            try {
                ObjectInputStream inp = new ObjectInputStream(new FileInputStream(inFile));
                obj = (HashMap<String, String>) inp.readObject();
                inp.close();
            } catch (IOException | ClassNotFoundException e) {

            }
        }
        return obj;
    }

    public static void saveRemoveSet(HashSet<String> obj, String path) {
        File outFile = new File(path);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outFile));
            out.writeObject(obj);
            out.close();
        } catch (IOException e) {

        }
    }

    public static HashSet<String> loadRemoveSet(String path) {
        HashSet<String> obj = null;
        File inFile = new File(path);
        if (new File(path).exists()) {
            try {
                ObjectInputStream inp = new ObjectInputStream(new FileInputStream(inFile));
                obj = (HashSet<String>) inp.readObject();
                inp.close();
            } catch (IOException | ClassNotFoundException e) {

            }
        }
        return obj;
    }
}