package xpathDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatatableDemo1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();
        driver.findElement(By.linkText("View Customers")).click();

        String name = "Akash Rathod";

        driver.findElement(By.xpath("//tr[ td[text()='"+name+"'] ]//a[1]")).click();

        //tr[ td[text()='yesmart']]//a[contains(@href,'update')]
        //tr[ td[text()='yesmart']]//a[contains(@class,'edit')]


    }
}
