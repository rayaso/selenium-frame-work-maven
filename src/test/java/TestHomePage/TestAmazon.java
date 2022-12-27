package TestHomePage;

import library.AmazonBaseSetup;
import org.testng.annotations.Test;
import pagelibrary.AmazonBox;

import pagelibrary.TestResultAmazonBox;

public class TestAmazon extends AmazonBaseSetup {
    @Test
    public void testAmazonBoxS() throws InterruptedException {

        AmazonBox amazon = new AmazonBox();

        Thread.sleep(3000);
        TestResultAmazonBox resultAmazonBox = amazon.clickOnAmazonBox();
        Thread.sleep(3000);
        TestResultAmazonBox sonia = amazon.clickOnSign();
        Thread.sleep(3000);
         // Assert.assertEquals(resultAmazonBox.getClickedOnBox(),"text");

    }
}
