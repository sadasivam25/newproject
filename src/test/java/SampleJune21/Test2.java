package SampleJune21;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	private void tc10() {
		System.out.println("test 10");
		System.out.println("Test2 class thread:" + Thread.currentThread().getId() );
		
	}
	
	@Test
	private void tc11() {
		System.out.println("test 11");
		System.out.println("Test2 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc12() {
		System.out.println("test 12");
		System.out.println("Test2 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc13() {
		System.out.println("test 13");
		System.out.println("Test2 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc14() {
		System.out.println("test 14");
		System.out.println("Test2 class thread:" + Thread.currentThread().getId() );
	}
	
	@Test
	private void tc15() {
		System.out.println("test 15");
		System.out.println("Test2 class thread:" + Thread.currentThread().getId() );
	}
	
}
