package seleniumChrome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookPassword_reset {
//	Scanner sc = new Scanner(System.in);
	//int s=sc.nextInt();
	WebDriver driver;
	@BeforeTest
	public void configureBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
	}
	@Test(priority=1)
	public void userEmailOrMobileNumber() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9959114603");
		Thread.sleep(1000);
	}
	@Test(priority=2)
	public void password() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='passContainer']")).sendKeys("i am ani");
		Thread.sleep(1000);
	}
	@Test(priority=3)
	public void forgot() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='login_link']/div/a")).click();
		Thread.sleep(1000);
	}
	@Test(priority=4)
	public void throughMBL() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id='initiate_interstitial']/div[2]/table/tbody/tr/td[1]/table/tbody/tr[2]/td/label/div/label/div/div[1]")).click();
	Thread.sleep(1000);
	}
	@Test(priority=6)
	public void continuing() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='initiate_interstitial']/div[3]/div/div[1]/button")).click();
		Thread.sleep(1000);
	}
	@Test(priority=7)
	public void enteringCode() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//*[@id='recovery_code_entry']"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		reader.readLine();
		Thread.sleep(1000);
	}
	@Test(priority=8)
	public void accepting() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id='u_0_a_cW']/div/div[3]/div/div[1]/button")).click();
		Thread.sleep(1000);
	}
	@Test(priority=9)
	public void enteringNewPassword() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//*[@id='password_new']"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		reader.readLine();
		Thread.sleep(1000);
	}
	@Test(priority=10)
	public void settingPassword() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'btn_continue\']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=11)
	public void logOutfrom() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_NR\']/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div[3]/div/div/div[1]/label/div/div/div/div/div[1]/div/div[2]/div")).click();
		Thread.sleep(1000);
		
	}
	@Test(priority=12)
	public void continue2() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'mount_0_0_NR\']/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/div/span/span")).click();
		Thread.sleep(1000);
	}
	@Test(priority=13)
	public void getStarted() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='checkpointButtonGetStarted']"));
		Thread.sleep(10000);
	}
	@Test(priority=14)
	public void continue3() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'checkpointSubmitButton\']")).click();
		Thread.sleep(1000);
		
	}
	@Test(priority=15)
	public void skip() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'checkpointButtonContinue\']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=16)
	public void goToFeed() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'checkpointSubmitButton\']")).click();
		Thread.sleep(1000);
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		driver.close();
		Thread.sleep(1000);
	}
}
