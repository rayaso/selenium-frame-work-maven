package examplaire2forshirt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultHomePage extends SetupDress {

    @FindBy(xpath = "//h1[@class='f']//span")
    WebElement searchedWord;
    @FindBy(xpath = "//div[@class='post-thumb']//a//img")
    WebElement clickOnImage;



    public ResultHomePage() {
        PageFactory.initElements(driver, this);
    }


   /* public String getSearchWord(){

        return new String(String.valueOf(searchedWord));
    }*/
public void verifyShirtWord(){
    clickOnImage.isDisplayed();
}


public ProductPage ClickOnShirtProduct(){
    clickOnImage.click();
    return new ProductPage();
}




}
