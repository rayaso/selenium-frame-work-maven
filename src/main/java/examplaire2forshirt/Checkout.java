package examplaire2forshirt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends SetupDress{

    @FindBy(xpath = "//div[@class='wc-proceed-to-checkout']//a")
    WebElement proceedToCheckout ;

    public Checkout() {
        PageFactory.initElements(driver, this);
    }


    public CheckoutNew clickOnPTC(){
        proceedToCheckout.click();
        return new CheckoutNew();
    }


}



