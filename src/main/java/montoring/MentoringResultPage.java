package montoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentoringResultPage extends MentoringBaseSetup{

    @FindBy(xpath = "//main[@class='site-main']//h1//span")
   private WebDriver searchedItem;

    public MentoringResultPage(){
        PageFactory.initElements(driver,this);
    }

public String getSearchedItem(String searchedItem){
        String TEXT=searchedItem;
        return TEXT;
}

}
