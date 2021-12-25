package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\'developers-menu-toggle\']/span")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"developers-menu-dropdown\"]/li[1]/a"))).click().build().perform();
		
		
		

	}

}
