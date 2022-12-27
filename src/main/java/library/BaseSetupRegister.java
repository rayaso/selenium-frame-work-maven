package library;

import config.ConfigRegister;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class BaseSetupRegister extends ConfigRegister {
    public static WebDriver driver;
    @BeforeTest
    public static void startBrowser(@Optional("Edge") String browser, String url,String password,String email) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://automation.scaledupit.com");

    }



    @AfterTest
    public static void closeUp() {
        if (driver instanceof EdgeDriver) {
            driver.quit();
        } else {
            driver.close();
        }
    }












}
