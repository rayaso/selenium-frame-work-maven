package pagelibrary;

import library.AmazonBaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TestResultAmazonBox extends AmazonBaseSetup {

    @FindBy(xpath = "// h4[class='a-popover-header-content']")
    WebElement clickedOnBox;

    public TestResultAmazonBox(WebElement clickedOnBox) {
        PageFactory.initElements(driver, this);
    }


    public TestResultAmazonBox getClickedOnBox() {
        return new TestResultAmazonBox(clickedOnBox);
    }


}