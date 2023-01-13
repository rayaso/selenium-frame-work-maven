package examplaire2forshirt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagelibrary.SearchResultPage;

public class HomePageDress extends SetupDress {


    @FindBy(xpath = "//input[@id='wp-block-search__input-1']")
    private WebElement searchInput;


    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")
    private WebElement searchButton;


    public HomePageDress() {
        PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm) {
        searchInput.sendKeys(searchTerm);
    }


    public void clickOnSearchButton() {
        searchButton.click();
    }


    public ResultHomePage doSearch(String searchTerm) {
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new ResultHomePage();
    }


}









