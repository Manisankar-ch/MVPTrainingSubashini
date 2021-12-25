package seleniumFirefox;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {
	@Test
	public void f() {
		System.out.println("I am in test anotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Im in before method:");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("m in after method");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Im in after suite");
		
	}
	@BeforeClass
	public void BeforeMethod() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Im in before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Im in afer test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Im in before suuite ");
	}
	

}
