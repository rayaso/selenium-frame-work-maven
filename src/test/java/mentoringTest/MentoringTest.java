package mentoringTest;

import com.beust.ah.A;
import montoring.MentoringBaseSetup;
import montoring.MentoringHomePage;
import montoring.MentoringResultPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MentoringTest extends MentoringBaseSetup {


    @Test
    public void testSearchFunctions() throws InterruptedException {


        MentoringHomePage test = new MentoringHomePage();

        MentoringResultPage resultPage = test.doSearch("bag");

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
       Assert.assertEquals(resultPage.getSearchedItem("bag"),"bag");



//Assert.assertEquals(driver.getTitle(),"Search Results for “bag” – Automation");


    }


}
