package SampleJune18;

import org.testng.annotations.Test;

public class TrailTwo {

	@Test(groups ="@smoke")
	private void tc0() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("Method 0");
	}
	
	@Test(groups ="@smoke")
	private void tc1() {
		System.out.println("Method 1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups ="@reg", dependsOnGroups = "@smoke",alwaysRun= true)
	private void tc2() {
		System.out.println("Method 2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups ="@smoke")
	private void tc3() {
		System.out.println("Method 3");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups ="@reg", dependsOnGroups = "@smoke",alwaysRun= true)
	private void tc4() {
		System.out.println("Method 4");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups ="@reg",dependsOnGroups = "@smoke",alwaysRun= true)
	private void tc5() {
		System.out.println("Method 5");
		System.out.println(Thread.currentThread().getId());
	}
	
}
