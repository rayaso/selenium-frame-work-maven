package mentoring;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagelibrary.SearchResultPage;

public class MontHomePage extends MontBaseSetup{

    @FindBy(xpath = "//input[@id='wp-block-search__input-1']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")
    private WebElement searchButton;




    public MontHomePage() {
        PageFactory.initElements(driver,this);
    }

    public void enterSearchTerm(String item) {
        searchInput.sendKeys(item);
    }


    public void clickOnSearchButton() {
        searchButton.click();
    }


    public void Search(String item) {
        enterSearchTerm(item);
        clickOnSearchButton();

    }

}









