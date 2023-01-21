package pagelibrary;

import library.BaseSetupTemplateWithWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BaseSetupTemplateWithWait {
    @FindBy(xpath ="//main[@id='main']//h1/span")
   private WebElement searchedTerm;
    public SearchResultPage(){
        PageFactory.initElements(driver,this);
    }


public String getSearchTerm(){
 return getTextInsideElement(searchedTerm);/*in this page iam not doing actionc(clicking or sending
 keys)iam just returning (shirt)witch is a text witch is declared in base setup class thats all
 evry single time iam returning just text i have to use that methode with inner html that all
 baseclly with this methode iam ending my testing */
}




}
