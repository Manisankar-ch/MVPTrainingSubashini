package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Password {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void openApplication() {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\Passwordfield.html");
	}
	@Test(priority=2)
	public void enterPassword() throws InterruptedException{
		driver.findElement(By.name("user-password")).sendKeys("Mss124@110");
		Thread.sleep(2000);
	}
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
