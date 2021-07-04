package SampleMay28;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TrailOne {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\welcoe\\eclipse-workspace\\MavenFirstProject\\ExcelData\\Framework.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("sheet1");
		Row row = sheet.getRow(4);
		Cell cell = row.getCell(0);
		
		String StringCellValue = cell.getStringCellValue();
		System.out.println(StringCellValue);
		
	
	}

}
