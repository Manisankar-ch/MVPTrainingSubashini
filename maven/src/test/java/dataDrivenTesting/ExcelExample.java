package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelExample {
	static WebDriver driver;
	@Test(dataProvider="wordpessData")
	public void demoClass(String username,String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
//		Thread.sleep(2000);
		System.out.println("Browser launched");
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		driver.findElement(By.name("user[login]")).sendKeys(username);
		driver.findElement(By.name("user[password]")).sendKeys(password);
//		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.name("commit")));
		driver.findElement(By.name("commit")).click();
//		Thread.sleep(5000);
		Assert.assertTrue(driver.getTitle().contains("dashBoard"), "user is unable to login because of invalid credentials");
		System.out.println("Login successful");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@DataProvider(name="wordpessData")
	public Object[][] passdata(){
		Object data[][]=new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo1";
		data[1][0]="admin";
		data[1][1]="demo123";
		data[2][0]="admin2";
		data[2][1]="demo123";
		return data;
		
		
	}
}
