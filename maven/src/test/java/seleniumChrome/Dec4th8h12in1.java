package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dec4th8h12in1 {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void login() throws InterruptedException {
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Raghav");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("12345");
		driver.findElement(By.id("login")).click();
		String str = driver.getTitle();
		Assert.assertEquals(str,"TestProject Demo");
		
	}
	@Test(priority=2)
	public void signout() {
		driver.findElement(By.xpath("//*[@id=\'logout\']")).click();
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}

}
