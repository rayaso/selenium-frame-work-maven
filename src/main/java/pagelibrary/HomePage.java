package pagelibrary;

import library.BaseSetupTemplate;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*the purpose of this page is to do search witch is the last declared methode*/
public class HomePage extends BaseSetupTemplate {
    //page object model with page factory


    //those two methode are a page factory methodes:
    @FindBy(xpath = "//input[@id='wp-block-search__input-1']")
    WebElement searchInput;


    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")
    WebElement searchButton;



    public HomePage() {//this is the constractor of homepage
        PageFactory.initElements(driver,this);
    }/*page object model with page factory we need to call driver,,with the key word find by in the previous
    methode we have to do initelement so that whey we have to call page factory*/

    public void enterSearchTerm(String searchTerm) {
        searchInput.sendKeys(searchTerm);
    }


    public void clickOnSearchButton() {
        searchButton.click();
    }

/*the whole job in this page based in this last methode(todosearch),to get this methode we have to
combine e previous methodes because to do search we have to do first entersearchterme and than
clickonsearcchbutton*/

    public  SearchResultPage doSearch(String searchTerm) {
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new SearchResultPage();
    }


}
