package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A001basicbrowser {
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void openApplication() {
		driver.get("www.google.com");
	}
	@BeforeTest
	public void configuration() {
		System.setProperty("webdriver.chrome.driver"," E:\\Manisankar\\Browsers\\chromedriver.exe");
	}
	@AfterTest
	public void closeApplication() {
		driver.close();
	}
	
	

}
