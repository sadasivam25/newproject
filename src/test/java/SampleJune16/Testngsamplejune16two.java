package SampleJune16;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testngsamplejune16two {

		@Test()
		private void tc0() {
			
			String s = "abcdef";
			SoftAssert assert1 = new SoftAssert();
			assert1.assertEquals(s, "AbcDef");						
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
	}
		
		@Test
		private void tc1() {
			System.out.println("Test 1");
		}

}
