package seleniumChrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.findElement(By.id("alertBox")).click();
		if(ExpectedConditions.alertIsPresent()!=null) {
			Alert a = driver.switchTo().alert();
			String alertMsg = a.getText();
			System.out.println("The text in the alert box "+alertMsg);
			Assert.assertEquals(alertMsg, "I am an alert box!");
			a.accept();
			
		}
		driver.findElement(By.id("confirmBox")).click();
		if (ExpectedConditions.alertIsPresent()!=null) {
			Alert a = driver.switchTo().alert();
			String alertTxt=a.getText();
			System.out.println("The text in the alert box "+alertTxt);
			if((alertTxt=="Press a button!")){
				a.accept();
				

				}
			else {a.dismiss();}
		}
		driver.findElement(By.id("promptBox")).click();
		ExpectedConditions.alertIsPresent();
		Alert a = driver.switchTo().alert();
		String alertTxt=a.getText();
		System.out.println("the text in th promptbox"+alertTxt);
		a.sendKeys("This is the prompt box1");
		a.accept();
		driver.close();
		
		

	}

}
