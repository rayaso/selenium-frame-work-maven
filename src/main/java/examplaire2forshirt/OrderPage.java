package examplaire2forshirt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends SetupDress{


    @FindBy(xpath = "//li[@data-id='billing_email']")
    WebElement text;


    public OrderPage() {
        PageFactory.initElements(driver, this);
    }

    public String result() {

        return new String(String.valueOf(text));
    }




}
