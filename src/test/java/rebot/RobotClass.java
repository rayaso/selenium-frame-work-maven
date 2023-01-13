package rebot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {

    //FOR EXEMPLE IF I NEED TO CLOSE MY BROWSERS WINDOWS I CAN PASS THISE ROBOT COMMAND
    @Test
    public void robotTest() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        Thread.sleep(3000);
        driver.get("https://www.nike.com/");
        driver.manage().window().maximize();



        //with rebot we have to do try/catch cause usually throws exeption

try {
    Robot r=new Robot();

    //if you press a key with rebot class you have to release it.
    r.keyPress(KeyEvent.VK_ALT);
    r.keyPress(KeyEvent.VK_F4);
    r.keyPress(KeyEvent.VK_ALT);
    r.keyPress(KeyEvent.VK_F4);
    Thread.sleep(3000);

}catch (AWTException e){
    e.getMessage();
}

    }







}
