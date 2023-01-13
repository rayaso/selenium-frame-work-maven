package DemoExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ListWebElementExample {
    @Test
    public void testList(){/*to avoid those 3 lines of code we can just extends basesetup class cause
    we callled driver in that class*/

        WebDriver driver=new EdgeDriver();
        driver.get("https://scaledupit.com/test3.html");
        driver.manage().window().maximize();


        List<WebElement> le=driver.findElements(By.xpath("//div[@id='radio-btn-example']//label/input"));

for(WebElement E:le){
    if(E.getAttribute("value").equalsIgnoreCase("honda"));
    E.click();
}


    }





}
