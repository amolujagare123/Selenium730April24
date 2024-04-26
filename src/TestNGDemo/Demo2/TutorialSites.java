package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TutorialSites {

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
    public void courseraWebsite() {
        driver.get("https://www.coursera.org/");
    }

    @Test
    public void udacityWebsite() {
        driver.get("https://www.udacity.com/");
    }

    @Test
    public void kaggleWebsite() {
        driver.get("https://www.kaggle.com/");
    }

    @Test
    public void towardsDataScienceWebsite() {
        driver.get("https://towardsdatascience.com/");
    }
}
