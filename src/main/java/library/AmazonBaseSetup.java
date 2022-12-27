package library;

import config.ConfigAmazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

public class AmazonBaseSetup extends ConfigAmazon {

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
        driver.get("https://www.amazon.com/");


    }


    @AfterTest
    public static void closeUp() {
        if (driver instanceof EdgeDriver) {
            driver.quit();
        } else {
            driver.close();
        }
    }

   /* public String chooseYourLocation(WebElement element) {

        String text = element.getText();
        if (text.equals("")) {
            text = element.getAttribute("innerHTML");
this methode used just in case we whrite a text in our methodes for exemple enter string shirt
otherwise we do note need this in case we are not whriting in a box something

        }


        return text;
    }*/

}












