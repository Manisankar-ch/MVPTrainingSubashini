package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBox {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void openApplication() {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\checkbox.html");
	}
	@Test(priority=2)
	
	public void option1() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='soccer']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	
	public void option2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='cricket']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	
	public void option3() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='baseball']")).click();
		Thread.sleep(1000);
	}
	@AfterTest
	public void closeApp() {
		driver.close();
		
	}

}
