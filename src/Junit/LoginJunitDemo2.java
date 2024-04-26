package Junit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJunitDemo2 {

    static WebDriver driver;

    @BeforeClass // this method will run before first test method of the class
    public static void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // this method will run after last test method of the class
    public static void closeBrowser()
    {
        driver.close();
    }
    @Test
    public void loginTest1() throws InterruptedException {

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
     //   btnLogin.click();
        Thread.sleep(4000);
    }

    @Test
    public void loginTest2() throws InterruptedException {

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsds");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsdd");

        WebElement btnLogin = driver.findElement(By.name("submit"));
      //  btnLogin.click();
        Thread.sleep(4000);
    }

    @Test
    public void loginTest3() throws InterruptedException {


        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
      //  btnLogin.click();
        Thread.sleep(4000);
    }
}
