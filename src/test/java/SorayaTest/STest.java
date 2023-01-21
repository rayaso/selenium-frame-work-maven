package SorayaTest;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import soraya.SorayaBase;
import soraya.SorayaHome;

import java.time.Duration;

public class STest extends SorayaBase {

    @Test

    public void testSearchInput(){
        SorayaHome home=new SorayaHome();
        home.doSearch("bag");

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        Assert.assertEquals(driver.getTitle(),"Search Results for “bag” – Automation");






    }




}
