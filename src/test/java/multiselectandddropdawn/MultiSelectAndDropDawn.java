package multiselectandddropdawn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultiSelectAndDropDawn {
    //drop down (scroll down to see multiple choices)we have to use Select


    @Test
    public void multiTest() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://scaledupit.com/test3");
        driver.manage().window().maximize();

        /*Select cars=new Select(driver.findElement(By.id("carselect")));
        Thread.sleep(3000);
        cars.selectByVisibleText("Benz");
        Thread.sleep(3000);*/


        //multi select example,if i need to select 2 items or more
        Select multiSelect=new Select(driver.findElement(By.id("multiple-select-example")));
        Thread.sleep(3000);

        // to see if the element is multiselectible(select more than one) we use this methode:

        if(multiSelect.isMultiple()){


        multiSelect.selectByVisibleText("Apple");
        multiSelect.selectByVisibleText("Orange");
        Thread.sleep(3000);

    }else{
            System.out.println("it is not multi selectable");
        }

    }





}
