package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Manisankar\\Browsers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath="]/td[";
		String end="]";
		for(int j=1;j<4;j++) {
			System.out.println("**********************");
			System.out.println("Fetch the"+j+" coloumn");
			
			
			for(int i=2;i<7;i++) {
				String xpath = beforexpath+i+afterxpath+j+end;
				
				WebElement Col = driver.findElement(By.xpath(xpath));
				
				System.out.println(Col.getText());
			}
		}


	}

}
