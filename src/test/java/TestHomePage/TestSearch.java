package TestHomePage;

import datamodelExelWithRowsHashmap.DataModelExample;
import library.BaseSetupTemplateWithWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.HomePage;
import pagelibrary.SearchResultPage;

public class TestSearch extends BaseSetupTemplateWithWait {
    @Test
    public void testSearchFunction() throws InterruptedException {

        HomePage home = new HomePage();/*THIS IS AN OBJECT FOR HOMRPAGE CLASS BECAUSE TO DO TEST WE
        HAVE TO CALL ALL METHODE WITCH IS ALREADY DECLARED IN HOMEPAGE CLASS.*/

        Thread.sleep(3000);

       SearchResultPage resultPage= home.doSearch("shirt");

      Thread.sleep(3000);

        Assert.assertEquals(resultPage.getSearchTerm(),"shirt");

        Thread.sleep(3000);
        home.performAction();//i implement this methode witch is declared in homepage
        Thread.sleep(3000);

        DataModelExample obj=new DataModelExample();
        /*obj.readXl("C:\\Users\\soray\\OneDrive\\Documents\\datamodel.xlsx").we implimented this methode
        here */
    }


}
