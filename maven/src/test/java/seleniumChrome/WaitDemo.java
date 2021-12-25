package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		WebDriverWait wb = new WebDriverWait(driver,12);
		WebElement btn2=driver.findElement(By.id("btn2"));
		btn2.click();
		System.out.println("selected textbox2");	
		
		wb.until(ExpectedConditions.presenceOfElementLocated(By.id("txt2")));
		driver.findElement(By.id("txt2")).sendKeys("This is the text after clicking in the add textbox2");
		WebElement btn1=driver.findElement(By.id("btn1"));
		btn1.click();
//		driver.manage().timeouts().implicitlyWait(15,null);
		System.out.println("selected textbox1");
		wb.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
		driver.findElement(By.id("txt1")).sendKeys("This is the text after clicking in the add textbox1");
		driver.close();
		
		

	}

}
