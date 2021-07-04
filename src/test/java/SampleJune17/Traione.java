package SampleJune17;

import org.testng.annotations.Test;

public class Traione {

	@Test(groups ="@Retest")
	private void tc0() {
		System.out.println("Method 0");
	}
	
	@Test(groups ="@sanity")
	private void tc1() {
		System.out.println("Method 1");
		
	}
	
	@Test(groups ="@reg")
	private void tc2() {
		System.out.println("Method 2");
	}
	
	@Test(groups ="@smoke")
	private void tc3() {
		System.out.println("Method 3");
	}
	
	@Test(groups ="@E2E")
	private void tc4() {
		System.out.println("Method 4");
	}
	
	@Test(groups ="@smoke")
	private void tc5() {
		System.out.println("Method 5");
	}
	
}
