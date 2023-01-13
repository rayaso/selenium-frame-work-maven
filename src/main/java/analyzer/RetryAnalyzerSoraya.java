package analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerSoraya implements IRetryAnalyzer {
    /*in case we have failed test cases .we retry testing it*/
    int counter=0;
    int retryLimit=3;//you could set it as many as you want


    @Override
    public boolean retry(ITestResult iTestResult) {
        if(counter<retryLimit) {
            counter++;
            return true;
        }else {
            return false;
        }
    }
}
