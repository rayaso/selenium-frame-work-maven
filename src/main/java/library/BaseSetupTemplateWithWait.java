package library;

import config.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BaseSetupTemplateWithWait extends Configuration {

    public static WebDriver driver;
    public static WebDriverWait wait;/*we can use this wait in other class under methodes
     by writing [wait.]because all other classes extends basesetup*/




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
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().window().maximize();
        driver.get(getUrl());//link of the page web


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
        wait.until(ExpectedConditions.visibilityOf(element));/*we can use it in any methode we want
        innside this class because we declared in class level*/

        if (text.equals("")) {
            text = element.getAttribute("innerHTML");/*inner html provide the value of element(shirt)



             */
        }


        return text;
    }

    //we are implementing robot in our maven project

    //we usually have to add try/catch with robot class,and call release

    public void robotActions(int first,int second){
        try{
            Robot robot=new Robot();

            robot.keyPress(first);
            robot.keyPress(second);

            robot.keyRelease(first);
            robot.keyRelease(second);
        }catch(AWTException e){
            throw new RuntimeException(e);
        }
    }

}
