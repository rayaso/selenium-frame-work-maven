package examplaire2forshirt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutNew extends SetupDress {

@FindBy(xpath = "//h1[@class='F']")
WebElement ProceedToCheckout;

    @FindBy(xpath = "//p[@class='form-row form-row-first validate-required']//span//input")
    WebElement enterFirstName;
    @FindBy(xpath = "//button[@class='button alt wp-element-button']")
    WebElement placeOrder;
    public CheckoutNew() {
        PageFactory.initElements(driver, this);
    }


    public String clickOnCheckout() {

        return new String(String.valueOf(ProceedToCheckout));
    }

    public void setEnterFirstName(String firstName) {
        enterFirstName.sendKeys(firstName);



}
    public OrderPage ClickOnPlaceOrder(){
        placeOrder.click();
        return new OrderPage();
    }

}