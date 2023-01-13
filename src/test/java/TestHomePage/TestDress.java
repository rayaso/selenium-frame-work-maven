package TestHomePage;

import examplaire2forshirt.*;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

public class TestDress extends SetupDress {

    @Test
    public void testSearchFunction() throws InterruptedException {

        HomePageDress home = new HomePageDress();

        Thread.sleep(3000);

        ResultHomePage resultPageSoraya = home.doSearch("shirt");
        Thread.sleep(3000);
resultPageSoraya.ClickOnShirtProduct();
        Thread.sleep(3000);
        /*Assert.assertEquals(resultPageSoraya.getDress(),"shirt");

        Thread.sleep(3000);*/

ProductPage HH=new ProductPage();
        Thread.sleep(3000);
HH.clickOnAddToCart();
        Thread.sleep(3000);
HH.clickOnCartIcon();
        Thread.sleep(3000);
        Checkout GG=new Checkout();
        Thread.sleep(3000);
        GG.clickOnPTC();
        Thread.sleep(3000);
        CheckoutNew KK=new CheckoutNew();
        Thread.sleep(3000);
        KK.setEnterFirstName("soraya");
        Thread.sleep(3000);
        KK.ClickOnPlaceOrder();
        Thread.sleep(3000);
    }}
