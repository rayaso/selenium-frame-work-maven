package DemoExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNGListenerExample {
    WebDriver driver=new EdgeDriver();

    @Test

    public void testAmazon(){
        System.out.println("this is amazon test");

        driver.get("https://amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("blinds");
        driver.quit();
    }
    @Test
    public void testGoogle(){
        System.out.println("this is google");
        driver.get("https://google.com");
        driver.findElement(By.xpath("//div[@class='RNNXgb']")).sendKeys("blinds");
        driver.quit();
    }

}
