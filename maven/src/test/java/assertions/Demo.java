package assertions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("helloo");
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> el = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement we : el) {
			if(we.getText().equalsIgnoreCase("india")) {
				we.click();
				
				break;
				}
			System.out.println(we.getText());
			
					
				}
//		driver.close();



	}

}
