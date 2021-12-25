package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumChrome.ReadExcelFile;


public class Excel {

	static WebDriver driver;
	@Test(dataProvider="testdata")
	public void demoClass(String username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.findElement(By.name("user[login]")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("user[password]")).sendKeys(password);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("commit")));
		driver.findElement(By.name("commit")).click();
		Thread.sleep(5000);
		System.out.println("login successful");
		}
	@AfterMethod
	void programtermination() {
		driver.quit();
	}
	@DataProvider(name="testdata")
	public Object[][] testDataExample(){
		ReadExcelFile configuration = new ReadExcelFile("C:\\Users\\Omkar Swarna\\eclipse-workspace\\Myseleniumsessionclasses\\datafiles\\Book1.xlsx");
		int rows=configuration.getRowCount(0);
//		int rows=configuration.
		Object[][] signin_credentials = new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
		signin_credentials[i][0] = configuration.getData(0, i, 0);
		signin_credentials[i][1] = configuration.getData(0, i, 1);
		}
		return signin_credentials;
	}
}
