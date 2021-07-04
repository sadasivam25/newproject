package SampleJune15;

import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	
	
	@Test(dataProvider="Data",dataProviderClass = Test2.class)
	private void tc0(String s, String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	
	
}
