package switchwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchToTab {

    //tab it is a multiple window in the same window website

    WebDriver driver=new EdgeDriver();
    public void switchToTab(){
        String mainTab=driver.getWindowHandle();//main tab the first window open
        Set<String> openWindows=driver.getWindowHandles();
        for (String window:openWindows){
            if (!window.equals(mainTab)){
                driver.switchTo().window(window);
            }
        }
    }


    @Test
    public void switchTabTest() throws InterruptedException {
        driver.get("https://scaledupit.com/test3.html");
        driver.manage().window().maximize();

        //open window
        driver.findElement(By.id("opentab")).click();

        switchToTab();
Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"Amazon.com. Spend less. Smile more.");
    }








}
