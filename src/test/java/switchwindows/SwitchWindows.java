package switchwindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindows {

    //this codes is to focus on the new window

    //window it is completly a new page browser
    WebDriver driver=new EdgeDriver();
    public void switchToWindow(){
        String mainWindow=driver.getWindowHandle();//main tab the first window open
        Set<String> openWindows=driver.getWindowHandles();
        for (String window:openWindows){
            if (!window.equals(mainWindow)){
                driver.switchTo().window(window);
            }
        }
    }


   /* public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        String mainTab=driver.getWindowHandle();
        System.out.println(mainTab);
    }*/


@Test
    public void switchWindowTest(){
    driver.get("https://scaledupit.com/test3.html");
    driver.manage().window().maximize();

    //open window
    driver.findElement(By.id("openwindow")).click();

    //even though focus is on the new window selenium driver is still on the old window
    //we have explicitly tell selenium driver to focus on the new window

    switchToWindow();

    Assert.assertEquals(driver.getTitle(),"Nike. Just Do It. Nike.com");//this the title from inspect
    /*this assert means get the title and than we have to search the title code with inspect,than if get the title
    is the same with expected ,test passed
     */


}





}
