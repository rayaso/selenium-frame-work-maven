package javascriptexecute;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecute {


    //java script allows us to create alert,and scroll dawn in app
    @Test

            public  void testOne() throws InterruptedException {


    WebDriver driver=new EdgeDriver();
    JavascriptExecutor js=(JavascriptExecutor) driver;/*this line is a casting(converting driver to java
    script executor) it means that driver gonna acte as java script executor*/

    driver.manage().window().maximize();
    driver.get("https://scaledupit.com/test2.html");
    /*driver.findElement(By.id("userm")).sendKeys("ahmed");this line it is the same with next line,i
    commented out this methode cause in case we can not find the web element with ,we pass to java script
    and find element locator with it
     */

    js.executeScript("document.getElementById('userm').value='ahmed';");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('passm').value='ahmed';");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('sone').click();");
        Thread.sleep(2000);
        js.executeScript("alert('hello everyone');");
    Thread.sleep(2000);
}

@Test
    public void scrollBy() throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.get("https://www.amazon.com/");
    Thread.sleep(2000);
        js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
   // js.executeAsyncScript("window.scrollBy(0,600)","");




}






}
