package seleniumChrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input"));
		search.sendKeys("selenium");
		Thread.sleep(2000);
	
        List<WebElement> autoSuggest = driver.findElements(By.xpath("//ul/li[@class='sbct']"));
      
        // print the auto suggest
        for (WebElement a : autoSuggest)
        {
        	System.out.println(a.getText());
        	if (a.getText().equalsIgnoreCase("selenium webdriver"))
        	{
        	a.click();
        	break;
        	}
        }
        driver.close();
	}
}
