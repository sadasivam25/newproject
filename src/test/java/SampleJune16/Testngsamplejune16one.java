package SampleJune16;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngsamplejune16one {

		@Test()
		private void tc0() {
			
			String s = "abcdef";
			Assert.assertEquals(s, "AbcdEf");
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
