package SampleJune2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleOne extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass baseclass= new BaseClass();
		baseclass.getDriver();
		baseclass.launchURL("https://en-gb.facebook.com/");
		WebElement txtuserName = driver.findElement(By.id("email"));
		baseclass.type(txtuserName, "sadasivam");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		baseclass.type(txtpassword, "siva");
		WebElement btnclick = driver.findElement(By.name("login"));
		baseclass.buttonclick(btnclick);
		

	}

}
