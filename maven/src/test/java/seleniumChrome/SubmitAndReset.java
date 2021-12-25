package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SubmitAndReset {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void openApplication() throws InterruptedException {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\SubmitAndResetButtons.html");
		Thread.sleep(1000);
	}
	@Test(priority=5)
	public void clickSubmit() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	public void clickReset() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/form/input[3]")).click();
		Thread.sleep(1000);
	}
	@Test(priority=2)
	public void enterName() throws InterruptedException {
		driver.findElement(By.name("first-name")).sendKeys("username");
		Thread.sleep(1000);
	}
	@Test(priority=4)
	public void enterNameAgain() throws InterruptedException {
		driver.findElement(By.name("first-name")).sendKeys("username1");
		Thread.sleep(1000);
	}
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
