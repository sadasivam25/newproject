package SampleJune2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	public void getDriver () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchURL(String data) {
		driver.get(data);
	}
	
	public void type (WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public void buttonclick(WebElement element) {
		element.click();
	}
	
	public void mouseHoverAction (WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	public void selectByVisibleText(WebElement element, String data) {
		Select se = new Select(element);
		se.selectByVisibleText(data);
	}
	
	public void enterTextByJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value',' "+ data +" ')", element);
	}
}
