package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites {

    WebDriver driver;

    @BeforeClass // this method will run before first test method of the class
    public  void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // this method will run after last test method of the class
    public  void closeBrowser()
    {
      //  driver.close();
    }

    @Test
    public void twitterWebsite() {
        driver.get("https://twitter.com/");
    }

    @Test
    public void linkedInWebsite() {
        driver.get("https://www.linkedin.com/");
    }

    @Test
    public void facebookWebsite() {
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void instagramWebsite() {
        driver.get("https://www.instagram.com/");
    }
}
