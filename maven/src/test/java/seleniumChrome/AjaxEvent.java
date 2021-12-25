package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxEvent {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest 
	public void open() {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
	}
	@Test
	public void test_ajax() {
		By container = By.cssSelector(".container");
		wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(container));
		WebElement noTextEle=driver.findElement(By.className("radiobutton"));
		String textBefore = noTextEle.getText().trim();
		//clicking on the button
		driver.findElement(By.id("yes")).click();
		driver.findElement(By.id("buttoncheck")).click();
		WebElement txtEle=driver.findElement(By.className("radiobutton"));
		wait.until(ExpectedConditions.visibilityOf(txtEle));
		String textAfter =txtEle.getText().trim();
		Assert.assertNotEquals(textAfter, textBefore);
		System.out.println("Ajax performed");
		String expectedText = "Radio button is checked and it's value is Yes";
		Assert.assertEquals(textAfter, expectedText);
		}
	@AfterTest
	public void close() {
		driver.close();
	}

}
