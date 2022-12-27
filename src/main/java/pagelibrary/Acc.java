package pagelibrary;

import library.SetupAcc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acc extends SetupAcc {

    @FindBy(xpath = "//a[@class='my-account']")
    WebElement clickAcc;


    public Acc() {
        PageFactory.initElements(driver,this);}



    public AccResult clickOnAccButton() {
        clickAcc.click();
        return null;
    }




}
