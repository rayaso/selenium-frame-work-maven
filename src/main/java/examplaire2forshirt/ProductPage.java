package examplaire2forshirt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends SetupDress{

    @FindBy(xpath = "//button[@name='add-to-cart']")
    WebElement addToCart;

    @FindBy(xpath = "//i[@class='fa fa-shopping-cart']")
    WebElement cart;


    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAddToCart() {
        addToCart.click();

    }



    public Checkout clickOnCartIcon() {
        cart.click();
        return new Checkout();
    }}



