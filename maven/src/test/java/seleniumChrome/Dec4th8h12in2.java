package seleniumChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Dec4th8h12in2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().window().maximize();
		String tit = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(tit,"Login");
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links-->"+Links.size());
		for(WebElement ma : Links) {
	        System.out.println(ma.getAttribute("href"));
	    }
		driver.close();
	}

}
