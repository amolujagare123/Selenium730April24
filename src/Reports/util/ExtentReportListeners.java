package Reports.util;

import TestNGDemo.AllSites.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static Reports.util.ForExtentReports.getScreenshot;
import static Reports.util.ForExtentReports.initExtent;

public class ExtentReportListeners extends Base implements ITestListener {
    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {

        System.out.println("onTestStart");

        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("This test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");

        test.fail("This test is failed "+result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if (extent==null)
         extent = initExtent();
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");

        extent.flush();
    }
}
