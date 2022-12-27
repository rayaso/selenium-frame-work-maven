package pagelibrary;

import library.BaseSetupAss;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPageResult extends BaseSetupAss {

    @FindBy(xpath ="//span[@id='display_u']")
    WebElement resultName;

    public AssignmentPageResult(){
        PageFactory.initElements(driver,this);
    }


    public String resultClickedSubmit(){
        return resultMsg(resultName);
    }



}
