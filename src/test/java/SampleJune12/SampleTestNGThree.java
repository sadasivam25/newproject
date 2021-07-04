package SampleJune12;

import org.testng.annotations.Test;

public class SampleTestNGThree {

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
	
	@Test(invocationCount = 10)
	private void tc3() {
		System.out.println("Method 3");
	}
	
	@Test(enabled = false)
//@Test(enabled = true)
	private void tc4() {
		System.out.println("Method 4");
	}
}
