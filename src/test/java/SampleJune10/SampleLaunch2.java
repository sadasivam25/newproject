package SampleJune10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SampleLaunch2 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static  void AfterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	@Ignore
	@Test
	public void test4() {
		System.out.println("Test4");
	}

}


