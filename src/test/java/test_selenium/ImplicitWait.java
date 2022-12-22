package test_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    WebDriver driver;

    @Test
    public void testWait() {
       /* String ARG1="GOOF AFTERNOON";
                String ARG2="GOOD MORNING";
        System.out.printf("hello everyone %s %s",ARG1,ARG2);
        THID METHODE USED TO PRINT MULYI ARGUMENT
        it is the same with println
        */

        driver = new EdgeDriver();
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        //implicit wait:it will wait implicitky for each driver action for x amount of srcond,it it
        //does not find the first element it will faild all the test,if he did not find that element
        //he keep searching for it for a certain period of time that you specify

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hello");


        driver.close();


    }


}
