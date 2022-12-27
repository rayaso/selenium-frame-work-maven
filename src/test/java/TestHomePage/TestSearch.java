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

        HomePage home = new HomePage();/*THIS IS AN OBJECT FOR HOMRPAGE CLASS BECAUSE TO DO TEST WE
        HAVE TO CALL ALL METHODE WITCH IS ALREADY DECLARED IN HOMEPAGE CLASS.*/

        Thread.sleep(3000);

       SearchResultPage resultPage= home.doSearch("shirt");

      Thread.sleep(3000);

        Assert.assertEquals(resultPage.getSearchTerm(),"shirt");

        Thread.sleep(3000);
    }


}
