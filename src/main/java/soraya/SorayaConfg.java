package soraya;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SorayaConfg {
    public static Properties prop;
    String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
            + "resources" + File.separator + "prop.properties";


    public SorayaConfg() {
        prop = new Properties();
        try {
            FileInputStream Url = new FileInputStream(path);
            prop.load(Url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public  static String getUrl(){
        String Url=prop.getProperty("Url");
        if (Url!=null){
            return Url;
        }else {
            throw new RuntimeException("URL KEY HAS NO VALUE");
        }
}

}