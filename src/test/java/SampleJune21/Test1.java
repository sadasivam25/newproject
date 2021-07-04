package SampleJune21;

import org.testng.annotations.Test;

public class Test1 {

	@Test
	private void tc0() {
		System.out.println("test 0");
		System.out.println("Test1 class thread:" + Thread.currentThread().getId() );
		
	}
	
	@Test
	private void tc1() {
		System.out.println("test 1");
		System.out.println("Test1 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc2() {
		System.out.println("test 2");
		System.out.println("Test1 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc3() {
		System.out.println("test 3");
		System.out.println("Test1 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc4() {
		System.out.println("test 4");
		System.out.println("Test1 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc5() {
		System.out.println("test 5");
		System.out.println("Test1 class thread:" + Thread.currentThread().getId() );
	}
	
}
