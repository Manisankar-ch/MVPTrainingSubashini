package seleniumChrome;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
	WebDriver driver;

	System.setProperty("webdriver.chrome.driver","E:\\Manisankar\\Browsers\\chromedriver.exe");
	String projectPath = System.getProperty("user.dir");
	System.out.println("Project path is : "+projectPath);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
	String baseWindow = driver.getWindowHandle();
	System.out.println("Base Window name is :" +baseWindow);
	System.out.println("Base window title is :"+driver.getTitle());
	System.out.println("Base window Current URL is :"+driver.getCurrentUrl());
	driver.findElement(By.xpath("(//a[contains(text(),'Demo Site')])[1]")).click();
	Set<String> allWindow = driver.getWindowHandles(); 
	for(String s : allWindow){ 
	if(!(s.equals(baseWindow))){
	driver.switchTo().window(s);
	System.out.println("Sub Window name is :" +s);  
	System.out.println("Sub window url is :"+driver.getTitle());
	System.out.println("Sub window url is :"+driver.getCurrentUrl());
	driver.close();
	}
	}
	driver.quit();

	}
}


