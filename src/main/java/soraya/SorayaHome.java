package soraya;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SorayaHome extends SorayaBase{



    @FindBy(xpath = "//input[@class='wp-block-search__input wp-block-search__input ']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")
    private WebElement searchIcon;

    public SorayaHome(){
        PageFactory.initElements(driver,this);
    }

    public void enterSearchTerm(String Item){
        searchInput.sendKeys(Item);
    }


    public void clickOnSearchIcon(){
        searchIcon.click();
    }

    public void doSearch(String Item){
        enterSearchTerm(Item);
        clickOnSearchIcon();
    }
}
