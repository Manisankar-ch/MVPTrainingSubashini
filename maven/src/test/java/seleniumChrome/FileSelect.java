package seleniumChrome;

import org.openqa.selenium.By;
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
	@Test(priority=1)
	public void openApplication() {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\fileSelect.html");
	}
	@Test(priority=2)
	public void chooseFile() throws InterruptedException {
		driver.findElement(By.id("file-select")).sendKeys("E:\\Manisankar\\samplepdf\\sample.pdf");
		Thread.sleep(1000);
		
	}
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
		
	}


}
