package DataProvider;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginTestDPExcelHeader {
    @Test (dataProvider = "getData")
    public void loginTest1(String username,String password)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @DataProvider
    Object[][] getData() throws IOException {
        // 1. read the file
        FileInputStream fis = new FileInputStream("MyData/MyDataExcel.xls");

        //2. create the object workbook and pass the file object to it
        HSSFWorkbook workbook = new HSSFWorkbook(fis);

        //3. get the appropriate sheet
        HSSFSheet sheet = workbook.getSheet("Sheet2");

        // 4. count the active rows of the excel sheet
        int rowCount = sheet.getPhysicalNumberOfRows();
        // 5. col count
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount-1][colCount];

        for (int i=0;i<rowCount-1;i++)
        {
            HSSFRow row = sheet.getRow(i+1);


            for (int j=0;j<colCount;j++) {

                HSSFCell cell = row.getCell(j);
                if (cell == null) {
                    data[i][j] = "";
                } else {
                    cell.setCellType(CellType.STRING);
                    data[i][j] = cell.toString();
                }
            }
        }

      /*  data[0][0] = "admin";
        data[0][1] = "admin";

        data[1][0] = "invalid-1";
        data[1][1] = "invalid-1";

        data[2][0] = "invalid-2";
        data[2][1] = "invalid-2";

        data[3][0] = "invalid-3";
        data[3][1] = "invalid-3";*/

        return data;
    }
}
