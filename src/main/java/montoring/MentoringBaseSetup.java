package montoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class MentoringBaseSetup extends MentoringConfiguration {

    public static WebDriver driver;
    public static WebDriverWait wait;
      String actualTitle=driver.getTitle();

    @BeforeTest

    public static void startBrowser(@Optional("Edge") String browser, String url) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(getUrl());
    }

        @AfterTest

        public static void closeUp () {
            if (driver instanceof EdgeDriver) {
                driver.quit();
            } else {
                driver.close();
            }
        }


    }



