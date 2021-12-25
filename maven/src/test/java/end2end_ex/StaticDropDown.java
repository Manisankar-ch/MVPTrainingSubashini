package end2end_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[1]")).click();
		//xpath for from
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div/div[2]/div/div/div[2]/div[4]")).click();
//		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-6koalj.r-18u37iz")).click();
		driver.findElement(By.cssSelector("div.div.css-1dbjc4n.r-6koalj.r-18u37iz")).click();
	}

}
