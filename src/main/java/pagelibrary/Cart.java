package pagelibrary;

import library.BaseSetupCart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BaseSetupCart {

    @FindBy(xpath = "//div[@class='cart-section']")
    WebElement cartIcon;
    public Cart() {
        PageFactory.initElements(driver,this);}

        public TestResultCart clickOnCartButton() {
            cartIcon.click();
            return null;
        }
}
