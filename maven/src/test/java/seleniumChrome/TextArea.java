package seleniumChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TextArea {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void openApplication() {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\TextArea.html");
	}
	@Test(priority=2)
	public void textArea() {
		System.out.println("Enter address");
		driver.findElement(By.className("name")).sendKeys("this is the adddress block area");
	}
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(50000);
		driver.close();
	}

}


