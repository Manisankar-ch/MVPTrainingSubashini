package seleniumChrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		Actions builder = new Actions(driver);
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		builder.dragAndDrop(from, to).build().perform();
		driver.findElement(By.id("droppableExample-tab-accept")).click();
		Thread.sleep(4000);
//		driver.switchTo().window()
		WebElement source=driver.findElement(By.id("acceptable"));
		WebElement back=driver.findElement(By.id("notAcceptable"));
		WebElement target=driver.findElement(By.xpath("(//*[@id=\'droppable\'])[2]"));
		String textTo = target.getText();
		System.out.println("Before element dropped");
		builder.dragAndDrop(source, target).build().perform();
		System.out.println("Element Dropped");
		Thread.sleep(2000);
		if (textTo.equals("Dropped!")) {
			System.out.println("item was correct");
		}
		else {
			System.out.println("Not a correct one");
		}
		

	}
}
