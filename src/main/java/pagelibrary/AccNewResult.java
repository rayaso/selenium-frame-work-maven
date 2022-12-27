package pagelibrary;

import library.SetupAcc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccNewResult extends SetupAcc {

    @FindBy(xpath ="//ul[@class='woocommerce-error']//li")
    WebElement resultTerm;

    public AccNewResult(){
        PageFactory.initElements(driver,this);
    }


    public String resultClickedRegister(){
        return resultMsg(resultTerm);
    }








}
