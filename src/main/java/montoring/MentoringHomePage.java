package montoring;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentoringHomePage extends MentoringBaseSetup{

    @FindBy(xpath = "//input[@class='wp-block-search__input wp-block-search__input ']")
   private WebElement searchBox;
    @FindBy(xpath = "//button[@class='wp-block-search__button has-icon wp-element-button']")private WebElement searchIcon;



    public MentoringHomePage(){
        PageFactory.initElements(driver,this);
    }

public void enterSearchTerm(String ITEM){
    searchBox.sendKeys(ITEM);
}


public  void clickOnSearIcon(){
        searchIcon.click();
}


public MentoringResultPage doSearch(String ITEM){
        enterSearchTerm(ITEM);
        clickOnSearIcon();
        return new MentoringResultPage();
}




}
