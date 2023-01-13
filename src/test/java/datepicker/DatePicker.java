package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DatePicker {
    /* we want to select a date from a calander where the month is march 2023,date is 29,than click on search*/
/*in this exemple we use absolute Xpath by doing inspect in that element and than copy Xpath because calender it
is not visible directly unless you click on departur date than it appears,that is whey we use absolut path
 */


    WebDriver driver=new EdgeDriver();

    @Test
//this methode is to find month

    public void testDataPicker() throws InterruptedException {
        String month="March 2023";
        String day="29";
        driver.get("https://phptravels.net/");
        Thread.sleep(3000);
        WebElement clickOnCal =driver.findElement(By.xpath("//input[@class='checkout form-control form-control-lg border-top-l0']"));
        clickOnCal.click();
        Thread.sleep(3000);
        WebElement nextButton=driver.findElement(By.xpath("//*[@id='fadein']/div[9]/div[1]/table/thead/tr[1]/th[3]"));

        Thread.sleep(3000);
        while (true){
            String visibleMonth=driver.findElement(By.xpath("//*[@id='fadein']/div[9]/div[1]/table/thead/tr[1]/th[2]")).getText();
            Thread.sleep(3000);
            if(visibleMonth.equals(month)){
                break;
            }else{
                nextButton.click();
            }
        }
//this methode is to find date
        Thread.sleep(5000);


        //the both next methodes are true
        driver.findElement(By.xpath("//*[@id='fadein']/div[9]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
        //driver.findElement(By.xpath("//*[@id='fadein']/div[9]/div[1]/table/tbody/tr[5]/td[4]")).click();

        Thread.sleep(5000);



    }








}
