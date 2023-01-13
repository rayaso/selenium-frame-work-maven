package dataproviderexelWithColumnsAndRows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ExelWithDataProviderTest {


    @Test(dataProvider = "Excel Data Provider",dataProviderClass = ExelWithDataProvider.class)/*in
    this methode, that data that we bring in method one in exelwithdataprovider class we
     impliment it in this website to test it*/

    public  void  testOne(String username,String password/*this 2 parameters is the number of columns that
    we have in our exel sheet,if we have more colomn than we have to add parameters*/)
            throws InterruptedException{

        if (!(username == null) && !(password == null))/*this code is to skip null that we got when we changed
        row number starting from 1 in our exelreader class;(it was password and username,when did
        that change become null for both*/



        {
            WebDriver driver = new EdgeDriver();
            driver.get("https://scaledupit.com/test2.html");
            driver.manage().window().maximize();/*to avoid those 3 lines ,we have just to extend basesetup*/
            driver.findElement(By.id("userm")).sendKeys(username);
            driver.findElement(By.id("passm")).sendKeys(password);
            driver.findElement(By.id("sone")).click();
            Thread.sleep(5000);
driver.quit();
        }


    }








}
