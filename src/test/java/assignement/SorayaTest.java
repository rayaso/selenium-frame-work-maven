package assignement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SorayaTest {
    @Test(dataProvider = "Excel Soraya Data Provider",dataProviderClass = SorayaExelWithDataProvider.class)

    public  void  test(String firstName,String lastName)

            throws InterruptedException {

        if (!(firstName == null) && !(lastName == null)) {

            WebDriver driver = new EdgeDriver();
            driver.get("https://scaledupit.com/test2.html");
            driver.manage().window().maximize();
            driver.findElement(By.id("userm")).sendKeys(firstName);
            driver.findElement(By.id("passm")).sendKeys(lastName);
            driver.findElement(By.id("sone")).click();

            Thread.sleep(3000);
            driver.quit();




        }







    }}