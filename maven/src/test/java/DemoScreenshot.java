import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		capture(driver,"First");
		driver.get("http://spicejet.com");
		Thread.sleep(4000);
		capture(driver,"After");
		

	}
	public static void capture(WebDriver driver,String name) throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("E:\\Manisankar\\ScreenShot\\"+name+".png"));
	}

}
