package webelementwithdataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ListWebElementExample{
    /*this code is hwo to bring all the web element choces in web app*/
    @Test
    public void testList() throws InterruptedException {
        WebDriver driver=new EdgeDriver();

        driver.get("https://scaledupit.com/test3.html");
        driver.manage().window().maximize();

        List<WebElement> le=driver.findElements(By.xpath("//div[@id='radio-btn-example']//label/input"));
        /*this path is for the cercle button*/
        for (WebElement e:le){
            if (e.getAttribute("value"/*this is attributtes comes from honda path*/)
                    .equalsIgnoreCase("honda")){
                e.click();
            }
        }
        Thread.sleep(3000);






    }








}
