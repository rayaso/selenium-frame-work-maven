package pagelibrary;

import library.SetupAcc;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccNew extends SetupAcc {

    @FindBy(xpath = "//input[@type='email']")
    WebElement enterEmail;
   @FindBy(xpath = "//input[@type='password'and@autocomplete='new-password']")
    WebElement enterPassword;
   /* @FindBy(xpath = "//span[@class='show-password-input display-password']")
    WebElement showPassword;*/

    @FindBy(xpath = "//button[@value='Register']")
    WebElement clickRegister;

    public AccNew() {
        PageFactory.initElements(driver, this);
    }


    public void enterEmail(String email) {
        enterEmail.sendKeys(email);
    }


   /* public  AccNewResult enterEmail(String email) {
        enterEmail.sendKeys(email);

        return new AccNewResult();
    }*/



    public void enterPassword(String password) {
        enterPassword.sendKeys(password);

    }


   /* public AccNewResult enterPassword(String password) {
        enterPassword.sendKeys(password);
        return new AccNewResult();
    }*/



    public void clickOnRegisterButton() {
        clickRegister.click();
    }
   /* public void clickOnShowPassword() {
        showPassword.click();
    }*/



  /*  public AccNewResult clickOnRegisterButton() {
        clickRegister.click();
        return new AccNewResult();*/


    public AccNewResult/*this is the class result name*/ doClick(String resultMessage){//this method is for the result after performing actions
      enterEmail("sonia.saidani15@gmail.com");
        enterPassword("password");
        //clickOnShowPassword();
        clickOnRegisterButton();
        return new AccNewResult();
    }





}
