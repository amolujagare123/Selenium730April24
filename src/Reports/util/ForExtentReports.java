package Reports.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReports {

    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Project Name","Stock Management System");
        extent.setSystemInfo("Developers Name","Prakash");
        extent.setSystemInfo("Testers Name","Suchi");
        extent.setSystemInfo("Managers Name","Seema");
        extent.setSystemInfo("Build Version","SM-v1.22");

        return extent;
    }


    public static String getScreenshot(WebDriver driver) throws IOException {
        // 1. create the object reference of TakesScreenshot
        // assign current driver to it
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using
        // ts (object reference of TakesScreenshot)
        File scrFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";


        // 3. copy file object into a real image file
        FileUtils.copyFile(scrFile,new File("Report\\screenshots\\"+fileName));

        return fileName;
    }
}
