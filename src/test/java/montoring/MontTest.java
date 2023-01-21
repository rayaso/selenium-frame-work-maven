package montoring;

import datamodelExelWithRowsHashmap.DataModelExample;
import mentoring.MontBaseSetup;
import mentoring.MontHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.HomePage;
import pagelibrary.SearchResultPage;

import java.time.Duration;

public class MontTest extends MontBaseSetup {

    @Test
    public void testSearchFunction() throws InterruptedException {

        MontHomePage home = new MontHomePage();

        home.Search("bag");


        wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        Assert.assertEquals(driver.getTitle(), "Search Results for “bag” – Automation");

    }


}
