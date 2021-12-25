package seleniumFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.gecko.driver","E:\\Manisankar\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@Test
	public void openApplication() {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\RadioButtons.html");
	}
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
