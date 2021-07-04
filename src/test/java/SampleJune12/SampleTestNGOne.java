package SampleJune12;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNGOne {

	@BeforeClass
	private void beforeclass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	private void before() {
		System.out.println("Before Methods");
	}
	
	@Test
	private void tcc0() {
		System.out.println("test");
	}
	
	@AfterMethod
	private void after() {
		System.out.println("After Method");
	}
	
	@AfterClass
	private void afterclass() {
		System.out.println("After Class");
	}
}
