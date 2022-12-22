package TestHomePage;

import library.BaseSetupTemplate;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagelibrary.HomePage;
import pagelibrary.SearchResultPage;

public class TestSearch extends BaseSetupTemplate {
    @Test
    public void testSearchFunction() throws InterruptedException {

        HomePage home = new HomePage();

        Thread.sleep(3000);

       SearchResultPage resultPage= home.doSearch("shirt");

      Thread.sleep(3000);

        Assert.assertEquals(resultPage.getSearchTerm(),"shirt");

        Thread.sleep(3000);
    }


}
