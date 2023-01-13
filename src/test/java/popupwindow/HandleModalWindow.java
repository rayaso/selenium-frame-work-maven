package popupwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleModalWindow {

    WebDriver driver=new ChromeDriver();

    @Test

    public void modalExample() throws InterruptedException {
        driver.get("https://scaledupit.com/test2.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("one")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("close")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("userm")).sendKeys("soraya");
        Thread.sleep(3000);
    }


@Test

    public void modalExampleTwo() throws InterruptedException {
        driver.get("https://scaledupit.com/test3.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(3000);
    WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    Wait.until(ExpectedConditions.alertIsPresent());
    String alertTxt =driver.switchTo().alert().getText();
        System.out.println(alertTxt);

        driver.switchTo().alert().accept();
    }



@Test
    public void modalWindowWithGoogle() throws InterruptedException {
        driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    WebElement xFrame=driver.findElement(By.xpath("//iframe[@name='callout']"));
   driver.switchTo().frame(xFrame);
    WebElement signInPop=driver.findElement(By.xpath("//button[@aria-label='No thanks']"));
    signInPop.click();
    Thread.sleep(3000);



}



}
