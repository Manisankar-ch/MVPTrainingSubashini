package seleniumFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLaunch2 {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.gecko.driver","E:\\Manisankar\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
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
