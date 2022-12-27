package pagelibrary;

import library.AmazonBaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonBox extends AmazonBaseSetup {

    @FindBy(xpath = "//div[@class='nav-sprite nav-progressive-attribute']")
    WebElement clickBox;

    @FindBy(xpath = "//span[@class='a-button a-button-primary a-button-span12']")WebElement clickSign;


    public AmazonBox() {
        PageFactory.initElements(driver,this);}

        public TestResultAmazonBox clickOnAmazonBox() {
            clickBox.click();
            return null;
        }

    public TestResultAmazonBox clickOnSign() {
       clickSign.click();
      return null;
    }}






