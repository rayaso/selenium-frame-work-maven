package popupwindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class IframeExampele {//website inside another website
WebDriver driver=new EdgeDriver();

   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
public void switchToIframe(WebElement frame){
    wait.until(ExpectedConditions.visibilityOf(frame));
    driver.switchTo().frame(frame);
}

public void switchToParentApplication(){
    driver.switchTo().defaultContent();
}
   @Test

    public void iframeExample() throws InterruptedException {//if a web has an iframe we have to identify it first

       driver.get("https://scaledupit.com/test");
       driver.manage().window().maximize();
       WebElement xFrame=driver.findElement(By.xpath("//iframe[@title='Test Iframe']"));

       //we have to use switch methode because the 2 website have evrything the same
       switchToIframe(xFrame);
       driver.findElement(By.id("bmwradio")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("hondaradio")).click();
       switchToParentApplication();
       Thread.sleep(3000);
       driver.switchTo().defaultContent();
       Thread.sleep(3000);
       driver.findElement(By.id("bmwradio")).click();
       Thread.sleep(3000);
   }
}
