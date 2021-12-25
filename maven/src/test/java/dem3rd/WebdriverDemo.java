package dem3rd;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebdriverDemo {
	
	Scanner sc = new Scanner(System.in);
	WebDriver driver;
	int browser=sc.nextInt();
	@Test
	public void openApplication() {
	if (browser==1) {
		
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
	}
	else if (browser == 2) {
		 driver=new InternetExplorerDriver();  
		System.setProperty("webdriver.ie.driver", "E:\\Manisankar\\Browsers\\IEDriverServer.exe");  
        
	     // Instantiate a IEDriver class.     
	
	}
	else if(browser == 3) {
		driver = new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver","E:\\Manisankar\\Browsers\\geckodriver.exe");
	
	
	}
}
	
}
