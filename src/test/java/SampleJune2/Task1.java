package SampleJune2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\driver\\chromedriver.exe");
		File file = new File ("C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\ExcelData\\Framework.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet createSheet = workbook.createSheet("Amazon2"); 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement txtSearchBox = driver.findElement(By.id("twotabsearchtextbox"));	
		txtSearchBox.sendKeys("iphone",Keys.ENTER);
		List<WebElement> allproducts = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < allproducts.size(); i++) {
			String text = allproducts.get(i).getText();
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);	
			createCell.setCellValue(text);
		}
		
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);

	}

}
