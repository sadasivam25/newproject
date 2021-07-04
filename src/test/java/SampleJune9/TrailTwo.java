package SampleJune9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TrailTwo {
	
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
		String s = "abcd";
		System.out.println(s);
		
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@Ignore
	@Test
	public void test4() {
		System.out.println("Test4");
	}


}
