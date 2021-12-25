package seleniumChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {
	@Test

	public static void openBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		driver.findElement(By.id("course")).click();
		WebElement dd_Ele = driver.findElement(By.id("course"));
		dd_Ele.click();
		Select ldd_Ele = new Select(dd_Ele);
		System.out.println("Available options:");
		List<WebElement> allOptions = ldd_Ele.getOptions();
		for (WebElement availableOptions:allOptions) {
			System.out.println(availableOptions.getText());
		}
		System.out.println("Selected options:");
		ldd_Ele.selectByIndex(1);
		List<WebElement> listdd = ldd_Ele.getAllSelectedOptions();
		for (WebElement webElement : listdd) {
			System.out.println(webElement.getText());
		}
		WebElement msdd=driver.findElement(By.id("ide"));
		msdd.click();
		Select msddl=new Select(msdd);
		System.out.println("Available options:");
		List<WebElement> listofelements = msddl.getOptions();
		for (WebElement webElement : listofelements) {
			System.out.println(webElement.getText());

		}
		System.out.println("Selected options:");
		msddl.selectByValue("vs");
		msddl.selectByVisibleText("Eclipse");
		List<WebElement> selected = msddl.getAllSelectedOptions();
		for (WebElement webElement : selected) {
			System.out.println(webElement.getText());
			
		}
		driver.close();

	}

}
