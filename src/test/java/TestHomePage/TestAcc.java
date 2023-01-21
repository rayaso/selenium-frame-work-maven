package TestHomePage;

import library.SetupAcc;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.Acc;
import pagelibrary.AccNew;
import pagelibrary.AccNewResult;
import pagelibrary.AccResult;

public class TestAcc extends SetupAcc {


    @Test
    public void TestAcc() throws InterruptedException {

        Acc AccountClick = new Acc();

        Thread.sleep(5000);
        AccResult Click=AccountClick.clickOnAccButton();
        Thread.sleep(5000);
        AccNew RegisterClick=new AccNew();
        Thread.sleep(5000);
        AccNewResult register=RegisterClick.doClick("text");
        Thread.sleep(5000);
       //Assert.assertEquals(register.resultClickedRegister(),"resultTerm");
/*AccNewResult SS=RegisterClick.enterEmail("email");
        Thread.sleep(3000);
AccNewResult FF=RegisterClick.enterPassword("password");
        Thread.sleep(3000);
AccNewResult dd=RegisterClick.clickOnRegisterButton();
        Thread.sleep(3000);*/


     //AccResult sonia=Account.doSearch("email","password");








}}
