package SampleJune2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("karthi007");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Karthi@1989");
		
		WebElement log = driver.findElement(By.id("login"));
		log.click();
	
		WebElement booking1 = driver.findElement(By.id("location"));
		Select book = new Select(booking1);
		book.selectByValue("Melbourne");
		
		WebElement booking2 = driver.findElement(By.id("hotels"));
		Select hotel = new Select(booking2);
		hotel.selectByValue("Hotel Sunshine");
		
		WebElement booking3 = driver.findElement(By.id("room_type"));
		Select room = new Select(booking3);
		room.selectByValue("Super Deluxe");
		
		WebElement findElement = driver.findElement(By.id("room_nos"));
		Select ss = new Select(findElement);
		
		WebElement dt = driver.findElement(By.id("datepick_in"));
		dt.sendKeys("06/06/2021");
		
		WebElement dt1 = driver.findElement(By.id("datepick_out"));
		dt1.sendKeys("10/06/2021");
		
		WebElement roo = driver.findElement(By.id("adult_room"));
		Select r = new Select(roo);
		r.selectByValue("2");
		
		WebElement roo1 = driver.findElement(By.id("child_room"));
		Select r1 = new Select(roo1);
		r1.selectByValue("1");
		
		WebElement btnlogin = driver.findElement(By.id("Submit"));
		btnlogin.click();
		
		WebElement rad = driver.findElement(By.id("radiobutton_0"));
		rad.click();
		
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
		driver.findElement(By.id("first_name")).sendKeys("Sadasivam");
		driver.findElement(By.id("last_name")).sendKeys("R");
		driver.findElement(By.id("address")).sendKeys("India");
		driver.findElement(By.id("cc_num")).sendKeys("7483748234872263");
		
		WebElement cc2 = driver.findElement(By.id("cc_type"));
		Select card = new Select(cc2);
		card.selectByValue("VISA");
		
		WebElement e = driver.findElement(By.id("cc_exp_month"));
		Select e1 = new Select(e);
		e1.selectByValue("7");
		
		WebElement ee = driver.findElement(By.id("cc_exp_year"));
		Select e2 = new Select(ee);
		e2.selectByValue("2020");
		
		WebElement cc = driver.findElement(By.id("cc_cvv"));
		cc.sendKeys("12345");
		
		WebElement boo = driver.findElement(By.id("book_now"));
		boo.click();
		
		Thread.sleep(7000);
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"order_no\"]")).getAttribute("value"));
		
		

	}

}
