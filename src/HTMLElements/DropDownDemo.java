package HTMLElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element
        WebElement drpText = driver.findElement(By.id("seltext"));

        // 2. create the object of Select class
        Select selText = new Select(drpText);

        Thread.sleep(4000);
        // 3. select the option from drop down

      //  selText.selectByVisibleText("text 3");
       // selText.selectByIndex(1);
        selText.selectByValue("v12");






    }
}
