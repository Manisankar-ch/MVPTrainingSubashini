package seleniumIE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {
	public static void main(String[] args) {
		WebDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver", "E:\\Manisankar\\BrowsersIEDriverServer.exe");
		driver.get("https://www.google.com/search?client=firefox-b-d&q=google");
		System.out.println(driver.getTitle());

	}

}
