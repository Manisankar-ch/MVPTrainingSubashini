package seleniumChrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action = new Actions(driver);
		
		action.contextClick(driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"))).build().perform();
		
		action.click(driver.findElement(By.xpath("//li[.='Cut']"))).build().perform();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.close();
		
		

	}

}
