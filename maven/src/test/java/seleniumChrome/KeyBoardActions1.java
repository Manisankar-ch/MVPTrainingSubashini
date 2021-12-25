package seleniumChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Usrname");
		driver.findElement(By.id("userEmail")).sendKeys("Usrname@gmail.com");
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		WebElement perminentAddress = driver.findElement(By.id("permanentAddress"));
		currentAddress.sendKeys("Addresss");
		action.keyDown(Keys.CONTROL).sendKeys("ac").build().perform();
		action.keyDown(Keys.CONTROL);
		perminentAddress.sendKeys("v");
		Thread.sleep(2000);
		action.build().perform();
		driver.close();
		}

}
