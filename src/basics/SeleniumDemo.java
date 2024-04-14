package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
    //    WebDriver driver = new FirefoxDriver();
     //   WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("http://facebook.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());



    }
}
