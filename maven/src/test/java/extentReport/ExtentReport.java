package extentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	static ExtentTest test;
	static ExtentReports report;
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@BeforeClass
		public static void startTest()
		{
		report = new ExtentReports(System.getProperty("user.dir")+"/RelevanceCodeextent-reports/Relevancesnapshots/"+"ExtentReportResults.html");
		test = report.startTest("ExtentDemo Title page goes here");
		}
		@Test
		public void extentReportsDemo( ) throws InterruptedException, IOException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\git\\PracticeDemo\\MavenDemSelArtifact\\src\\test\\resources\\driver\\chromedriver.exe");
			driver=new ChromeDriver();//Launch the Chrome Browser
			Thread.sleep(5000);
			System.out.println("Browser launched");
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		if(driver.getTitle().equals("Googlesss"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		TakesScreenshot snapshot=(TakesScreenshot)driver;
		  File src=snapshot.getScreenshotAs(OutputType.FILE);
		  String path=System.getProperty("user.dir") +"/RelevanceCodeextent-reports/Relevancesnapshots/snap1.png";
		  FileUtils.copyFile(src, new File(path));
		  test.addScreenCapture(path);
		  
		  
		}
		}
		@AfterClass
		public static void endTest()
		{
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
