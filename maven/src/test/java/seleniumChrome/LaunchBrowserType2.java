package seleniumChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowserType2 {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openApplication() {
		driver.get("https://www.google.co.in/");
	}
	
	@AfterTest
	public void closeApp() {
		driver.close();
	}

}
