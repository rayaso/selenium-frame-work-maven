package pagelibrary;

import library.SetupAcc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acc2 extends SetupAcc {

    @FindBy(xpath = "//input[@type='email']")
    WebElement enterEmail;
    @FindBy(xpath = "//span[@class='woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide']//input")
    WebElement enterPassword;
    @FindBy(xpath = "//p[@class='woocommerce-form-row form-row']//button")
    WebElement clickRegister;

    public Acc2() {
        PageFactory.initElements(driver, this);
    }


    public void enterEmail(String email) {
        enterEmail.sendKeys(email);


    }

    public void enterPassword(String password) {
        enterPassword.sendKeys(password);

    }


    public void clickOnRegisterButton() {
        clickRegister.click();
    }


    public Acc2Result doClick(String resultMessage){
      enterEmail("Email");
        enterPassword("password");
        clickOnRegisterButton();

        return new Acc2Result();
    }





}
