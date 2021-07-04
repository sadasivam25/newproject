package SampleJune14;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Trail4 {

	@Parameters({"username","password"})
	@Test
	private void tc10 ( @Optional("sivasada") String s , String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	
	@Test
	private void tc11() {
		System.out.println("test 11");
	}
	
	@Test
	private void tc12() {
		System.out.println("test 12");
	}
	
	@Test
	private void tc13() {
		System.out.println("test 13");
	}
	
	@Test
	private void tc14() {
		System.out.println("test 14");
	}
	
}
