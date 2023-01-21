package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigCart {




        public static Properties prop;
        String path = System.getProperty("user.dir") + File.separator + "src"
                + File.separator + "main" + File.separator
                + "resources" + File.separator + "prop.properties";


        public ConfigCart() {
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





}
