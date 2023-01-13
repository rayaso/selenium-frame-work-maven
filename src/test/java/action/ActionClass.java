package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass {
    /*when i hold my mouse in men section in nike .com,there is a menu appears but when i move somewheare
    it goes;we can do a lot of action in this menu with action but just in case we have a web site
    like this thing*/

    @Test
    public void actionEx() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.nike.com/");
        driver.manage().window().maximize();
        WebElement nnf=driver.findElement(By.xpath("//button[@aria-label='New & Featured']"));
        WebElement ms=driver.findElement(By.xpath("//a[@aria-label='main-menu, New & Featured, New For Men, Shoes']"));
        Actions act=new Actions(driver);/*for actions in this side we have to chose new actions directly,not new alone
        and actions alone,it comes togather*/

        act.moveToElement(nnf).build().perform();
        Thread.sleep(3000);
        act.moveToElement(ms).click().build().perform();






    }







}
