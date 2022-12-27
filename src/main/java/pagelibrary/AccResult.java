package pagelibrary;

import library.SetupAcc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccResult extends SetupAcc {

    @FindBy(xpath ="//div[@class='u-column2 col-2']//h2")
    WebElement searchedAcc;

    public AccResult(){
        PageFactory.initElements(driver,this);
    }

    public String getSearchTerm(){
        return getTextRegister(searchedAcc);
    }


}




