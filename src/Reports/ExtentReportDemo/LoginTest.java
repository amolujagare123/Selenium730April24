package Reports.ExtentReportDemo;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Reports.util.ForExtentReports.getScreenshot;

public class LoginTest {

    ExtentReports extent;
    @BeforeClass
    public void initExtentObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing");

        extent.setSystemInfo("Project Name","Stock Management System");
        extent.setSystemInfo("Developers Name","Prakash");
        extent.setSystemInfo("Testers Name","Suchi");
        extent.setSystemInfo("Managers Name","Seema");
        extent.setSystemInfo("Build Version","SM-v1.22");

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

    @Test
    public void loginTest1() throws IOException {
        ExtentTest test = extent.createTest("Valid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened");

        driver.get("https://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is Entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");
        test.info("password is Entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "This is not a dashboard");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }

    }

    @Test
    public void loginTest2() throws IOException {
        ExtentTest test = extent.createTest("invalid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened");

        driver.get("https://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("adsdsmin");

        test.info("username is Entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsdsd");
        test.info("password is Entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }

    }

    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("Blank login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened");

        driver.get("https://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("username is Entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");
        test.info("password is Entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        String expected = "POSNIC - Login to Control Panel";
        String actual = driver.getTitle();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("This test is passed");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+getScreenshot(driver));
        }

    }





}
