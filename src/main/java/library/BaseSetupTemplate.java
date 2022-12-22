package library;

import config.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.w3c.dom.Text;

public class BaseSetupTemplate extends Configuration {

    public static WebDriver driver;


    @BeforeTest
    public static void startBrowser(@Optional("Edge") String browser,String url) {/*this code is if i
    did not chose the web browser so by default it shoose edge*/

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

    public String getTextInsideElement(WebElement element) {

        String text = element.getText();
        if (text.equals("")) {
            text = element.getAttribute("innerHTML");/*inner html provide the value of element(shirt)



             */
        }


        return text;
    }

}
