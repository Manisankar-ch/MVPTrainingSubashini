package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class XpathlocatorAUT {
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test(priority=1)
	public void openBrowser() 
	{
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void signn() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'signin_button\']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	public void userCredentials() {
		driver.findElement(By.xpath("//*[@id=\'user_login\']")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id=\'user_password\']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'login_form\']/div[2]/input")).click();
		}
	@Test(priority=4)
	public void click() {
		driver.findElement(By.xpath("//*[@id=\'details-button\']")).click();
		driver.findElement(By.xpath("//*[@id=\'proceed-link\']")).click();
	}
	@Test(priority=5)
	public void nextStep() {
		 String title=driver.getTitle();
		 Assert.assertEquals(title, "Zero - Account Summary");
		 String cashAcc=driver.findElement(By.xpath("//h2[contains(text(),'Cash Accounts')]")).getText();
		 Assert.assertEquals(cashAcc, "Cash Accounts");
		 driver.findElement(By.xpath("//a[contains(text(),'Transfer Funds')]")).click();
		 driver.findElement(By.xpath("//*[@id='tf_amount']")).sendKeys("1000");
		 driver.findElement(By.xpath("//*[@id=\'tf_description\']")).sendKeys("Transferring amount");
		 driver.findElement(By.xpath("//*[@id=\'btn_submit\']")).click();
		 driver.findElement(By.xpath("//*[@id=\'btn_submit\']")).click();
		 String data=driver.findElement(By.xpath("//*[@id=\'transfer_funds_content\']/div/div/div[1]")).getText();
		 Assert.assertEquals(data,"You successfully submitted your transaction.");
		 driver.findElement(By.xpath("//*[@id=\'settingsBox\']/ul/li[3]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\'logout_link\']")).click();
		 driver.close();
	}
		 

}
