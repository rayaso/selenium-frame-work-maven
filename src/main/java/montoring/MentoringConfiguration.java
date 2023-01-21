package montoring;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MentoringConfiguration {


    public static Properties prop;
    String path = System.getProperty("user.dir") + /*File.separator + "C:" + File.separator + "Users" + File.separator
            + "soray" + File.separator + "mymavenproject" +*/ File.separator + "src" + File.separator + "main" +
            File.separator + "resources" + File.separator + "prop.properties";


    public MentoringConfiguration() {
        prop = new Properties();
        try {
            FileInputStream Url = new FileInputStream(path);
            prop.load(Url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getUrl() {
        String Url = prop.getProperty("Url");
        if (Url != null) {
            return Url;
        } else {
            throw new RuntimeException("url key has not value");
        }
    }


}
