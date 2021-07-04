package SampleJune15;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TrailTwo extends BaseClass {
	
	@DataProvider(name="Data")
	public Object [] [] getData(){
		
		return new Object [] [] {{"Hello","Hi"},{"yes","No"},{"True","False"}};
	}
	
	@Test(dataProvider="Data")
	private void tc0(String s, String s1) {
		System.out.println(s);
		System.out.println(s1);
	}
	
	
}
