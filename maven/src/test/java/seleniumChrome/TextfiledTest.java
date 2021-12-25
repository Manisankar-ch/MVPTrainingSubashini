package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextfiledTest {
	public static WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser launched");
		
	}
	@Test(priority=1)
	public void openApplication() {
		System.out.println("Google opends");
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\textfieldd.html");
	}
	@Test(priority=2)
	public void enterUsername() throws InterruptedException{
		System.out.println("Enter UserName");
		driver.findElement(By.name("username")).sendKeys("user1");
		Thread.sleep(5000);
	}
	@AfterTest
	public void closeApplication() {
		driver.close();
		
	}

}
