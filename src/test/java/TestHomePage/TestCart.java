package TestHomePage;

import library.BaseSetupCart;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.Cart;
import pagelibrary.TestResultCart;

public class TestCart extends BaseSetupCart {

    @Test
    public void testCartButton() throws InterruptedException {
        Cart sonia=new Cart();
        Thread.sleep(3000);
        TestResultCart resultCart=sonia.clickOnCartButton();
        Thread.sleep(3000);
        //Assert.assertEquals(resultCart.getClickedOnCart(),"Cart");
    }









    }
