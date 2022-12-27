package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRegister {

    public static Properties prop;
    String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
            + "resources" + File.separator + "prop.properties.soraya";


    public ConfigRegister() {
        prop = new Properties();

        try {
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getUrl() {
        String url = prop.getProperty("url");

        if (url != null) {
            return url;

        } else {
            throw new RuntimeException("url key has no value");
        }
    }


    public static String writePassword() {
        String password = prop.getProperty("password");

        if (password != null) {
            return password;

        } else {
            throw new RuntimeException("password key has no value");
        }
    }

    public static String enterEmail() {
        String email = prop.getProperty("email");

        if (email != null) {
            return email;

        } else {
            throw new RuntimeException("email key has no value");
        }
    }


}




