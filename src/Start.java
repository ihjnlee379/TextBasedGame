import java.io.File;

public class Start {
    private static boolean isPlayerCreated;
    private static final String gameName = "game";
    private static final String mainPath = "." + gameName;
    private static final String dataDirPath = mainPath + "\\data";
    private static final String saveDirPath = mainPath + "\\save";
    private static final String isPlayerCreatedPath = dataDirPath + "\\isPlayerCreated.ser";

    public static void main(String[] args) {
        createDir();
        while(true) {
            File dir = new File(isPlayerCreatedPath);
            if(dir.exists()) {
                isPlayerCreated = (boolean) Serial.loadObject(isPlayerCreatedPath);
                if(isPlayerCreated) {
                    //기본 정보 불러오기
                    break;
                }
            }
            //플레이어 생성하기
            isPlayerCreated = true;
            Serial.saveObject(isPlayerCreated, isPlayerCreatedPath);
            break;
        }
    }

    private static void createDir() {
        createDirHelper(mainPath);
        createDirHelper(dataDirPath);
        createDirHelper(saveDirPath);
    }

    private static void createDirHelper(String path) {
        File dir = new File(path);
        if(!dir.isDirectory()) {
            dir.mkdir();
        }
    }
}
