package TestHomePage;

import library.BaseSetupAss;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.AssignmentPage;
import pagelibrary.AssignmentPageResult;

public class TestAssignment extends BaseSetupAss {
    @Test
    public void TestAssignment() throws InterruptedException {

    AssignmentPage soraya=new AssignmentPage();
     Thread.sleep(3000);

        AssignmentPageResult sonia=soraya.clickOn("word");

        Thread.sleep(3000);

        Assert.assertEquals(sonia.resultClickedSubmit(),"soraya");

        Thread.sleep(3000);
    }

}
