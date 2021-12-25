package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openApplication() throws InterruptedException {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\RadioButtons.html");
		Thread.sleep(1000);
	}
	@Test(priority=1)
	public void clickMale() throws InterruptedException {
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void clickFemale() {
		driver.findElement(By.id("female")).click();
	}
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
