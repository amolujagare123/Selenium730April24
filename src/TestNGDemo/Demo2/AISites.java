package TestNGDemo.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {

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
    public void openAIWebsite() {
        driver.get("https://openai.com/");

         Assert.assertEquals(driver.getTitle(),
                 "chat gpt title"
         ,"incorrect page");
    }

    @Test
    public void deepMindWebsite() {
        driver.get("https://deepmind.com/");
    }

    @Test
    public void allenNLPWebsite() {
        driver.get("https://allennlp.org/");
    }

    @Test
    public void googleBrainWebsite() {
        driver.get("https://research.google/teams/brain/");
    }

}
