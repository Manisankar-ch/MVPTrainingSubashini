package seleniumFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchMozilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Manisankar\\Browsers\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/search?client=firefox-b-d&q=google");
		System.out.println(driver.getTitle());

	}

}
