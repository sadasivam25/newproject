package SampleJune8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TrailOne {
	
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
	}
	
	
}
