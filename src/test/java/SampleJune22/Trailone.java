package SampleJune22;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trailone {
		public static WebDriver driver;
	
	
		@BeforeClass
		public static void beforeclass() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://en-gb.facebook.com/");
		}
		
		@Test
		public void tc01 () {
		WebElement txtuserName = driver.findElement(By.id("email"));
		txtuserName.sendKeys("Sadasivam");	
		String attribute = txtuserName.getAttribute("value");
		Assert.assertEquals("verify userName",attribute,"Sadasivam");
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("hello");	
		String attribute1 = txtpassword.getAttribute("value");
		Assert.assertEquals("verify password",attribute1,"hello");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		boolean enabled = btnLogin.isEnabled();
		Assert.assertTrue("Login Button verification",enabled);
		btnLogin.click();
		}

}
