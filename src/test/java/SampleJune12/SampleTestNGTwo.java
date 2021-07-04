package SampleJune12;

import org.testng.annotations.Test;

public class SampleTestNGTwo {

	@Test
	private void tc0() {
		System.out.println("Method 0");
	}

	@Test(priority = -3)
	private void tc1() {
		System.out.println("Method 1");
	}
	
	@Test(priority = -5)
	private void tc2() {
		System.out.println("Method 2");
	}
	
	@Test(priority = -10)
	private void tc3() {
		System.out.println("Method 3");
	}
	
	@Test(priority = 3)
	private void tc4() {
		System.out.println("Method 4");
	}
}
