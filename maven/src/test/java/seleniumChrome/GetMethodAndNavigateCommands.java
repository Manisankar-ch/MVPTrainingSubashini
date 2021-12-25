package seleniumChrome;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetMethodAndNavigateCommands {
	static WebDriver driver;
	
	@BeforeTest
	public void configureBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		 driver = new ChromeDriver();
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		Thread.sleep(1000);
		System.out.println("Browser Launched:");
	}
	@Test
	public void openApplication() throws InterruptedException {
//		driver.get("http://zero.webappsecurity.com/");
//		String baseWindow = driver.getWindowHandle();
//		System.out.println("Base window is :"+baseWindow);
//		System.out.println("Basewindow title is:"+driver.getTitle());
//		System.out.println("Basewindow link is:"+driver.getCurrentUrl());
//		driver.manage().window().maximize();
//		String title=driver.getTitle();
//		System.out.println("the title of the web pageis:"+title);
//		String currenturl=driver.getCurrentUrl();
//		System.out.println("the first page ur is :"+currenturl);
////		String ps = driver.getPageSource();
////		System.out.println("the present current page source"+ps);
//		driver.navigate().to("http://www.google.com");
//		String s = "input[name='q']";
//		driver.findElement(By.cssSelector(s)).sendKeys("facebook");
//		WebElement textbox = driver.findElement(By.cssSelector(s));
//		textbox.sendKeys(Keys.ENTER);
//		driver.navigate().back();
//		driver.findElement(By.cssSelector(s)).sendKeys("twitter");
//		driver.navigate().refresh();
		driver.get("https://www.w3schools.com/");
		String w31st = driver.getWindowHandle();
		System.out.println(" window url is :"+driver.getTitle());
		System.out.println(" window url is :"+driver.getCurrentUrl());
		System.out.println("Base window is :"+w31st);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/a[2]")).click();
		Thread.sleep(6000);
		String current = driver.getWindowHandle();
		System.out.println("current window is :"+current);
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String sa:allWindows) {
			if(!(sa.equals(w31st))) {
				driver.switchTo().window(sa);
				System.out.println("Sub window url is :"+driver.getTitle());
				System.out.println("Sub window url is :"+driver.getCurrentUrl());
				driver.findElement(By.xpath("/html/body/div[1]/a[1]/i")).click();
			}
		}Thread.sleep(2000);
		driver.close();
		

		
	}
	

}
