package TestNGDemo.AllSites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites extends Base{



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
