package SampleMay27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		

	}

}
