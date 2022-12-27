package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
//this generate more feauture and rich reports.

public class GenerateExtentReportsScreenshot {
    public WebDriver driver;
    public ExtentSparkReporter spark;
    public ExtentReports extent;
    public ExtentTest logger;
    @BeforeTest
    public void startReport() throws IOException {
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/TestReports.html");
        extent.attachReporter(spark);


        //for design purposes
        extent.setSystemInfo("host name", "software testing");
        extent.setSystemInfo("envirenment", "qa");
        extent.setSystemInfo("name", "soraya");
        spark.config().setDocumentTitle("testReports");
        spark.config().setTheme(Theme.DARK);
    }


        public static  String getScreenshot(WebDriver driver,String screenshotName)throws IOException{
            String dateName=new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source=ts.getScreenshotAs(OutputType.FILE);
            String destination=System.getProperty("user.dir")+"\\Screenshot\\"+screenshotName+dateName+".png";
            File finalDestination=new File(destination);
            FileUtils.copyFile(source,finalDestination);
            return destination;

        }
        @BeforeMethod
    public void setup(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
    }
@Test
    public void verifyTitle(){
        logger=extent.createTest("verifyTitle");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("blinds");
    Assert.assertEquals(driver.getTitle(),"Amazon.com. Spend less. Smile more.");

}

@Test
    public void verifyGoogle(){
        logger=extent.createTest("verifyGoogle");
        driver.get("https://google.com");
        driver.findElement(By.id("hello")).click();
        Assert.assertEquals(driver.getTitle(),"hi");
}

@AfterMethod
    public void getResult(ITestResult result) throws Exception {
    if (result.getStatus() == ITestResult.FAILURE) {
        logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "test case failed", ExtentColor.RED));
        logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + "test case failed", ExtentColor.RED));
        String screenshotPath = getScreenshot(driver, result.getName());
        logger.fail("test case failed snapshot is below" + logger.addScreenCaptureFromPath(screenshotPath));

    } else if (result.getStatus() == ITestResult.SKIP) {
        logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "test case skipped", ExtentColor.RED));

    } else if (result.getStatus() == ITestResult.SUCCESS) {
        logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "test case pass", ExtentColor.GREEN));

    }

    driver.quit();

}
@AfterTest
    public void endReport(){
        extent.flush();
}
}
