package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectBox {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void openApplication() {
		driver.get("file:\\E:\\Manisankar\\htmlprograms\\SelectBox.html");
	}
	@Test(priority=2)
	public void clickDropDown() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id='city']")).click();
		//Thread.sleep(1000);
	}
	@Test(priority=3)
	public void option1() throws InterruptedException {
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//*[@id=\'city\']/option[1]")).click();
		Thread.sleep(1000);
	}@Test(priority=4)
	public void option2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'city\']/option[2]")).click();
		Thread.sleep(1000);
	}
	@Test(priority=5)
	public void option3() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"city\"]/option[3]")).click();
		Thread.sleep(1000);
	}
	
	
	
	@AfterTest
	public void closeApp() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}


}
