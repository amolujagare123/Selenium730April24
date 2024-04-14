package HTMLElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find the web element
        WebElement multiSel = driver.findElement(By.id("multiSel"));

        // 2. create the object of Select class
        Select selMultiSel = new Select(multiSel);

        Thread.sleep(4000);
        // 3. select the option from List

        selMultiSel.selectByVisibleText("text 2");
        selMultiSel.selectByVisibleText("text 4");
        selMultiSel.selectByIndex(0);

        Thread.sleep(2000);
        selMultiSel.deselectByIndex(1);

        Thread.sleep(2000);
        selMultiSel.deselectByVisibleText("text 4");

        Thread.sleep(2000);
        selMultiSel.deselectByVisibleText("text 1");








    }
}
