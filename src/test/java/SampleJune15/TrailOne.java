package SampleJune15;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TrailOne extends BaseClass {
	
	BaseClass baseclass;
	
	@BeforeClass
	public void beforeclass() {
		baseclass = new BaseClass();
		baseclass.getDriver();
		baseclass.launchURL("https://www.facebook.com/");
	}
	
	@BeforeMethod
	public void beforemethod() {
		Date date = new Date();
		System.out.println(date);
	}
	
	@Parameters({"username","password"})
	@Test
	private void tc0(String date,String date1) {
		WebElement txtusername = driver.findElement(By.id("email"));
		baseclass.type(txtusername, date);
		WebElement txtpass = driver.findElement(By.id("pass"));
		baseclass.type(txtpass, date1);
	}
	
	@Test
	private void tc1() {
		WebElement btnlogin = driver.findElement(By.name("login"));
		baseclass.buttonclick(btnlogin);
	}
	

}
