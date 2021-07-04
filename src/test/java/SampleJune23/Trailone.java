package SampleJune23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Trailone {
	
	@Test
	private void tc10() {
		System.out.println("Method 1");
	}
	
	@Test
	private void tc11() {
		System.out.println("Method 2");
	}
	
	@Test
	private void tc12() {
		System.out.println("Method 3");
	}
	
	@Test
	private void tc13() {
		System.out.println("Method 4");
	}
	
	@Test
	private void tc14() {
		Assert.assertTrue(false);
		System.out.println("Method 5");
	}

}
