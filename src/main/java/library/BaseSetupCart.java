package library;

import config.ConfigCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class BaseSetupCart extends ConfigCart {

    public static WebDriver driver;


    @BeforeTest
    public static void startBrowser(@Optional("Edge") String browser, String url) {


        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://automation.scaledupit.com");//link of the page web
    }

        @AfterTest
        public static void closeUp() {
            if (driver instanceof EdgeDriver) {
                driver.quit();
            } else {
                driver.close();
            }
        }


    public String TestResultCart(WebElement element) {

        String text = element.getText();
        if (text.equals("")) {
            text = element.getAttribute("innerHTML");





    }
    return text;

    }}
