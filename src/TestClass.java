import java.io.File;
import java.io.Serializable;
import java.util.HashMap;

public class TestClass implements Serializable {
    private HashMap<String, Integer> save;

    TestClass() {
        save = new HashMap<>();
    }

    void putElement(String key, int value) {
        save.put(key, value);
    }

    boolean isKeyIn(String key) {
        return save.containsKey(key);
    }
    void save() {
        Serial.saveObject(save,  "src\\save\\test5.ser");
    }

    void load() {
        save = (HashMap<String, Integer>) Serial.loadObject("src\\save\\test5.ser");
    }
}
