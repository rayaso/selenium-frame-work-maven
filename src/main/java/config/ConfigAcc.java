package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigAcc {

    public static Properties prop;
    //src//main//resources//prop.properties.soraya(this is the path
    String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
            + "resources" + File.separator + "prop.properties.soraya";

    public ConfigAcc() {

        prop = new Properties();

        try {

            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);


        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static String getUrl() {

        String url = prop.getProperty("url");//getProperty gets the value of the key name you provide

        //to check if the key doesn't have a null value

        if (url != null) {

            return url;

        } else {

            throw new RuntimeException("url key has no value");

        }
    }
}
















