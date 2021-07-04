package SampleJune18;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrailOne {

	@Test(groups ="@smoke")
	private void tc0() {
		System.out.println("Method 0");
		Assert.assertTrue(false);
	}
	
	@Test(groups ="@smoke")
	private void tc1() {
		System.out.println("Method 1");
		
	}
	
	@Test(groups ="@reg", dependsOnGroups = "@smoke",alwaysRun= true)
	private void tc2() {
		System.out.println("Method 2");
	}
	
	@Test(groups ="@smoke")
	private void tc3() {
		System.out.println("Method 3");
	}
	
	@Test(groups ="@reg", dependsOnGroups = "@smoke",alwaysRun= true)
	private void tc4() {
		System.out.println("Method 4");
	}
	
	@Test(groups ="@reg",dependsOnGroups = "@smoke",alwaysRun= true)
	private void tc5() {
		System.out.println("Method 5");
	}
	
}
