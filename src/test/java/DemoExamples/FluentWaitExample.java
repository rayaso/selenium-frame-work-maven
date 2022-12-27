package test_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {
@Test
    public  void testWait(){
    WebDriver driverSoraya=new EdgeDriver();
    driverSoraya.get("https://amazon.com");
   // driver.manage().window().maximize();

    FluentWait<WebDriver> soraya=new FluentWait<>(driverSoraya)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoring(NoSuchElementException.class);

    WebElement createAccount=soraya.until(new Function<WebDriver, WebElement>() {
        @Override//IF YOU INPLEMENT AN INTERFACE YOU HAVE TO OVERIDE TE METHODE
        public WebElement apply(WebDriver driverSora) {
            WebElement findElement=driverSora.findElement(By.id("auth-create-account-link"));

            return findElement;
        }
    });
    createAccount.click();
    driverSoraya.close();

}





}
