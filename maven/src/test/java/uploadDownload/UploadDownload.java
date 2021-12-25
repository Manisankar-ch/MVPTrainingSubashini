package uploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://demo.guru99.com/test/upload/";
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\'uploadfile_0\']")).sendKeys("C:\\Users\\Omkar Swarna\\eclipse-workspace\\Myseleniumsessionclasses\\pom.xml");
		driver.findElement(By.xpath("//*[@id=\'terms\']")).click();
		driver.findElement(By.id("submitbutton")).click();
		driver.close();
		
		
	}

}
