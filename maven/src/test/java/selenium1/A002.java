package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A002 {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openApplication() {
		driver.get("http://google.com");
	}
	@Test
	public void openApplication1() {
		driver.get("http://gmail.com");
	}
	@Test
	public void openApplication2() {
		driver.get("http://facebook.com");
	}
	@AfterTest
	public void closeApp() {
		driver.close();
		
	}
	
}
