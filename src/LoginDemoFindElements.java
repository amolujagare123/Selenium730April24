import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LoginDemoFindElements {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

      //  driver.findElement(By.className("full-width-input")).sendKeys("admin");

        List<WebElement> wbList = driver.findElements(By.className("full-width-input"));

        System.out.println("total elements="+wbList.size());

        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");

    }
}
