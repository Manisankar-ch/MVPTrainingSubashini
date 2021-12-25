package seleniumChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		
		
		driver.get("https://www.google.com/search?q=calculator&oq=calculator&aqs=chrome..69i57.3835j0j4&sourceid=chrome&ie=UTF-8");
		System.out.println(driver.getTitle());

	}

}
