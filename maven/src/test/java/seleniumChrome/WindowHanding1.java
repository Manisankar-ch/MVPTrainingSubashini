package seleniumChrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class WindowHanding1 {
	static WebDriver driver;
//	@Test
//	public void open() throws InterruptedException {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String baseWindow = driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set <String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if(!(window.equalsIgnoreCase(baseWindow))) {
				driver.switchTo().window(window);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("username");
				driver.close();
				}
			
		}System.out.println("newWindow handle is done.36");
		//new tab operation
		driver.switchTo().window(baseWindow);
		driver.findElement(By.id("newTabBtn")).click();
		Set <String> allWindowsInSameTab = driver.getWindowHandles();
		for (String tab : allWindowsInSameTab) {
			System.out.println(driver.getTitle());
			if(!(tab.equalsIgnoreCase(baseWindow))) {
				driver.switchTo().window(tab);
				driver.findElement(By.id("alertBox")).click();
				Thread.sleep(2000);
				System.out.println("47..The text in the alert box is:"+driver.switchTo().alert().getText());
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				//confirmBOx
				driver.findElement(By.id("confirmBox")).click();
				Alert a = driver.switchTo().alert();
				String tit=a.getText();
				System.out.println("54.The text in the conform box is"+tit);
				driver.switchTo().alert();
				if(tit=="Press a button!") {
					a.accept();
				}
				else {a.dismiss();}
				driver.findElement(By.id("promptBox")).click();
				ExpectedConditions.alertIsPresent();
				
				String alertTxt=a.getText();
				System.out.println("64.the text in th promptbox:"+alertTxt);
				a.sendKeys("This is the prompt box1");
				a.accept();
				driver.close();
				}
			}System.out.println("69.new Tab completed");
		//newTab is completed\n working in multiple tabs
		driver.switchTo().window(baseWindow);
		driver.findElement(By.id("newWindowsBtn")).click();
		List<String> opened_windows = new ArrayList<String>();
		Set<String> multiple_windows=driver.getWindowHandles();
		for (String windows : multiple_windows) {
			if(!(windows.equals(baseWindow))) {
				
				String title = driver.switchTo().window(windows).getTitle();
				System.out.println("79.the opened windows exclude main windows are:"+title);
				opened_windows.add(title);
				if(title.equals("XPath Practice - H Y R Tutorials")) {
					driver.switchTo().window(windows);
					Thread.sleep(2000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\'post-body-299858861183690484\']/div/form/div[1]/input[1]")).sendKeys("mani");
					Thread.sleep(2000);
					driver.close();
					
				}
				else {
					driver.switchTo().window(windows);
					Thread.sleep(3000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("name");
					
					driver.close();
				}
			
			}
			
		}
		driver.switchTo().window(baseWindow);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'newTabsBtn\']")).click();
		Set<String> ele = driver.getWindowHandles();
		List<String> opened_window = new ArrayList<String>();
		for (String strings : ele) {
			if(!strings.equalsIgnoreCase(strings)) {
				String title = driver.switchTo().window(strings).getTitle();
				System.out.println("112.the opened windows excludes main window are:"+title);
				opened_window.add(title);
				if(strings.equals("XPath Practice - H Y R Tutorials")) {
					driver.navigate().to(baseWindow);
					Thread.sleep(2000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\'post-body-299858861183690484\']/div/form/div[1]/input[1]")).sendKeys("mani");
					Thread.sleep(2000);
					driver.close();
				}
				else {
					driver.switchTo().window(strings);
					Thread.sleep(3000);
					driver.manage().window().maximize();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("name");
					
					driver.close();
				}
				
			}
		}
		System.out.println("135..The opened windows:"+opened_windows);
		driver.switchTo().window(baseWindow);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'newTabsBtn\']")).click();
		System.out.println("139.clicking on mutiple tabs");
		Thread.sleep(2000);
		Set<String> ele1 = driver.getWindowHandles();
		List<String> open_windows = new ArrayList<String>();
		
		for (String string : ele1) {
			if(!string.equalsIgnoreCase(baseWindow)) {
				String title = driver.switchTo().window(string).getTitle();
				Thread.sleep(2000);
				System.out.println("148.the opened windows excludes main window in new tab are:"+title);
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
		}System.out.println("172."+open_windows);
		

		driver.switchTo().window(baseWindow);
		driver.findElement(By.xpath("//*[@id=\'name\']")).sendKeys("name");
		driver.close();

	}//https://www.hyrtutorials.com/p/basic-controls.html::::https://www.hyrtutorials.com/p/add-padding-to-containers.html


}
