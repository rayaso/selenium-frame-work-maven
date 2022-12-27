package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//additionnsal thing that you add to your test.like screen shot but this is printing message
public class TestNGListeners implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("test succecced");    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("our test failed");    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
