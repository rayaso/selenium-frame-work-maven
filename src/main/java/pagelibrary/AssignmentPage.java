package pagelibrary;

import library.BaseSetupAss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPage extends BaseSetupAss {


    @FindBy(xpath = "//input[@type='text'and@id='userm']")
    WebElement enterFirstName;

    @FindBy(xpath = "//input[@type='text'and@id='passm']")
    WebElement enterLastName;


    @FindBy(xpath = "//input[@type='button'and@onclick='userNpass()']")
    WebElement clickOnSubmit;

    public AssignmentPage() {
        PageFactory.initElements(driver, this);
    }

    public void writeFirstName(String firstName) {
        enterFirstName.sendKeys(firstName);
    }


    public void writeLastName (String LastName) {
        enterLastName.sendKeys(LastName);
    }

    public void clickOnSubmitButton() {
        clickOnSubmit.click();
    }


    public AssignmentPageResult clickOn (String resultWord){
        writeFirstName("soraya");
        writeLastName("sora");
        clickOnSubmitButton();
        return new AssignmentPageResult();
    }




}
