package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrames {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
	driver=new ChromeDriver();//Launch the Chrome Browser
	System.out.println("Browser launched");
	driver.manage().window().maximize();//Maximize the chrome browser
	//Open the application
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

	driver.findElement(By.id("name")).sendKeys("1stTime");
	//1stframe
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
	// Select se=new Select(driver.findElement(By.xpath("//*[@id='course']");
	driver.findElement(By.xpath("//*[@id='course']")).click();
	driver.findElement(By.xpath("//option[@value='java']")).click();

	driver.switchTo().defaultContent();
	//1stframe
	
	driver.findElement(By.id("name")).clear();
	driver.findElement(By.id("name")).sendKeys("2ndTime");
	//2ndframe
	driver.switchTo().frame(driver.findElement(By.id("frm2")));
	System.out.println("im in frame2");
	driver.findElement(By.id("firstName")).sendKeys("yoursFirstName");
	driver.findElement(By.id("lastName")).sendKeys("YourslastName");
	driver.findElement(By.id("malerb")).click();

	driver.findElement(By.id("femalerb")).click();
	driver.findElement(By.id("englishchbx")).click();
	
	driver.findElement(By.id("hindichbx")).click();
	driver.findElement(By.id("chinesechbx")).click();
	driver.findElement(By.id("spanishchbx")).click();
	driver.findElement(By.id("latinchbx")).click();
	driver.findElement(By.id("frenchchbx")).click();
	driver.findElement(By.id("email")).sendKeys("username@gmail.com");
	//2ndtime
	driver.switchTo().defaultContent();
	driver.findElement(By.id("name")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("name")).sendKeys("3rdTime");
	//3rdtime
	driver.switchTo().frame(driver.findElement(By.id("frm3")));
	driver.findElement(By.id("name")).sendKeys("1stframe in 3rd frame");
	driver.switchTo().frame(driver.findElement(By.id("frm1")));
	System.out.println("im in 1st frame in 3rd frame");
	driver.findElement(By.xpath("//*[@id=\'body-wrapper\']/div[4]/div/li/a")).click();
	driver.switchTo().parentFrame();
	driver.findElement(By.id("name")).clear();
	driver.findElement(By.id("name")).sendKeys("2ndframe in 3rd frame");
	//2nd sub frame in 3rd frame
	driver.switchTo().frame(driver.findElement(By.id("frm2")));
	System.out.println("im in 2nd sub frame in 3rd frame");
	driver.findElement(By.id("firstName")).sendKeys("yoursFirstName");
	driver.findElement(By.id("lastName")).sendKeys("YourslastName");
	driver.findElement(By.id("malerb")).click();

	driver.findElement(By.id("femalerb")).click();
	driver.findElement(By.id("englishchbx")).click();
	
	driver.findElement(By.id("hindichbx")).click();
	driver.findElement(By.id("chinesechbx")).click();
	driver.findElement(By.id("spanishchbx")).click();
	driver.findElement(By.id("latinchbx")).click();
	driver.findElement(By.id("frenchchbx")).click();
	driver.findElement(By.id("email")).sendKeys("username@gmail.com");
	driver.findElement(By.id("password")).sendKeys("userdgdgg");
	driver.findElement(By.id("registerbtn")).click();
	//end of the 2nd frame in 3rd frame
	driver.switchTo().parentFrame();
	driver.findElement(By.id("name")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("name")).sendKeys("3rdframe in 3rd frame");
	driver.switchTo().frame(driver.findElement(By.id("frm3")));
	driver.switchTo().parentFrame();
	driver.findElement(By.id("name")).clear();
	Thread.sleep(4000);
	driver.findElement(By.id("name")).sendKeys("Endof the frames in 3d frame");
	driver.switchTo().defaultContent();
	driver.findElement(By.id("name")).clear();
	Thread.sleep(1000);
	driver.findElement(By.id("name")).sendKeys("Endof the frames");
	

	


	

	


	}

}
