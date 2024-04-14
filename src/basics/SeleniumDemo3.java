package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

     //   driver.manage().window().maximize();
        driver.get("http://facebook.com");

       // driver.navigate().to("http://gmail.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");

        Thread.sleep(4000);

       // driver.close(); // closes the current window only

        driver.quit(); // closes the all the windows opened by the driver






    }
}
