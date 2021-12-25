package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserNanePassword {
	public static WebDriver driver;

	@BeforeTest
	public void configureBrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
	driver=new ChromeDriver();//Launch the Chrome Browser
	Thread.sleep(5000);
	System.out.println("Browser launched");

	}

	@Test(priority=1)
	public void openApplication() throws InterruptedException

	{
	System.out.println("Google opened");
	driver.get("file:\\E:\\Manisankar\\htmlprograms\\username.html");


	}

	@Test(priority=2)
	public void enterUserName() throws InterruptedException

	{
	System.out.println("Enter UserName");
	driver.findElement(By.name("username")).sendKeys("userName");

	}

	@Test(priority=3)
	public void enterPassword() throws InterruptedException

	{
	System.out.println("Enter Password");

	driver.findElement(By.name("userpass")).sendKeys("password","Password");


	}

	@Test(priority=4)
	public void ClickButton()
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

	@AfterTest
	public void closeWindow()
	{
	driver.close();
	}

}
