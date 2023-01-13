package DemoExamples;

import listeners.DriverListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ListenerExample {
    @Test
    public void testListeners(){
        WebDriver driver=new EdgeDriver();
        EventFiringWebDriver eventDriver=new EventFiringWebDriver(driver);
        DriverListeners listeners=new DriverListeners();
        eventDriver.register(listeners);
        eventDriver.get("https://google.com");
        eventDriver.findElement(By.xpath("//div[@class='RNNXgb']"))/*thi
         is a path of an element in googl(search box)*/.sendKeys("HELLO");
        eventDriver.close();
        eventDriver.quit();
    }





}
