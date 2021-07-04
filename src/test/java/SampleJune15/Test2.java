package SampleJune15;

import org.testng.annotations.DataProvider;


public class Test2 extends BaseClass {
	
	@DataProvider(name="Data")
	public Object [] [] getData(){
		
		return new Object [] [] {{"Hello","Hi"},{"yes","No"},{"True","False"}};
	}
	
	@DataProvider(name="Data1")
	public Object [] [] getData1(){
		
		return new Object [] [] {{"Hello","Hi"},{"yes","No"},{"True","False"}};
	}
	
	
	
}
