package seleniumChrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String baseWindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\'newTabsBtn\']")).click();
		Set<String> ele = driver.getWindowHandles();
		List<String> open_windows = new ArrayList<String>();
		for (String string : ele) {
			if(!string.equalsIgnoreCase(baseWindow)) {
				String title = driver.switchTo().window(string).getTitle();
				System.out.println("the opened windows exclude main windows are:"+title);
				Thread.sleep(2000);
				open_windows.add(title);
				if(title.equals("Basic Controls - H Y R Tutorials")){
					driver.switchTo().window(string);
					Thread.sleep(2000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("mani");
					Thread.sleep(2000);
					driver.close();
				}
				else {
					driver.switchTo().window(string);
					Thread.sleep(3000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\'alertBox\']")).click();
					driver.switchTo().alert().accept();
					
					driver.close();
				}
				
			}
		}System.out.println(open_windows);
		

	}

}
