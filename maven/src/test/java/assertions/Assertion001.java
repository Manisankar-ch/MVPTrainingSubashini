package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion001 {
	@Test(priority=3)
	public void testMethod1() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Assert.assertSame(obj1, obj2);
	}
	@Test(priority=4)
	public void testMethod2() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		Assert.assertSame(obj1, obj2);
	}
	@Test(priority=2)
	public void testMethod3(){
		String a = "mani";
		String b = "sankar";
		Assert.assertEquals(a, b);
	}
	@Test(priority=1)
	public void testMethod4(){
		String a = "mani";
		int b =10;
		Assert.assertEquals(a, b);
	}
	@Test()
	public void testMethod5(){
		Assert.assertFalse(10>20);
	}
	@Test
	public void testMethod6(){
		Assert.assertFalse(10<20);
	}
	@Test
	public void testMethod7(){
		Assert.assertFalse(10<20);
	}
	@Test
	public void testMethod8(){
		Assert.assertTrue(10>20);
	}
	@Test
	public void testMethod9(){
		Assert.assertTrue(10<20);
	}
	@Test
	public void testMethod10(){
		Assert.assertFalse(10>20);
	}@Test
	public void testMethod11(){
		Assert.assertNotEquals("mani","mani");
	}
		
}
