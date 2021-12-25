package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileSelect {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openApplication() {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\fileSelect.html");
	}
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		
	}

}
