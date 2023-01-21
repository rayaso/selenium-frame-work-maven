package test_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait {

    WebDriver driver;

    @Test
    public void testWait() {
        driver = new EdgeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        //explicit wait 1st type:
       WebDriverWait WAIT=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement cart =driver.findElement(By.id("nav-cart-count-container"));//cart of amazon.com
        WAIT.until(ExpectedConditions.elementToBeClickable(cart) );/*will only wait for the specofic
        element wish is mentioned soraya.we specifyed wich element,it is the oposit of implicit wait
        wich gonna look for evry driver element
        cart.click();



        /*explicit wait 2nd type:we have to click manually for the element while is testing
        in case we can not see the element in home page,exemple amazon create acount
         we have first click in sign up element in home page than selenium can test create account because
         now ti is visible for him  wich is inside sign up*/
       // WebDriverWait WAIT = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signupButton = WAIT.until(ExpectedConditions.visibilityOfElementLocated(By.id("createAccountSubmit")));
        signupButton.click();


        driver.close();


    }


}
