package pagelibrary;

import library.BaseSetupCart;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestResultCart extends BaseSetupCart {
    @FindBy(xpath = " //h1[@class='entry-title']")
    WebElement clickedOnCart;

    public TestResultCart(WebElement clickedOnCart) {
        PageFactory.initElements(driver, this);
    }

    public String getClickedOnCart() {
        return  TestResultCart(clickedOnCart);
    }
}
