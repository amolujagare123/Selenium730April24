package HTMLElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/classifieds/60/post.html");

        // 1. find the web element
        WebElement jobLocation = driver.findElement(By.id("source_118"));

        // 2. create the object of Select class
        Select selJobLocation = new Select(jobLocation);

        Thread.sleep(4000);
        // 3. select the option from List

        selJobLocation.selectByVisibleText("Bangalore");
        selJobLocation.selectByVisibleText("Chennai");
        selJobLocation.selectByVisibleText("Mumbai");

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();

        WebElement selectedLocation = driver.findElement(By.id("fld_118"));
        Select selSelectedLocation = new Select(selectedLocation);
        selSelectedLocation.selectByIndex(0);
        selSelectedLocation.selectByIndex(1);

        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();






    }
}
